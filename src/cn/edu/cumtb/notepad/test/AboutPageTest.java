package pers.dozenlee.notepad.test;

import pers.dozenlee.notepad.gui.action.NotepadHelpActions;

import javax.swing.*;

/**
 * @author DozenPrince Li
 * @date 2022/3/30
 */
public class AboutPageTest {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("a");
        JMenuItem menuItem = new JMenuItem("a");
        menu.add(menuItem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        NotepadHelpActions.showAboutPageAction(menuItem);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
