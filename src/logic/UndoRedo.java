package logic;

import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;
import javax.swing.undo.UndoableEdit;

public class UndoRedo {
    private JTextArea textArea;
    private UndoManager undoManager;

    public UndoRedo(JTextArea textArea) {
        this.textArea = textArea;
        this.undoManager = new UndoManager();

        // Agregar un listener para manejar eventos de edición
        textArea.getDocument().addUndoableEditListener(new UndoableEditListener() {
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                undoManager.addEdit(new CustomUndoableEdit(e.getEdit()));
            }
        });
    }

    public void Undo(ActionEvent evt) {
        if (undoManager.canUndo()) {
            undoManager.undo();
        }
    }

    public void Redo(ActionEvent evt) {
        if (undoManager.canRedo()) {
            undoManager.redo();
        }
    }

    private class CustomUndoableEdit extends AbstractUndoableEdit {
        private UndoableEdit edit;
        private String beforeChange;
        private String afterChange;

        public CustomUndoableEdit(UndoableEdit edit) {
            this.edit = edit;
            try {
                edit.undo();
                beforeChange = textArea.getText();
                edit.redo();
                afterChange = textArea.getText();
            } catch (CannotUndoException | CannotRedoException ex) {
                ex.printStackTrace();
            }
        }

        @Override
        public void undo() throws CannotUndoException {
            super.undo();
            edit.undo();
            String currentText = textArea.getText();
            int lastSpaceIndex = findLastSpaceOrNewlineIndex(currentText, beforeChange);
            textArea.setText(currentText.substring(0, lastSpaceIndex));
        }

        @Override
        public void redo() throws CannotRedoException {
            super.redo();
            edit.redo();
            String currentText = textArea.getText();
            int lastSpaceIndex = findLastSpaceOrNewlineIndex(currentText, afterChange);
            textArea.setText(currentText.substring(0, lastSpaceIndex));
        }

        private int findLastSpaceOrNewlineIndex(String text, String reference) {
            int length = Math.min(text.length(), reference.length());
            for (int i = length - 1; i >= 0; i--) {
                if (Character.isWhitespace(text.charAt(i)) || text.charAt(i) == '\n') {
                    return i + 1;
                }
            }
            return 0;
        }
    }
}
