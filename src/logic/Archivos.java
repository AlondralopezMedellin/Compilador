
package logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;

public class Archivos {
     private File ficheroActual;
    private JTextArea textArea;

    public Archivos(JTextArea textArea) {
        this.textArea = textArea;
    }

    public void nuevoArchivo() {
        textArea.setText("");
        ficheroActual = null;
    }

    public void abrirArchivo() {
        JFileChooser fc = new JFileChooser();
        fc.setMultiSelectionEnabled(false);
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int seleccion = fc.showOpenDialog(null);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            ficheroActual = fc.getSelectedFile();
            try (FileReader fr = new FileReader(ficheroActual)) {
                StringBuilder contenido = new StringBuilder();
                int valor;
                while ((valor = fr.read()) != -1) {
                    contenido.append((char) valor);
                }
                textArea.setText(contenido.toString());
            } catch (FileNotFoundException ex) {
                System.out.println("Archivo no encontrado: " + ex.getMessage());
            } catch (IOException ex) {
                System.out.println("Error de lectura: " + ex.getMessage());
            }
        }
    }

    public void guardarArchivo() {
        if (ficheroActual == null) {
            guardarComo();
        } else {
            escribirFichero();
        }
    }

    public void guardarComo() {
        JFileChooser fc = new JFileChooser();
        fc.setMultiSelectionEnabled(false);
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int seleccion = fc.showSaveDialog(null);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            ficheroActual = fc.getSelectedFile();
            escribirFichero();
        }
    }

    private void escribirFichero() {
        try (FileWriter fv = new FileWriter(ficheroActual)) {
            fv.write(textArea.getText());
        } catch (IOException ex) {
            System.out.println("Error al guardar archivo: " + ex.getMessage());
        }
    }
}
