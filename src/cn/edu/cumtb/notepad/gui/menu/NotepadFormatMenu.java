package pers.dozenlee.notepad.gui.menu;

import pers.dozenlee.notepad.gui.NotepadConsts;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * @author DozenPrince Li
 * @date 2022/3/28
 */
public class NotepadFormatMenu extends JMenu {

    /* Mnemonics */

    private static final int FORMAT_MENU_MNEMONIC = KeyEvent.VK_O;
    private static final int AUTO_LINE_MNEMONIC = KeyEvent.VK_W;
    private static final int FONT_MNEMONIC = KeyEvent.VK_F;

    /* Menu Item */

    /**
     * <b>格式/自动换行</b> - 切换是否自动换行<br>
     * <b>Mnemonic</b> - W
     */
    public JMenuItem autoLine = new JMenuItem("自动换行");

    /**
     * <b>格式/字体</b> - 弹出字体窗口<br>
     * <b>Mnemonic</b> - F
     */
    public JMenuItem font = new JMenuItem("字体");

    public NotepadFormatMenu() {
        setText("格式");
        setFont(NotepadConsts.GENERAL_FONT);

        add(autoLine);
        add(font);
    }

    public void init() {
        setMnemonic(FORMAT_MENU_MNEMONIC);
        autoLine.setMnemonic(AUTO_LINE_MNEMONIC);
        font.setMnemonic(FONT_MNEMONIC);
    }
}
