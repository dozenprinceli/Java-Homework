package pers.dozenlee.notepad.gui.menu;

import pers.dozenlee.notepad.gui.NotepadConsts;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * @author DozenPrince Li
 * @date 2022/3/28
 */
public class NotepadEditMenu extends JMenu {

    /* Accelerators */

    private static final KeyStroke CANCEL_STROKE = KeyStroke.getKeyStroke("ctrl Z");
    private static final KeyStroke CUT_STROKE = KeyStroke.getKeyStroke("ctrl X");
    private static final KeyStroke COPY_STROKE = KeyStroke.getKeyStroke("ctrl C");
    private static final KeyStroke PASTE_STROKE = KeyStroke.getKeyStroke("ctrl V");
    private static final KeyStroke DELETE_STROKE = KeyStroke.getKeyStroke("DELETE");
    private static final KeyStroke SEARCH_ONLINE_STROKE = KeyStroke.getKeyStroke("ctrl E");
    private static final KeyStroke SEARCH_STROKE = KeyStroke.getKeyStroke("ctrl F");
    private static final KeyStroke SEARCH_NEXT_STROKE = KeyStroke.getKeyStroke("F3");
    private static final KeyStroke SEARCH_LAST_STROKE = KeyStroke.getKeyStroke("shift F3");
    private static final KeyStroke REPLACE_STROKE = KeyStroke.getKeyStroke("ctrl H");
    private static final KeyStroke SWAP_TO_STROKE = KeyStroke.getKeyStroke("ctrl G");
    private static final KeyStroke SELECT_ALL_STROKE = KeyStroke.getKeyStroke("ctrl A");
    private static final KeyStroke TIME_AND_DATE_STROKE = KeyStroke.getKeyStroke("F5");

    /* Mnemonics */

    private static final int EDIT_MENU_MNEMONIC = KeyEvent.VK_E;
    private static final int CANCEL_MNEMONIC = KeyEvent.VK_U;
    private static final int CUT_MNEMONIC = KeyEvent.VK_T;
    private static final int COPY_MNEMONIC = KeyEvent.VK_C;
    private static final int PASTE_MNEMONIC = KeyEvent.VK_P;
    private static final int DELETE_MNEMONIC = KeyEvent.VK_L;
    private static final int SEARCH_MNEMONIC = KeyEvent.VK_F;
    private static final int SEARCH_NEXT_MNEMONIC = KeyEvent.VK_N;
    private static final int SEARCH_LAST_MNEMONIC = KeyEvent.VK_V;
    private static final int REPLACE_MNEMONIC = KeyEvent.VK_R;
    private static final int SWAP_TO_MNEMONIC = KeyEvent.VK_G;
    private static final int SELECT_ALL_MNEMONIC = KeyEvent.VK_A;
    private static final int TIME_AND_DATE_MNEMONIC = KeyEvent.VK_D;

    /* Cancel Menu Item */

    /**
     * <b>编辑/撤销</b> - 撤销上一次的操作<br>
     * <b>HotKey</b> - Ctrl + Z<br>
     * <b>Mnemonic</b> - U
     */
    public JMenuItem cancel = new JMenuItem("撤销");

    /* Copy Menu Item */

    /**
     * <b>编辑/剪切</b> - 剪切所选内容到剪贴板<br>
     * <b>HotKey</b> - Ctrl + X<br>
     * <b>Mnemonic</b> - T
     */
    public JMenuItem cut = new JMenuItem("剪切");

    /**
     * <b>编辑/复制</b> - 复制所选内容到剪贴板<br>
     * <b>HotKey</b> - Ctrl + C<br>
     * <b>Mnemonic</b> - C
     */
    public JMenuItem copy = new JMenuItem("复制");

    /**
     * <b>编辑/粘贴</b> - 粘贴剪贴板的内容<br>
     * <b>HotKey</b> - Ctrl + V<br>
     * <b>Mnemonic</b> - P
     */
    public JMenuItem paste = new JMenuItem("粘贴");

    /**
     * <b>编辑/删除</b> - 删除所选内容<br>
     * <b>HotKey</b> - Del<br>
     * <b>Mnemonic</b> - L
     */
    public JMenuItem delete = new JMenuItem("删除");

    /* Search Menu Item */

    /**
     * <b>编辑/联网搜索</b> - 使用默认浏览器搜索所选内容<br>
     * <b>HotKey</b> - Ctrl + E<br>
     */
    public JMenuItem searchOnline = new JMenuItem("联网搜索");

    /**
     * <b>编辑/查找</b> - 弹出查找窗口<br>
     * <b>HotKey</b> - Ctrl + F<br>
     * <b>Mnemonic</b> - F
     */
    public JMenuItem search = new JMenuItem("查找");

    /**
     * <b>编辑/查找下一个</b> - 查找下一个所选内容<br>
     * <b>HotKey</b> - F3<br>
     * <b>Mnemonic</b> - N
     */
    public JMenuItem searchNext = new JMenuItem("查找下一个");

    /**
     * <b>编辑/查找上一个</b> - 查找上一个所选内容<br>
     * <b>HotKey</b> - Shift + F3<br>
     * <b>Mnemonic</b> - V
     */
    public JMenuItem searchLast = new JMenuItem("查找上一个");

    /**
     * <b>编辑/替换</b> - 弹出替换窗口<br>
     * <b>HotKey</b> - Ctrl + H<br>
     * <b>Mnemonic</b> - R
     */
    public JMenuItem replace = new JMenuItem("替换");

    /**
     * <b>编辑/转到</b> - 弹出转到窗口<br>
     * <b>HotKey</b> - Ctrl + G<br>
     * <b>Mnemonic</b> - G
     */
    public JMenuItem swapTo = new JMenuItem("转到");

    /* Other Menu Item */

    /**
     * <b>编辑/全选</b> - 将所有内容全部选中<br>
     * <b>HotKey</b> - Ctrl + A<br>
     * <b>Mnemonic</b> - A
     */
    public JMenuItem selectAll = new JMenuItem("全选");

    /**
     * <b>编辑/时间&日期</b> - 在光标处填入当前时间和日期<br>
     * <b>HotKey</b> - F5<br>
     * <b>Mnemonic</b> - D
     */
    public JMenuItem timeAndDate = new JMenuItem("时间&日期");

    public NotepadEditMenu() {
        setText("编辑");
        setFont(NotepadConsts.GENERAL_FONT);

        add(cancel);
        addSeparator();
        add(cut);
        add(copy);
        add(paste);
        add(delete);
        addSeparator();
        add(searchOnline);
        add(search);
        add(searchNext);
        add(searchLast);
        add(replace);
        add(swapTo);
        addSeparator();
        add(selectAll);
        add(timeAndDate);
    }

    public void init() {
        setMnemonic(EDIT_MENU_MNEMONIC);
        cancel.setMnemonic(CANCEL_MNEMONIC);
        cut.setMnemonic(CUT_MNEMONIC);
        copy.setMnemonic(COPY_MNEMONIC);
        paste.setMnemonic(PASTE_MNEMONIC);
        delete.setMnemonic(DELETE_MNEMONIC);
        search.setMnemonic(SEARCH_MNEMONIC);
        searchNext.setMnemonic(SEARCH_NEXT_MNEMONIC);
        searchLast.setMnemonic(SEARCH_LAST_MNEMONIC);
        replace.setMnemonic(REPLACE_MNEMONIC);
        swapTo.setMnemonic(SWAP_TO_MNEMONIC);
        selectAll.setMnemonic(SELECT_ALL_MNEMONIC);
        timeAndDate.setMnemonic(TIME_AND_DATE_MNEMONIC);

        cancel.setAccelerator(CANCEL_STROKE);
        cut.setAccelerator(CUT_STROKE);
        copy.setAccelerator(COPY_STROKE);
        paste.setAccelerator(PASTE_STROKE);
        delete.setAccelerator(DELETE_STROKE);
        searchOnline.setAccelerator(SEARCH_ONLINE_STROKE);
        search.setAccelerator(SEARCH_STROKE);
        searchNext.setAccelerator(SEARCH_NEXT_STROKE);
        searchLast.setAccelerator(SEARCH_LAST_STROKE);
        replace.setAccelerator(REPLACE_STROKE);
        swapTo.setAccelerator(SWAP_TO_STROKE);
        selectAll.setAccelerator(SELECT_ALL_STROKE);
        timeAndDate.setAccelerator(TIME_AND_DATE_STROKE);
    }
}
