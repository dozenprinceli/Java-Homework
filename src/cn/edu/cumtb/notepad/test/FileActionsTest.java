package pers.dozenlee.notepad.test;

import pers.dozenlee.notepad.gui.NotepadPageSettingWindow;
import pers.dozenlee.notepad.gui.NotepadPrintWindow;
import pers.dozenlee.notepad.gui.action.NotepadFileActions;
import pers.dozenlee.notepad.gui.menu.NotepadFileMenu;

import javax.swing.*;
import java.io.IOException;

/**
 * @author DozenPrince Li
 * @date 2022/4/2
 */
public class FileActionsTest {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JMenuBar menuBar = new JMenuBar();
        JTextArea textArea = new JTextArea();

        NotepadFileMenu fileMenu = new NotepadFileMenu();
        fileMenu.init();
        fileMenu.newFile.addActionListener(e -> {
            try {
                NotepadFileActions.newFileAction(textArea);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        fileMenu.newWindow.addActionListener(e -> NotepadFileActions.newWindowAction());
        fileMenu.open.addActionListener(e -> {
            try {
                NotepadFileActions.openFileAction(textArea);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        fileMenu.save.addActionListener(e -> {
            try {
                NotepadFileActions.saveFileAction(textArea);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        fileMenu.saveAs.addActionListener(e -> {
            try {
                NotepadFileActions.saveFileAction(textArea);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        fileMenu.setting.addActionListener(e -> new NotepadPageSettingWindow().init());
        fileMenu.print.addActionListener(e -> new NotepadPrintWindow());
        fileMenu.exit.addActionListener(e -> frame.dispose());

        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
        frame.add(textArea);
        frame.pack();
        frame.setVisible(true);
    }
}
