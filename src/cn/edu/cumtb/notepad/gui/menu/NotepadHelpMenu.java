package pers.dozenlee.notepad.gui.menu;

import pers.dozenlee.notepad.gui.NotepadConsts;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * @author DozenPrince Li
 * @date 2022/3/28
 */
public class NotepadHelpMenu extends JMenu {

    /* Mnemonics */

    private static final int HELP_MENU_MNEMONIC = KeyEvent.VK_H;
    private static final int VIEW_HELP_MNEMONIC = KeyEvent.VK_H;
    private static final int SEND_FEEDBACK_MNEMONIC = KeyEvent.VK_F;
    private static final int ABOUT_NOTEPAD_MNEMONIC = KeyEvent.VK_A;

    /* Menu Item */

    /**
     * <b>帮助/查看帮助</b> - 使用默认浏览器打开帮助页面<br>
     * <b>Mnemonic</b> - H
     */
    public JMenuItem viewHelp = new JMenuItem("查看帮助");

    /**
     * <b>帮助/发送反馈</b> - 使用默认浏览器打开反馈页面<br>
     * <b>Mnemonic</b> - F
     */
    public JMenuItem sendFeedback = new JMenuItem("发送反馈");

    /**
     * <b>帮助/关于记事本</b> - 弹出关于记事本窗口<br>
     * <b>Mnemonic</b> - A
     */
    public JMenuItem aboutNotepad = new JMenuItem("关于记事本");

    public NotepadHelpMenu() {
        setText("帮助");
        setFont(NotepadConsts.GENERAL_FONT);

        add(viewHelp);
        add(sendFeedback);
        addSeparator();
        add(aboutNotepad);
    }

    public void init() {
        setMnemonic(HELP_MENU_MNEMONIC);
        viewHelp.setMnemonic(VIEW_HELP_MNEMONIC);
        sendFeedback.setMnemonic(SEND_FEEDBACK_MNEMONIC);
        aboutNotepad.setMnemonic(ABOUT_NOTEPAD_MNEMONIC);
    }
}
