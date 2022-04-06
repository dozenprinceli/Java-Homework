package pers.dozenlee.notepad.test;

import pers.dozenlee.notepad.gui.action.NotepadHelpActions;

import javax.swing.*;

/**
 * @author DozenPrince Li
 * @date 2022/3/31
 */
public class HelpActionsTest {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("a");
        JMenuItem menuItem = new JMenuItem("a");
        menu.add(menuItem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        menuItem.addActionListener(e -> {
            if (e.getSource() == menuItem) {
                NotepadHelpActions.openURLAction(NotepadHelpActions.VIEW_HELP_URL);
            }
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}