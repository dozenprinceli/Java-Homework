package pers.dozenlee.notepad.gui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.*;

/**
 * @author DozenPrince Li
 * @date 2022/3/31
 */
public class NotepadConsts {

    private NotepadConsts() {}

    public static final Font GENERAL_FONT = new Font("Microsoft YaHei UI", Font.PLAIN, 15);

    public static final Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();

    public static final Dimension INFORMATION_DIALOG_SIZE = new Dimension(250, 150);

    public static final Dimension BUTTON_SIZE = new Dimension(115, 33);

    public static final Color BUTTON_HIGHLIGHT_COLOR = new Color(0x6495ED);
    public static final Color BUTTON_SHADOW_COLOR = new Color(0x4169E1);
    public static final Color BUTTON_BACKGROUND_COLOR = new Color(0xE0E0E0);

    public static final Border BUTTON_BORDER = BorderFactory.createEtchedBorder(EtchedBorder.RAISED, BUTTON_HIGHLIGHT_COLOR, BUTTON_SHADOW_COLOR);

    public static final Color SPLIT_LINE_COLOR = new Color(0x737682);

    public static final Color COMBO_BOX_BACKGROUND_COLOR = Color.white;

    public static final Color BEVEL_BORDER_COLOR = new Color(0xDBDBDB);
    public static final Border GENERAL_BEVEL_BORDER = BorderFactory.createBevelBorder(BevelBorder.LOWERED,
            BEVEL_BORDER_COLOR, BEVEL_BORDER_COLOR);
}
