package pers.dozenlee.notepad.gui.menu;

import pers.dozenlee.notepad.gui.NotepadConsts;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * @author DozenPrince Li
 * @date 2022/3/28
 */
public class NotepadFileMenu extends JMenu {

    /* Accelerators */

    private static final KeyStroke NEW_FILE_STROKE = KeyStroke.getKeyStroke("ctrl N");
    private static final KeyStroke NEW_WINDOW_STROKE = KeyStroke.getKeyStroke("ctrl shift N");
    private static final KeyStroke OPEN_STROKE = KeyStroke.getKeyStroke("ctrl O");
    private static final KeyStroke SAVE_STROKE = KeyStroke.getKeyStroke("ctrl S");
    private static final KeyStroke SAVE_AS_STROKE = KeyStroke.getKeyStroke("ctrl shift S");
    private static final KeyStroke PRINT_STROKE = KeyStroke.getKeyStroke("ctrl P");

    /* Mnemonics */

    private static final int FILE_MENU_MNEMONIC = KeyEvent.VK_F;
    private static final int NEW_FILE_MNEMONIC = KeyEvent.VK_N;
    private static final int NEW_WINDOW_MNEMONIC = KeyEvent.VK_W;
    private static final int OPEN_MNEMONIC = KeyEvent.VK_O;
    private static final int SAVE_MNEMONIC = KeyEvent.VK_S;
    private static final int SAVE_AS_MNEMONIC = KeyEvent.VK_A;
    private static final int SETTING_MNEMONIC = KeyEvent.VK_U;
    private static final int PRINT_MNEMONIC = KeyEvent.VK_P;
    private static final int EXIT_MNEMONIC = KeyEvent.VK_X;

    /* File Menu Item */

    /**
     * <b>文件/新建</b> - 在此窗口新建一个空txt文件，并提示是否保存现有内容<br>
     * <b>HotKey</b> - Ctrl + N<br>
     * <b>Mnemonic</b> - N
     */
    public JMenuItem newFile = new JMenuItem("新建");

    /**
     * <b>文件/新窗口</b> - 打开一个新窗口<br>
     * <b>HotKey</b> - Ctrl + Shift + N<br>
     * <b>Mnemonic</b> - W
     */
    public JMenuItem newWindow = new JMenuItem("新窗口");

    /**
     * <b>文件/打开</b> - 用于打开现有的txt文件<br>
     * <b>HotKey</b> - Ctrl + O<br>
     * <b>Mnemonic</b> - O
     */
    public JMenuItem open = new JMenuItem("打开");

    /**
     * <b>文件/保存</b> - 保存文件至源路径或弹出对话框保存文件至指定位置<br>
     * <b>HotKey</b> - Ctrl + S<br>
     * <b>Mnemonic</b> - S
     */
    public JMenuItem save = new JMenuItem("保存");

    /**
     * <b>文件/另存为</b> - 弹出保存对话框，将文件保存至指定位置<br>
     * <b>HotKey</b> - Ctrl + Shift + S<br>
     * <b>Mnemonic</b> - A
     */
    public JMenuItem saveAs = new JMenuItem("另存为");

    /* Page Menu Item */

    /**
     * <b>文件/页面设置</b> - 弹出设置窗口，进行页面设置<br><br>
     * <b>Mnemonic</b> - U
     */
    public JMenuItem setting = new JMenuItem("页面设置");

    /**
     * <b>文件/打印</b> - 弹出打印窗口<br>
     * <b>HotKey</b> - Ctrl + P<br>
     * <b>Mnemonic</b> - P
     */
    public JMenuItem print = new JMenuItem("打印");

    /**
     * <b>文件/退出</b> - 退出当前窗口，若未保存则弹出保存确认窗口<br>
     * <b>Mnemonic</b> - X
     */
    public JMenuItem exit = new JMenuItem("退出");

    public NotepadFileMenu() {
        setText("文件");
        setFont(NotepadConsts.GENERAL_FONT);

        add(newFile);
        add(newWindow);
        add(open);
        add(save);
        add(saveAs);
        addSeparator();
        add(setting);
        add(print);
        addSeparator();
        add(exit);
    }

    public void init() {
        setMnemonic(FILE_MENU_MNEMONIC);
        newFile.setMnemonic(NEW_FILE_MNEMONIC);
        newWindow.setMnemonic(NEW_WINDOW_MNEMONIC);
        open.setMnemonic(OPEN_MNEMONIC);
        save.setMnemonic(SAVE_MNEMONIC);
        saveAs.setMnemonic(SAVE_AS_MNEMONIC);
        setting.setMnemonic(SETTING_MNEMONIC);
        print.setMnemonic(PRINT_MNEMONIC);
        exit.setMnemonic(EXIT_MNEMONIC);

        newFile.setAccelerator(NEW_FILE_STROKE);
        newWindow.setAccelerator(NEW_WINDOW_STROKE);
        open.setAccelerator(OPEN_STROKE);
        save.setAccelerator(SAVE_STROKE);
        saveAs.setAccelerator(SAVE_AS_STROKE);
        print.setAccelerator(PRINT_STROKE);
    }
}
