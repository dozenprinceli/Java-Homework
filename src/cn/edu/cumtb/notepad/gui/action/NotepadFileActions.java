package pers.dozenlee.notepad.gui.action;

import org.jetbrains.annotations.NotNull;
import pers.dozenlee.notepad.gui.NotepadMainWindow;
import pers.dozenlee.notepad.gui.NotepadUtil;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.IOException;

/**
 * @author DozenPrince Li
 * @date 2022/3/30
 */
public class NotepadFileActions {

    private NotepadFileActions() {}

    public static void newFileAction(JTextArea textArea) throws IOException {
        NotepadUtil.resetTextAreaBySave(textArea);
        textArea.setText("\0");
    }

    public static void newWindowAction() {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ignored) {}

            NotepadMainWindow mainWindow = new NotepadMainWindow();
            mainWindow.init();
            mainWindow.setVisible(true);

        });
    }

    public static void openFileAction(@NotNull JTextArea textArea) throws IOException {
        NotepadUtil.resetTextAreaBySave(textArea);

        JFileChooser openFileChooser = new JFileChooser(new File("."), FileSystemView.getFileSystemView());
        int response = openFileChooser.showOpenDialog(null);
        if (response == JFileChooser.APPROVE_OPTION) {
            File openFile = openFileChooser.getSelectedFile();
            String filePath = openFile.getAbsolutePath();
            textArea.setText(NotepadUtil.fileToString(filePath));
        }
    }

    public static void saveFileAction(@NotNull JTextArea textArea) throws IOException {
        JFileChooser saveFileChooser = new JFileChooser(new File("."), FileSystemView.getFileSystemView());
        int response = saveFileChooser.showSaveDialog(null);
        if (response == JFileChooser.APPROVE_OPTION) {
            NotepadUtil.stringToFile(saveFileChooser.getSelectedFile().getAbsolutePath(), textArea);
        }
    }
}
