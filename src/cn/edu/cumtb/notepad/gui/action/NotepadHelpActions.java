package pers.dozenlee.notepad.gui.action;

import pers.dozenlee.notepad.gui.NotepadAboutPage;
import pers.dozenlee.notepad.gui.NotepadUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * @author DozenPrince Li
 * @date 2022/3/30
 */
public class NotepadHelpActions {

    /**
     * <b>URL</b> - 查看帮助
     */
    public static final String VIEW_HELP_URL =
            "https://github.com/dozenprinceli/Java-Homework/tree/main/src";
    /**
     * <b>URL</b> - 发送反馈
     */
    public static final String SEND_FEEDBACK_URL =
            "https://github.com/dozenprinceli/Java-Homework/issues";

    /**
     * private constructor
     */
    private NotepadHelpActions() {
    }

    /**
     * 对指定菜单项绑定"打开指定网页"操作
     *
     * @param URL 指定String形式的URL
     */
    public static void openURLAction(String URL) {
        try {
            URI uri = new URL(URL).toURI();
            Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
            if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
                desktop.browse(uri);
            } else {
                throw new IOException("Desktop doesn't support to open browser automatically!");
            }
        } catch (IOException | URISyntaxException ex) {
            JOptionPane.showMessageDialog(null,
                    ex.getMessage(), "warning",
                    JOptionPane.WARNING_MESSAGE);
            ex.printStackTrace();
        }

        // Copy to clipboard
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(new StringSelection(URL), null);
//        JOptionPane.showMessageDialog(null, "URL copied to clipboard", "", JOptionPane.INFORMATION_MESSAGE);
        new NotepadUtil.InformationDialog("URL copied to clipboard", JOptionPane.INFORMATION_MESSAGE).showDialog();
    }

    /**
     * 给指定菜单项绑定"打开关于页"操作
     *
     * @param aboutNotepad 指定菜单项
     */
    public static void showAboutPageAction(JMenuItem aboutNotepad) {
        aboutNotepad.addActionListener(e -> {
            if (e.getSource() == aboutNotepad) {
                try {
                    NotepadAboutPage aboutPage;
                    aboutPage = new NotepadAboutPage();
                    aboutPage.init();
                    Point oldPoint = aboutNotepad.getLocation();
                    Point point = new Point(oldPoint.x + 50, oldPoint.y + 50);
                    aboutPage.setLocation(point);
                    aboutPage.setVisible(true);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null,
                            "About page source not found!", "",
                            JOptionPane.WARNING_MESSAGE);
                    ex.printStackTrace();
                }
            }
        });
    }
}
