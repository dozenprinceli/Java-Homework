package pers.dozenlee.notepad.gui;

import pers.dozenlee.notepad.gui.img.NotepadImages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * @author DozenPrince Li
 * @date 2022/3/30
 */
public class NotepadPageSettingWindow extends JDialog {

    /* Mnemonics */

    private static final int PAGE_SIZE_MNEMONIC = KeyEvent.VK_Z;
    private static final int PAGE_SOURCE_MNEMONIC = KeyEvent.VK_S;

    private static final int VERTICAL_MNEMONIC = KeyEvent.VK_O;
    private static final int HORIZONTAL_MNEMONIC = KeyEvent.VK_A;

    private static final int MARGIN_LEFT_MNEMONIC = KeyEvent.VK_L;
    private static final int MARGIN_RIGHT_MNEMONIC = KeyEvent.VK_R;
    private static final int MARGIN_TOP_MNEMONIC = KeyEvent.VK_T;
    private static final int MARGIN_BOTTOM_MNEMONIC = KeyEvent.VK_B;

    private static final int HEAD_MNEMONIC = KeyEvent.VK_H;
    private static final int FOOT_MNEMONIC = KeyEvent.VK_F;

    /* Window Consts */

    private static final Dimension PAGE_SETTING_WINDOW_SIZE = new Dimension(818, 537);

    /* Page Setting Consts */

    private static final String[] PAGE_SIZE_TYPE =
            {"A3", "A4", "A5",
                    "B4(JIS)", "B5(JIS)",
                    "Executive", "Statement", "Tabloid",
                    "法律专用纸", "信纸"};
    private static final String[] PAGE_SOURCE_TYPE = {"\0"};
    private static final Rectangle PAGE_SETTING_BOUNDS = new Rectangle(14, 20, 512, 141);
    private static final int PAGE_SETTING_HGAP = 30;
    private static final int PAGE_SETTING_VGAP = 20;
    private static final Dimension PAGE_SETTING_LABEL_SIZE = new Dimension(65, 29);
    private static final Dimension PAGE_SETTING_COMBO_BOX_SIZE = new Dimension(360, 29);

    /* Direction Setting Consts */

    private static final Rectangle DIRECTION_SETTING_BOUNDS = new Rectangle(14, 175, 149, 139);
    private static final int DIRECTION_SETTING_VGAP = 24;
    private static final Dimension DIRECTION_RADIO_BUTTON_SIZE = new Dimension(116, 24);

    /* Margin Setting Consts */

    private static final Rectangle MARGIN_SETTING_BOUNDS = new Rectangle(176, 175, PAGE_SETTING_BOUNDS.width + PAGE_SETTING_BOUNDS.x - 176, 139);
    private static final int MARGIN_SETTING_HGAP = 25;
    private static final int MARGIN_SETTING_VGAP = 20;
    private static final Dimension MARGIN_LABEL_SIZE = new Dimension(50, 29);
    private static final Dimension MARGIN_TEXT_FIELD_SIZE = new Dimension(63, 29);

    /* Preview Consts */

    private static final Image PREVIEW_HORIZONTAL = NotepadImages.PREVIEW_HORIZONTAL.getImage().getScaledInstance(192, 108, Image.SCALE_SMOOTH);
    private static final Image PREVIEW_VERTICAL = NotepadImages.PREVIEW_VERTICAL.getImage().getScaledInstance(172, 244, Image.SCALE_SMOOTH);

    private static final Rectangle PREVIEW_BOUNDS = new Rectangle(546, 20, 240, 395);

    /* Head and Foot Setting Consts */

    private static final Rectangle HEAD_AND_FOOT_SETTING_BOUNDS = new Rectangle(-16, 318, 540, 110);
    private static final int HEAD_AND_FOOT_SETTING_HGAP = 42;
    private static final int HEAD_AND_FOOT_SETTING_VGAP = 15;
    private static final Dimension HEAD_AND_FOOT_LABEL_SIZE = new Dimension(60, 29);
    private static final Dimension HEAD_AND_FOOT_TEXT_FIELD_SIZE = new Dimension(390, 32);

    /* Submit Consts */

    private static final Rectangle SUBMIT_BOUNDS = new Rectangle(500, 435, 320, 36);
    private static final int SUBMIT_HGAP = 10;
    private static final Dimension SUBMIT_BUTTON_SIZE = new Dimension(130, 34);

    /* Page Setting Components */

    private final JPanel pageSetting = new JPanel(new FlowLayout(FlowLayout.CENTER, PAGE_SETTING_HGAP, PAGE_SETTING_VGAP));
    private final JLabel pageSize = new JLabel("大小(Z):");
    private final JLabel pageSource = new JLabel("来源(S):");
    public final JComboBox<String> sizeComboBox = new JComboBox<>();
    public final JComboBox<String> sourceComboBox = new JComboBox<>();

    /* Direction Setting Components */

    private final JPanel directionSetting = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, DIRECTION_SETTING_VGAP));
    private final ButtonGroup directionButtonGroup = new ButtonGroup();
    public final JRadioButton vertical = new JRadioButton("纵向(O)");
    public final JRadioButton horizontal = new JRadioButton("横向(A)");

    /* Margin Setting Components */

    private final JPanel marginSetting = new JPanel(new FlowLayout(FlowLayout.CENTER, MARGIN_SETTING_HGAP, MARGIN_SETTING_VGAP));
    private final JLabel marginLeftLabel = new JLabel("左(L):");
    private final JTextField marginLeft = new JTextField("20");
    private final JLabel marginRightLabel = new JLabel("右(R):");
    private final JTextField marginRight = new JTextField("20");
    private final JLabel marginTopLabel = new JLabel("上(T):");
    private final JTextField marginTop = new JTextField("25");
    private final JLabel marginBottomLabel = new JLabel("下(B):");
    private final JTextField marginBottom = new JTextField("25");
    private final JLabel[] marginLabel = {marginLeftLabel, marginRightLabel, marginTopLabel, marginBottomLabel};
    private final JTextField[] marginTextField = {marginLeft, marginRight, marginTop, marginBottom};

    /* Preview Components */

    private final JPanel preview = new JPanel(new BorderLayout());
    private final JLabel previewImage = new JLabel();

    /* Head and Foot Setting Components */

    private final JPanel headAndFootSetting = new JPanel(new FlowLayout(FlowLayout.LEFT, HEAD_AND_FOOT_SETTING_HGAP, HEAD_AND_FOOT_SETTING_VGAP));
    private final JLabel headLabel = new JLabel("页眉(H):");
    private final JTextField headText = new JTextField();
    private final JLabel footLabel = new JLabel("页脚(F):");
    private final JTextField footText = new JTextField();

    /* Submit Components */

    private final JPanel submit = new JPanel(new FlowLayout(FlowLayout.LEFT, SUBMIT_HGAP, 0));
    public final JButton verifyButton = new JButton("确定");
    public final JButton cancelButton = new JButton("取消");

    public NotepadPageSettingWindow() {
        setModal(true);
        setLayout(null);
        setSize(PAGE_SETTING_WINDOW_SIZE);
        setTitle("页面设置");
        setLocation(NotepadUtil.getPointToCentralWindow(NotepadConsts.SCREEN_SIZE, PAGE_SETTING_WINDOW_SIZE));
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setIconImage(NotepadImages.DOZEN_LEE_LOGO.getImage());
    }

    public void init() {

        /* Page Setting Init */

        pageSetting.setBorder(BorderFactory.createTitledBorder(
                NotepadConsts.GENERAL_BEVEL_BORDER,
                "纸张"));
        pageSize.setFont(NotepadConsts.GENERAL_FONT);
        pageSize.setDisplayedMnemonic(PAGE_SIZE_MNEMONIC);
        pageSize.setPreferredSize(PAGE_SETTING_LABEL_SIZE);
        sizeComboBox.setPreferredSize(PAGE_SETTING_COMBO_BOX_SIZE);
        sizeComboBox.setBackground(NotepadConsts.COMBO_BOX_BACKGROUND_COLOR);
        sizeComboBox.setEditable(false);
        sizeComboBox.setFocusable(true);
        for (String item : PAGE_SIZE_TYPE) {
            sizeComboBox.addItem(item);
        }
        sizeComboBox.setSelectedIndex(1);
        pageSource.setFont(NotepadConsts.GENERAL_FONT);
        pageSource.setDisplayedMnemonic(PAGE_SOURCE_MNEMONIC);
        pageSource.setPreferredSize(PAGE_SETTING_LABEL_SIZE);
        pageSource.setEnabled(false);
        sourceComboBox.setPreferredSize(PAGE_SETTING_COMBO_BOX_SIZE);
        sourceComboBox.setBackground(NotepadConsts.COMBO_BOX_BACKGROUND_COLOR);
        sourceComboBox.setEnabled(false);
        sourceComboBox.setEditable(false);
        sourceComboBox.setFocusable(true);
        for (String item : PAGE_SOURCE_TYPE) {
            sourceComboBox.addItem(item);
        }

        pageSetting.add(pageSize);
        pageSetting.add(sizeComboBox);
        pageSetting.add(pageSource);
        pageSetting.add(sourceComboBox);

        /* Direction Setting Init */

        directionSetting.setBorder(BorderFactory.createTitledBorder(
                NotepadConsts.GENERAL_BEVEL_BORDER,
                "方向"));
        vertical.setPreferredSize(DIRECTION_RADIO_BUTTON_SIZE);
        vertical.setFont(NotepadConsts.GENERAL_FONT);
        vertical.setMnemonic(VERTICAL_MNEMONIC);
        vertical.addActionListener(directionListener);
        horizontal.setPreferredSize(DIRECTION_RADIO_BUTTON_SIZE);
        horizontal.setFont(NotepadConsts.GENERAL_FONT);
        horizontal.setMnemonic(HORIZONTAL_MNEMONIC);
        horizontal.addActionListener(directionListener);

        directionButtonGroup.add(vertical);
        directionButtonGroup.add(horizontal);
        vertical.setSelected(true);
        directionSetting.add(vertical);
        directionSetting.add(horizontal);

        /* Margin Setting Init */

        marginSetting.setBorder(BorderFactory.createTitledBorder(NotepadConsts.GENERAL_BEVEL_BORDER,
                "页边距(毫米)"));
        for (JLabel label : marginLabel) {
            label.setFont(NotepadConsts.GENERAL_FONT);
            label.setPreferredSize(MARGIN_LABEL_SIZE);
        }
        marginLeftLabel.setDisplayedMnemonic(MARGIN_LEFT_MNEMONIC);
        marginRightLabel.setDisplayedMnemonic(MARGIN_RIGHT_MNEMONIC);
        marginTopLabel.setDisplayedMnemonic(MARGIN_TOP_MNEMONIC);
        marginBottomLabel.setDisplayedMnemonic(MARGIN_BOTTOM_MNEMONIC);
        for (JTextField textField : marginTextField) {
            textField.setFont(NotepadConsts.GENERAL_FONT);
            textField.setPreferredSize(MARGIN_TEXT_FIELD_SIZE);
        }

        marginSetting.add(marginLeftLabel);
        marginSetting.add(marginLeft);
        marginSetting.add(marginRightLabel);
        marginSetting.add(marginRight);
        marginSetting.add(marginTopLabel);
        marginSetting.add(marginTop);
        marginSetting.add(marginBottomLabel);
        marginSetting.add(marginBottom);

        /* Preview Init */

        preview.setBorder(BorderFactory.createTitledBorder(NotepadConsts.GENERAL_BEVEL_BORDER,
                "预览"));
        previewImage.setIcon(new ImageIcon(PREVIEW_VERTICAL));
        previewImage.setVerticalAlignment(JLabel.CENTER);
        previewImage.setHorizontalAlignment(JLabel.CENTER);

        preview.add(previewImage, BorderLayout.CENTER);

        /* Head and Foot Setting Init */

        headLabel.setPreferredSize(HEAD_AND_FOOT_LABEL_SIZE);
        headLabel.setDisplayedMnemonic(HEAD_MNEMONIC);
        headLabel.setFont(NotepadConsts.GENERAL_FONT);
        headLabel.setVerticalAlignment(JLabel.CENTER);
        footLabel.setPreferredSize(HEAD_AND_FOOT_LABEL_SIZE);
        footLabel.setDisplayedMnemonic(FOOT_MNEMONIC);
        footLabel.setFont(NotepadConsts.GENERAL_FONT);
        footLabel.setVerticalAlignment(JLabel.CENTER);
        headText.setPreferredSize(HEAD_AND_FOOT_TEXT_FIELD_SIZE);
        headText.setFont(NotepadConsts.GENERAL_FONT);
        footText.setPreferredSize(HEAD_AND_FOOT_TEXT_FIELD_SIZE);
        footText.setFont(NotepadConsts.GENERAL_FONT);

        headAndFootSetting.add(headLabel);
        headAndFootSetting.add(headText);
        headAndFootSetting.add(footLabel);
        headAndFootSetting.add(footText);

        /* Submit Init */

        verifyButton.setFocusable(false);
        verifyButton.setBorder(NotepadConsts.BUTTON_BORDER);
        verifyButton.setPreferredSize(SUBMIT_BUTTON_SIZE);
        verifyButton.setFont(NotepadConsts.GENERAL_FONT);
        verifyButton.setBackground(NotepadConsts.BUTTON_BACKGROUND_COLOR);
        verifyButton.setOpaque(true);
        verifyButton.addActionListener(submitListener);
        cancelButton.setFocusable(false);
        cancelButton.setBorder(NotepadConsts.BUTTON_BORDER);
        cancelButton.setPreferredSize(SUBMIT_BUTTON_SIZE);
        cancelButton.setFont(NotepadConsts.GENERAL_FONT);
        cancelButton.setBackground(NotepadConsts.BUTTON_BACKGROUND_COLOR);
        cancelButton.setOpaque(true);
        cancelButton.addActionListener(submitListener);

        submit.add(verifyButton);
        submit.add(cancelButton);

        /* Total Init */

        add(pageSetting);
        add(directionSetting);
        add(marginSetting);
        add(preview);
        add(headAndFootSetting);
        add(submit);

        pageSetting.setBounds(PAGE_SETTING_BOUNDS);
        directionSetting.setBounds(DIRECTION_SETTING_BOUNDS);
        marginSetting.setBounds(MARGIN_SETTING_BOUNDS);
        preview.setBounds(PREVIEW_BOUNDS);
        headAndFootSetting.setBounds(HEAD_AND_FOOT_SETTING_BOUNDS);
        submit.setBounds(SUBMIT_BOUNDS);

        setVisible(true);
    }

    private final ActionListener directionListener = e -> {
        if (e.getSource() == vertical) {
            marginLeft.setText("20");
            marginRight.setText("20");
            marginTop.setText("25");
            marginBottom.setText("25");
            previewImage.setIcon(new ImageIcon(PREVIEW_VERTICAL));
        } else if (e.getSource() == horizontal) {
            marginLeft.setText("25");
            marginRight.setText("25");
            marginTop.setText("20");
            marginBottom.setText("20");
            previewImage.setIcon(new ImageIcon(PREVIEW_HORIZONTAL));
        }
    };

    private final ActionListener submitListener = e -> dispose();
}
