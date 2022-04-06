package pers.dozenlee.notepad.gui;

import pers.dozenlee.notepad.gui.img.NotepadImages;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.io.IOException;

/**
 * @author DozenPrince Li
 * @date 2022/3/30
 * A static "About Notepad" page
 */
public class NotepadAboutPage extends JDialog {

    /* Total Page Consts */

    private static final int ABOUT_PAGE_WIDTH = 700;
    private static final int ABOUT_PAGE_HEIGHT = 630;
    private static final Dimension ABOUT_PAGE_SIZE = new Dimension(ABOUT_PAGE_WIDTH, ABOUT_PAGE_HEIGHT);
    private static final Font ABOUT_PAGE_FONT = NotepadConsts.GENERAL_FONT;
    private static final Color ABOUT_PAGE_BACKGROUND_COLOR = new Color(0xEEEEEF);

    /* Title Consts */

    private static final int TITLE_PANEL_HEIGHT = 110;
    private static final Dimension TITLE_PANEL_SIZE = new Dimension(ABOUT_PAGE_WIDTH, TITLE_PANEL_HEIGHT);
    private static final Dimension TITLE_IMAGE_SIZE = new Dimension(220, 110);

    /* Split Line Consts */

    private static final Dimension SPLIT_LINE_SIZE = new Dimension(650, 1);

    /* Content Consts */

    private static final int CONTENT_HEIGHT = 400;
    private static final int CONTENT_ICON_TEXT_GAP = 20;
    private static final int CONTENT_ICON_LENGTH = 70;
    private static final Dimension CONTENT_LABEL_SIZE = new Dimension(ABOUT_PAGE_WIDTH - 100, CONTENT_HEIGHT);
    private static final Dimension CONTENT_PANEL_SIZE = new Dimension(ABOUT_PAGE_WIDTH, CONTENT_HEIGHT);
    private static final String CONTENT_FILE_LOCATION = "src/pers/dozenlee/notepad/gui/action/AboutPageContent.html";

    /* Empty Label Consts */

    private static final Dimension EMPTY_LABEL_SIZE = new Dimension(ABOUT_PAGE_WIDTH, 20);

    /* Submit Consts */

    private static final int SUBMIT_HEIGHT = 100;
    private static final Dimension SUBMIT_SIZE = new Dimension(ABOUT_PAGE_WIDTH - 40, SUBMIT_HEIGHT);

    /* Components */

    private final String aboutPageText = NotepadUtil.fileToString(NotepadAboutPage.CONTENT_FILE_LOCATION);

    private final JPanel titlePanel = new JPanel();
    private final JLabel titleImage = new JLabel();

    private final JLabel splitLine = new JLabel();

    private final JPanel contentPanel = new JPanel();
    private final JLabel contentLabel = new JLabel();

    private final JLabel emptyLabel = new JLabel();

    private final JPanel submitPanel = new JPanel();
    private final JButton submitButton = new JButton("确定");

    public NotepadAboutPage() throws IOException {
        setTitle("关于\"记事本\"");
        setSize(ABOUT_PAGE_SIZE);
        setIconImage(NotepadImages.DOZEN_LEE_LOGO.getImage());
        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        setModal(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void init() {

        /* Title Init */

        titleImage.setPreferredSize(TITLE_IMAGE_SIZE);
        titleImage.setIcon(new ImageIcon(
                NotepadImages.ABOUT_PAGE_TITLE.getImage()
                        .getScaledInstance(TITLE_IMAGE_SIZE.width, TITLE_IMAGE_SIZE.height, Image.SCALE_SMOOTH)));
        titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        titlePanel.add(titleImage);
        titlePanel.setPreferredSize(TITLE_PANEL_SIZE);

        /* Split Line Init */

        splitLine.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        splitLine.setPreferredSize(SPLIT_LINE_SIZE);
        splitLine.setBackground(NotepadConsts.SPLIT_LINE_COLOR);

        /* Content Init */

        contentLabel.setIcon(new ImageIcon(
                NotepadImages.DOZEN_LEE_LOGO.getImage()
                        .getScaledInstance(CONTENT_ICON_LENGTH, CONTENT_ICON_LENGTH, Image.SCALE_SMOOTH)));
        contentLabel.setText(aboutPageText);
        contentLabel.setIconTextGap(CONTENT_ICON_TEXT_GAP);
        contentLabel.setHorizontalTextPosition(JLabel.RIGHT);
        contentLabel.setVerticalTextPosition(JLabel.TOP);
        contentLabel.setPreferredSize(CONTENT_LABEL_SIZE);
        contentLabel.setFont(ABOUT_PAGE_FONT);

        contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        contentPanel.setPreferredSize(CONTENT_PANEL_SIZE);
        contentPanel.add(contentLabel);

        /* Empty Label Init */

        emptyLabel.setPreferredSize(EMPTY_LABEL_SIZE);

        /* Submit Init */

        submitButton.addActionListener(e -> dispose());
        submitButton.setFocusable(false);
        submitButton.setPreferredSize(NotepadConsts.BUTTON_SIZE);
        submitButton.setBorder(NotepadConsts.BUTTON_BORDER);
        submitButton.setOpaque(true);
        submitButton.setFont(ABOUT_PAGE_FONT);
        submitButton.setBackground(NotepadConsts.BUTTON_BACKGROUND_COLOR);

        submitPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        submitPanel.setPreferredSize(SUBMIT_SIZE);

        submitPanel.add(submitButton);

        /* Total Page Init */

        add(titlePanel);
        add(splitLine);
        add(contentPanel);
        add(emptyLabel);
        add(submitPanel);
        setBackground(ABOUT_PAGE_BACKGROUND_COLOR);
    }
}
