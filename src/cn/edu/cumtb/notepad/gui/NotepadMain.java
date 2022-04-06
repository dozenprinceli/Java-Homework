package pers.dozenlee.notepad.gui;

import pers.dozenlee.notepad.gui.action.NotepadFileActions;

/**
 * @author DozenPrince Li
 * @date 2022/3/28
 */
public class NotepadMain {

    public static void main(String[] args) {
        try {
            NotepadFileActions.newWindowAction();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
