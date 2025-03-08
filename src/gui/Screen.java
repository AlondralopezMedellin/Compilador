package gui;

import logic.Archivos;
import logic.NumeroLinea;

/*
 * @author Alondra
 * @author Daniel
 * @author Many
 */

public class Screen extends javax.swing.JFrame {

    NumeroLinea obn;
    private Archivos archivos;
    public Screen() {
        initComponents();
        archivos = new Archivos(textArea);
        obn = new NumeroLinea(textArea);
        textScrollPane.setRowHeaderView(obn);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolBarPanel = new javax.swing.JPanel();
        toolBar = new javax.swing.JToolBar();
        toolBarSeparator1 = new javax.swing.JToolBar.Separator();
        toolBarFiller1 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        toolBarNewFile = new javax.swing.JButton();
        toolBarFiller2 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        toolBarSave = new javax.swing.JButton();
        toolBarFiller3 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        toolBarSeparator2 = new javax.swing.JToolBar.Separator();
        toolBarFiller4 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        toolBarUndo = new javax.swing.JButton();
        toolBarFiller5 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        toolBarRedo = new javax.swing.JButton();
        toolBarFiller6 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        toolBarSeparator3 = new javax.swing.JToolBar.Separator();
        toolBarFiller7 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        toolBarRunProject = new javax.swing.JButton();
        textPanel = new javax.swing.JPanel();
        textScrollPane = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        lexicalPanel = new javax.swing.JPanel();
        lexicalScrollPane = new javax.swing.JScrollPane();
        lexicalTextArea = new javax.swing.JTextArea();
        syntacticPanel = new javax.swing.JPanel();
        syntacticScrollPane = new javax.swing.JScrollPane();
        syntacticTextArea = new javax.swing.JTextArea();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newFile = new javax.swing.JMenuItem();
        fileSeparator1 = new javax.swing.JPopupMenu.Separator();
        openFile = new javax.swing.JMenuItem();
        fileSeparator2 = new javax.swing.JPopupMenu.Separator();
        save = new javax.swing.JMenuItem();
        saveAs = new javax.swing.JMenuItem();
        fileSeparator3 = new javax.swing.JPopupMenu.Separator();
        exit = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        undo = new javax.swing.JMenuItem();
        redo = new javax.swing.JMenuItem();
        editSeparator1 = new javax.swing.JPopupMenu.Separator();
        cut = new javax.swing.JMenuItem();
        copy = new javax.swing.JMenuItem();
        paste = new javax.swing.JMenuItem();
        delete = new javax.swing.JMenuItem();
        viewMenu = new javax.swing.JMenu();
        zoomIn = new javax.swing.JMenuItem();
        zoomOut = new javax.swing.JMenuItem();
        runMenu = new javax.swing.JMenu();
        runProject = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        toolBar.setRollover(true);
        toolBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        toolBar.add(toolBarSeparator1);
        toolBar.add(toolBarFiller1);

        toolBarNewFile.setBackground(new java.awt.Color(242, 242, 242));
        toolBarNewFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/toolBar-icons/new-file.png"))); // NOI18N
        toolBarNewFile.setFocusable(false);
        toolBarNewFile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toolBarNewFile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBarNewFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolBarNewFileActionPerformed(evt);
            }
        });
        toolBar.add(toolBarNewFile);
        toolBar.add(toolBarFiller2);

        toolBarSave.setBackground(new java.awt.Color(242, 242, 242));
        toolBarSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/toolBar-icons/save.png"))); // NOI18N
        toolBarSave.setFocusable(false);
        toolBarSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toolBarSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBarSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolBarSaveActionPerformed(evt);
            }
        });
        toolBar.add(toolBarSave);
        toolBar.add(toolBarFiller3);
        toolBar.add(toolBarSeparator2);
        toolBar.add(toolBarFiller4);

        toolBarUndo.setBackground(new java.awt.Color(242, 242, 242));
        toolBarUndo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/toolBar-icons/undo.png"))); // NOI18N
        toolBarUndo.setFocusable(false);
        toolBarUndo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toolBarUndo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(toolBarUndo);
        toolBar.add(toolBarFiller5);

        toolBarRedo.setBackground(new java.awt.Color(242, 242, 242));
        toolBarRedo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/toolBar-icons/redo.png"))); // NOI18N
        toolBarRedo.setFocusable(false);
        toolBarRedo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toolBarRedo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBarRedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolBarRedoActionPerformed(evt);
            }
        });
        toolBar.add(toolBarRedo);
        toolBar.add(toolBarFiller6);
        toolBar.add(toolBarSeparator3);
        toolBar.add(toolBarFiller7);

        toolBarRunProject.setBackground(new java.awt.Color(242, 242, 242));
        toolBarRunProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/toolBar-icons/run.png"))); // NOI18N
        toolBarRunProject.setFocusable(false);
        toolBarRunProject.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toolBarRunProject.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBarRunProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolBarRunProjectActionPerformed(evt);
            }
        });
        toolBar.add(toolBarRunProject);

        javax.swing.GroupLayout toolBarPanelLayout = new javax.swing.GroupLayout(toolBarPanel);
        toolBarPanel.setLayout(toolBarPanelLayout);
        toolBarPanelLayout.setHorizontalGroup(
            toolBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        toolBarPanelLayout.setVerticalGroup(
            toolBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        textArea.setColumns(20);
        textArea.setRows(5);
        textScrollPane.setViewportView(textArea);

        javax.swing.GroupLayout textPanelLayout = new javax.swing.GroupLayout(textPanel);
        textPanel.setLayout(textPanelLayout);
        textPanelLayout.setHorizontalGroup(
            textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
        );
        textPanelLayout.setVerticalGroup(
            textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );

        lexicalTextArea.setColumns(20);
        lexicalTextArea.setRows(5);
        lexicalScrollPane.setViewportView(lexicalTextArea);

        javax.swing.GroupLayout lexicalPanelLayout = new javax.swing.GroupLayout(lexicalPanel);
        lexicalPanel.setLayout(lexicalPanelLayout);
        lexicalPanelLayout.setHorizontalGroup(
            lexicalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lexicalScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
        );
        lexicalPanelLayout.setVerticalGroup(
            lexicalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lexicalScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        syntacticTextArea.setColumns(20);
        syntacticTextArea.setRows(5);
        syntacticScrollPane.setViewportView(syntacticTextArea);

        javax.swing.GroupLayout syntacticPanelLayout = new javax.swing.GroupLayout(syntacticPanel);
        syntacticPanel.setLayout(syntacticPanelLayout);
        syntacticPanelLayout.setHorizontalGroup(
            syntacticPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(syntacticScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
        );
        syntacticPanelLayout.setVerticalGroup(
            syntacticPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(syntacticScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        fileMenu.setText("File");

        newFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        newFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/menuBar-icons/new-file.png"))); // NOI18N
        newFile.setText("New File...");
        newFile.setPreferredSize(new java.awt.Dimension(130, 22));
        newFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileActionPerformed(evt);
            }
        });
        fileMenu.add(newFile);
        fileMenu.add(fileSeparator1);

        openFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/menuBar-icons/open-file.png"))); // NOI18N
        openFile.setText("Open File...");
        openFile.setPreferredSize(new java.awt.Dimension(200, 22));
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });
        fileMenu.add(openFile);
        fileMenu.add(fileSeparator2);

        save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/menuBar-icons/save.png"))); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        fileMenu.add(save);

        saveAs.setText("Save As...");
        saveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsActionPerformed(evt);
            }
        });
        fileMenu.add(saveAs);
        fileMenu.add(fileSeparator3);

        exit.setText("Exit");
        fileMenu.add(exit);

        menuBar.add(fileMenu);

        editMenu.setText("Edit");

        undo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        undo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/menuBar-icons/undo.png"))); // NOI18N
        undo.setText("Undo");
        undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoActionPerformed(evt);
            }
        });
        editMenu.add(undo);

        redo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        redo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/menuBar-icons/redo.png"))); // NOI18N
        redo.setText("Redo");
        editMenu.add(redo);
        editMenu.add(editSeparator1);

        cut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/menuBar-icons/cut.png"))); // NOI18N
        cut.setText("Cut");
        cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutActionPerformed(evt);
            }
        });
        editMenu.add(cut);

        copy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        copy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/menuBar-icons/copy.png"))); // NOI18N
        copy.setText("Copy");
        editMenu.add(copy);

        paste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        paste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/menuBar-icons/paste.png"))); // NOI18N
        paste.setText("Paste");
        editMenu.add(paste);

        delete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/menuBar-icons/delete.png"))); // NOI18N
        delete.setText("Delete");
        editMenu.add(delete);

        menuBar.add(editMenu);

        viewMenu.setText("View");

        zoomIn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_PLUS, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        zoomIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/menuBar-icons/zoom-in.png"))); // NOI18N
        zoomIn.setText("Zoom In");
        viewMenu.add(zoomIn);

        zoomOut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_MINUS, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        zoomOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/menuBar-icons/zoom-out.png"))); // NOI18N
        zoomOut.setText("Zoom Out");
        zoomOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoomOutActionPerformed(evt);
            }
        });
        viewMenu.add(zoomOut);

        menuBar.add(viewMenu);

        runMenu.setText("Run");

        runProject.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        runProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/menuBar-icons/run.png"))); // NOI18N
        runProject.setText("Run Project");
        runMenu.add(runProject);

        menuBar.add(runMenu);

        helpMenu.setText("Help");

        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/menuBar-icons/about.png"))); // NOI18N
        about.setText("About...");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        helpMenu.add(about);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(syntacticPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lexicalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(toolBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lexicalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(syntacticPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        archivos.guardarArchivo();
    }//GEN-LAST:event_saveActionPerformed

    private void undoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_undoActionPerformed

    private void zoomOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zoomOutActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutActionPerformed

    private void newFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileActionPerformed
        archivos.nuevoArchivo();
    }//GEN-LAST:event_newFileActionPerformed

    private void toolBarSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolBarSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toolBarSaveActionPerformed

    private void toolBarNewFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolBarNewFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toolBarNewFileActionPerformed

    private void toolBarRedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolBarRedoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toolBarRedoActionPerformed

    private void toolBarRunProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolBarRunProjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toolBarRunProjectActionPerformed

    private void cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cutActionPerformed

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
        archivos.abrirArchivo();
    }//GEN-LAST:event_openFileActionPerformed

    private void saveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsActionPerformed
        archivos.guardarComo();
    }//GEN-LAST:event_saveAsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem about;
    private javax.swing.JMenuItem copy;
    private javax.swing.JMenuItem cut;
    private javax.swing.JMenuItem delete;
    private javax.swing.JMenu editMenu;
    private javax.swing.JPopupMenu.Separator editSeparator1;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JPopupMenu.Separator fileSeparator1;
    private javax.swing.JPopupMenu.Separator fileSeparator2;
    private javax.swing.JPopupMenu.Separator fileSeparator3;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JPanel lexicalPanel;
    private javax.swing.JScrollPane lexicalScrollPane;
    private javax.swing.JTextArea lexicalTextArea;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem newFile;
    private javax.swing.JMenuItem openFile;
    private javax.swing.JMenuItem paste;
    private javax.swing.JMenuItem redo;
    private javax.swing.JMenu runMenu;
    private javax.swing.JMenuItem runProject;
    private javax.swing.JMenuItem save;
    private javax.swing.JMenuItem saveAs;
    private javax.swing.JPanel syntacticPanel;
    private javax.swing.JScrollPane syntacticScrollPane;
    private javax.swing.JTextArea syntacticTextArea;
    private javax.swing.JTextArea textArea;
    private javax.swing.JPanel textPanel;
    private javax.swing.JScrollPane textScrollPane;
    private javax.swing.JToolBar toolBar;
    private javax.swing.Box.Filler toolBarFiller1;
    private javax.swing.Box.Filler toolBarFiller2;
    private javax.swing.Box.Filler toolBarFiller3;
    private javax.swing.Box.Filler toolBarFiller4;
    private javax.swing.Box.Filler toolBarFiller5;
    private javax.swing.Box.Filler toolBarFiller6;
    private javax.swing.Box.Filler toolBarFiller7;
    private javax.swing.JButton toolBarNewFile;
    private javax.swing.JPanel toolBarPanel;
    private javax.swing.JButton toolBarRedo;
    private javax.swing.JButton toolBarRunProject;
    private javax.swing.JButton toolBarSave;
    private javax.swing.JToolBar.Separator toolBarSeparator1;
    private javax.swing.JToolBar.Separator toolBarSeparator2;
    private javax.swing.JToolBar.Separator toolBarSeparator3;
    private javax.swing.JButton toolBarUndo;
    private javax.swing.JMenuItem undo;
    private javax.swing.JMenu viewMenu;
    private javax.swing.JMenuItem zoomIn;
    private javax.swing.JMenuItem zoomOut;
    // End of variables declaration//GEN-END:variables
}
