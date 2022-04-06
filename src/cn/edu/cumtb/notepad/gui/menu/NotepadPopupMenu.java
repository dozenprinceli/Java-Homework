package pers.dozenlee.notepad.gui.menu;

import pers.dozenlee.notepad.gui.NotepadConsts;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * @author DozenPrince Li
 * @date 2022/3/28
 */
public class NotepadPopupMenu extends JPopupMenu {

    /* Swap String */

    public static final String RIGHT_TO_LEFT = "从右到左的阅读顺序";
    public static final String LEFT_TO_RIGHT = "从左到右的阅读顺序";

    /* Mnemonics */

    private static final int CANCEL_MNEMONIC = KeyEvent.VK_U;
    private static final int CUT_MNEMONIC = KeyEvent.VK_T;
    private static final int COPY_MNEMONIC = KeyEvent.VK_C;
    private static final int PASTE_MNEMONIC = KeyEvent.VK_P;
    private static final int DELETE_MNEMONIC = KeyEvent.VK_D;
    private static final int SELECT_ALL_MNEMONIC = KeyEvent.VK_A;
    private static final int SWAP_READ_ORDER_MNEMONIC = KeyEvent.VK_R;
    private static final int SHOW_UNICODE_CONTROL_CHAR_MNEMONIC = KeyEvent.VK_S;
    private static final int INSERT_UNICODE_CONTROL_CHAR_MNEMONIC = KeyEvent.VK_I;
    private static final int OPEN_INPUT_METHOD_MNEMONIC = KeyEvent.VK_O;
    private static final int RESELECT_CHINESE_CHAR_MNEMONIC = KeyEvent.VK_R;

    /* Cancel Menu Item */

    public JMenuItem cancel = new JMenuItem("撤销");

    /* Copy Menu Item */

    public JMenuItem cut = new JMenuItem("剪切");
    public JMenuItem copy = new JMenuItem("复制");
    public JMenuItem paste = new JMenuItem("粘贴");
    public JMenuItem delete = new JMenuItem("删除");

    /* Select All Menu Item */

    public JMenuItem selectAll = new JMenuItem("全选");

    /* Unicode Menu Item */

    public JMenuItem swapReadOrder = new JMenuItem(RIGHT_TO_LEFT);
    public JMenuItem showUnicodeControlChar = new JMenuItem("显示Unicode控制字符");
    private final JMenu insertUnicodeControlChar = new JMenu("插入Unicode控制字符");

    /* Insert Unicode Control Char Menu Item */

    public JMenuItem LRM = new JMenuItem("LRM");
    public JMenuItem RLM = new JMenuItem("RLM");
    public JMenuItem ZWJ = new JMenuItem("ZWJ");
    public JMenuItem ZWNJ = new JMenuItem("ZWNJ");
    public JMenuItem LRE = new JMenuItem("LRE");
    public JMenuItem RLE = new JMenuItem("RLE");
    public JMenuItem LRO = new JMenuItem("LRO");
    public JMenuItem RLO = new JMenuItem("RLO");
    public JMenuItem PDF = new JMenuItem("PDF");
    public JMenuItem NADS = new JMenuItem("NADS");
    public JMenuItem NODS = new JMenuItem("NODS");
    public JMenuItem ASS = new JMenuItem("ASS");
    public JMenuItem ISS = new JMenuItem("ISS");
    public JMenuItem AAFS = new JMenuItem("AAFS");
    public JMenuItem IAFS = new JMenuItem("IAFS");
    public JMenuItem RS = new JMenuItem("RS");
    public JMenuItem US = new JMenuItem("US");

    /* Input Method Menu Item */

    public JMenuItem openInputMethod = new JMenuItem("打开输入法");
    public JMenuItem reselectChineseChar = new JMenuItem("汉字重选");

    public NotepadPopupMenu() {
        insertUnicodeControlChar.add(LRM);
        insertUnicodeControlChar.add(RLM);
        insertUnicodeControlChar.add(ZWJ);
        insertUnicodeControlChar.add(ZWNJ);
        insertUnicodeControlChar.add(LRE);
        insertUnicodeControlChar.add(RLE);
        insertUnicodeControlChar.add(LRO);
        insertUnicodeControlChar.add(RLO);
        insertUnicodeControlChar.add(PDF);
        insertUnicodeControlChar.add(NADS);
        insertUnicodeControlChar.add(NODS);
        insertUnicodeControlChar.add(ASS);
        insertUnicodeControlChar.add(ISS);
        insertUnicodeControlChar.add(AAFS);
        insertUnicodeControlChar.add(IAFS);
        insertUnicodeControlChar.add(RS);
        insertUnicodeControlChar.add(US);

        add(cancel);
        addSeparator();
        add(cut);
        add(copy);
        add(paste);
        add(delete);
        addSeparator();
        add(selectAll);
        addSeparator();
        add(swapReadOrder);
        add(showUnicodeControlChar);
        add(insertUnicodeControlChar);
        addSeparator();
        add(openInputMethod);
        add(reselectChineseChar);
        setFont(NotepadConsts.GENERAL_FONT);
    }

    public void init() {
        cancel.setMnemonic(CANCEL_MNEMONIC);
        cut.setMnemonic(CUT_MNEMONIC);
        copy.setMnemonic(COPY_MNEMONIC);
        paste.setMnemonic(PASTE_MNEMONIC);
        delete.setMnemonic(DELETE_MNEMONIC);
        selectAll.setMnemonic(SELECT_ALL_MNEMONIC);
        swapReadOrder.setMnemonic(SWAP_READ_ORDER_MNEMONIC);
        showUnicodeControlChar.setMnemonic(SHOW_UNICODE_CONTROL_CHAR_MNEMONIC);
        insertUnicodeControlChar.setMnemonic(INSERT_UNICODE_CONTROL_CHAR_MNEMONIC);
        openInputMethod.setMnemonic(OPEN_INPUT_METHOD_MNEMONIC);
        reselectChineseChar.setMnemonic(RESELECT_CHINESE_CHAR_MNEMONIC);
    }
}
