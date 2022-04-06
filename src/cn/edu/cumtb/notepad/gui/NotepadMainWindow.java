package pers.dozenlee.notepad.gui;

import pers.dozenlee.notepad.gui.action.NotepadFileActions;
import pers.dozenlee.notepad.gui.action.NotepadHelpActions;
import pers.dozenlee.notepad.gui.img.NotepadImages;
import pers.dozenlee.notepad.gui.menu.*;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * @author DozenPrince Li
 * @date 2022/3/28
 */
public class NotepadMainWindow extends JFrame {

    private static final String NOTEPAD_TITLE_SUFFIX = " - 记事本";
    private static final String UNTITLED_TITLE = "无标题";

    private static final int TEXT_AREA_INIT_ROW = 20;
    private static final int TEXT_AREA_INIT_COLUMN = 80;

    private final JMenuBar notepadMenuBar = new JMenuBar();
    private final NotepadFileMenu fileMenu = new NotepadFileMenu();
    private final NotepadEditMenu editMenu = new NotepadEditMenu();
    private final NotepadFormatMenu formatMenu = new NotepadFormatMenu();
    private final NotepadViewMenu viewMenu = new NotepadViewMenu();
    private final NotepadHelpMenu helpMenu = new NotepadHelpMenu();

    private final JTextArea textArea = new JTextArea(TEXT_AREA_INIT_ROW, TEXT_AREA_INIT_COLUMN);

    public NotepadMainWindow() {
        setTitle(UNTITLED_TITLE + NOTEPAD_TITLE_SUFFIX);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setIconImage(NotepadImages.DOZEN_LEE_LOGO.getImage());
    }

    public void init() {
        createMenuBar();
        boundFileAction();

        createTextArea();

        boundHelpAction();

        add(new NotepadStatusBar(), BorderLayout.SOUTH);

        pack();
    }

    private void createMenuBar() {
        fileMenu.init();
        editMenu.init();
        formatMenu.init();
        viewMenu.init();
        helpMenu.init();

        notepadMenuBar.add(fileMenu);
        notepadMenuBar.add(editMenu);
        notepadMenuBar.add(formatMenu);
        notepadMenuBar.add(viewMenu);
        notepadMenuBar.add(helpMenu);

        notepadMenuBar.setBorder(BorderFactory.createEtchedBorder());
        setJMenuBar(notepadMenuBar);
    }

    private void createTextArea() {
        textArea.setPreferredSize(new Dimension(977, 542));
        NotepadPopupMenu popupMenu = new NotepadPopupMenu();
        popupMenu.init();
        textArea.setComponentPopupMenu(popupMenu);
        textArea.add(new JScrollBar(JScrollBar.HORIZONTAL));
        textArea.add(new JScrollBar(JScrollBar.VERTICAL));

        add(textArea, BorderLayout.CENTER);
    }

    private void boundFileAction() {
        fileMenu.newFile.addActionListener(e -> {
            try {
                NotepadFileActions.newFileAction(textArea);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        fileMenu.newWindow.addActionListener(e -> NotepadFileActions.newWindowAction());

        fileMenu.open.addActionListener(e -> {
            try {
                NotepadFileActions.openFileAction(textArea);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        fileMenu.setting.addActionListener(e -> new NotepadPageSettingWindow().init());

        fileMenu.print.addActionListener(e -> new NotepadPrintWindow());

        fileMenu.save.addActionListener(e -> {
            try {
                NotepadFileActions.saveFileAction(textArea);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        fileMenu.saveAs.addActionListener(e -> {
            try {
                NotepadFileActions.saveFileAction(textArea);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        fileMenu.exit.addActionListener(e -> dispose());
    }

    private void boundHelpAction() {
        helpMenu.sendFeedback.addActionListener(e -> NotepadHelpActions.openURLAction(NotepadHelpActions.SEND_FEEDBACK_URL));
        helpMenu.viewHelp.addActionListener(e -> NotepadHelpActions.openURLAction(NotepadHelpActions.VIEW_HELP_URL));
        NotepadHelpActions.showAboutPageAction(helpMenu.aboutNotepad);
    }

    private static final class NotepadStatusBar extends JPanel {

        public NotepadStatusBar() {
            setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 0));
            setPreferredSize(new Dimension(977, 29));
            setBackground(new Color(0xEEEEEF));

            JLabel label1 = new JLabel("第1行，第1列");
            JLabel label2 = new JLabel("100%");
            JLabel label3 = new JLabel("Windows(CRLF)");
            JLabel label4 = new JLabel("UTF-8");
            JLabel[] labels = {label1, label2, label3, label4};

            for (JLabel label : labels) {
                label.setPreferredSize(new Dimension(130, 29));
                label.setFont(NotepadConsts.GENERAL_FONT);
            }

            add(label1);
            add(label2);
            add(label3);
            add(label4);
        }
    }
}
