package pers.dozenlee.notepad.test;

import pers.dozenlee.notepad.gui.NotepadPageSettingWindow;

/**
 * @author DozenPrince Li
 * @date 2022/4/1
 */
public class PageSettingWindowTest {

    public static void main(String[] args) {
        NotepadPageSettingWindow dialog = new NotepadPageSettingWindow();
        dialog.init();
        dialog.setVisible(true);
    }
}
