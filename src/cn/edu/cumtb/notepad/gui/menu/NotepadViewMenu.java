package pers.dozenlee.notepad.gui.menu;

import pers.dozenlee.notepad.gui.NotepadConsts;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * @author DozenPrince Li
 * @date 2022/3/28
 */
public class NotepadViewMenu extends JMenu {

    /* Accelerators */

    private static final KeyStroke ENLARGE_STROKE = KeyStroke.getKeyStroke("ctrl PLUS");
    private static final KeyStroke SHRINK_STROKE = KeyStroke.getKeyStroke("ctrl MINUS");
    private static final KeyStroke RESET_ZOOM_STROKE = KeyStroke.getKeyStroke("ctrl 0");

    /* Mnemonics */

    private static final int VIEW_MENU_MNEMONIC = KeyEvent.VK_V;
    private static final int ZOOM_MNEMONIC = KeyEvent.VK_Z;
    private static final int ENLARGE_MNEMONIC = KeyEvent.VK_I;
    private static final int SHRINK_MNEMONIC = KeyEvent.VK_O;
    private static final int STATUS_BAR_MNEMONIC = KeyEvent.VK_S;

    /* Menu Item */

    /**
     * <b>查看/缩放</b> - 缩放相关操作菜单<br>
     * <b>Mnemonic</b> - Z
     */
    private final JMenu zoom = new JMenu("缩放");

    /**
     * <b>查看/缩放/放大</b> - 放大字体大小<br>
     * <b>HotKey</b> - Ctrl + PLUS<br>
     * <b>Mnemonic</b> - I
     */
    public JMenuItem enlarge = new JMenuItem("放大");

    /**
     * <b>查看/缩放/缩小</b> - 缩小字体大小<br>
     * <b>HotKey</b> - Ctrl + MINUS<br>
     * <b>Mnemonic</b> - O
     */
    public JMenuItem shrink = new JMenuItem("缩小");

    /**
     * <b>查看/缩放/恢复默认缩放</b> - 将字体大小恢复为默认<br>
     * <b>HotKey</b> - Ctrl + 0<br>
     */
    public JMenuItem resetZoom = new JMenuItem("恢复默认缩放");

    /**
     * <b>查看/状态栏</b> - 设置状态栏是否显示<br>
     * <b>Mnemonic</b> - S
     */
    public JMenuItem statusBar = new JMenuItem("状态栏");

    public NotepadViewMenu() {
        this.setText("查看");
        setFont(NotepadConsts.GENERAL_FONT);

        zoom.add(enlarge);
        zoom.add(shrink);
        zoom.add(resetZoom);

        add(zoom);
        add(statusBar);
    }

    public void init() {
        setMnemonic(VIEW_MENU_MNEMONIC);
        zoom.setMnemonic(ZOOM_MNEMONIC);
        enlarge.setMnemonic(ENLARGE_MNEMONIC);
        shrink.setMnemonic(SHRINK_MNEMONIC);
        statusBar.setMnemonic(STATUS_BAR_MNEMONIC);

        enlarge.setAccelerator(ENLARGE_STROKE);
        shrink.setAccelerator(SHRINK_STROKE);
        resetZoom.setAccelerator(RESET_ZOOM_STROKE);
    }
}
