package logic;

import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Zoom {
    private JTextArea textArea;

    public Zoom(JTextArea textArea) {
        this.textArea = textArea;
    }

   
    public void zoomInActionPerformed(ActionEvent evt) {
        Font currentFont = textArea.getFont();
        int newSize = currentFont.getSize() + 2;
        Font newFont = new Font(currentFont.getName(), currentFont.getStyle(), newSize);
        textArea.setFont(newFont);
    }

    
    public void zoomOutActionPerformed(ActionEvent evt) {
        Font currentFont = textArea.getFont();
        int newSize = currentFont.getSize() - 2;
        if (newSize > 0) {
            Font newFont = new Font(currentFont.getName(), currentFont.getStyle(), newSize);
            textArea.setFont(newFont);
        }
    }
}
