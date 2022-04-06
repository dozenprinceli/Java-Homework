package pers.dozenlee.notepad.gui;

import org.jetbrains.annotations.NotNull;
import pers.dozenlee.notepad.gui.action.NotepadFileActions;
import pers.dozenlee.notepad.gui.img.NotepadImages;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author DozenPrince Li
 * @date 2022/4/1
 */
public class NotepadUtil {

    private NotepadUtil() {
    }

    public static @NotNull Point getPointToCentralWindow(@NotNull Dimension screenSize, @NotNull Dimension frameSize) {
        int pointX = (int) (screenSize.getWidth() - frameSize.getWidth()) / 2;
        int pointY = (int) (screenSize.getHeight() - frameSize.getHeight()) / 2;
        return new Point(pointX, pointY);
    }

    public static @NotNull String fileToString(String filePath) throws IOException {
        StringBuilder buffer = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String str;
        while ((str = reader.readLine()) != null) {
            buffer.append(str.trim());
        }

        return buffer.toString();
    }

    public static void stringToFile(String filePath, JTextArea textArea) throws IOException {
        File file = new File(filePath);

        if (!file.exists() && !file.createNewFile()) {
            new InformationDialog("Fail to create a file!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(textArea.getText().getBytes(StandardCharsets.UTF_8));
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    public static boolean isEmptyTextArea(@NotNull JTextArea textArea) {
        return textArea.getText().equals("\0");
    }

    public static void resetTextAreaBySave(JTextArea textArea) throws IOException {
        if (!NotepadUtil.isEmptyTextArea(textArea)) {
            NotepadFileActions.saveFileAction(textArea);
        }
    }

    public static @NotNull JButton createDefaultButton(String buttonText) {
        JButton button = new JButton(buttonText);
        button.setPreferredSize(NotepadConsts.BUTTON_SIZE);
        button.setFont(NotepadConsts.GENERAL_FONT);
        button.setFocusable(false);
        button.setOpaque(true);
        button.setBackground(NotepadConsts.BUTTON_BACKGROUND_COLOR);
        button.setBorder(BorderFactory.createEtchedBorder(NotepadConsts.BUTTON_HIGHLIGHT_COLOR, NotepadConsts.BUTTON_SHADOW_COLOR));

        return button;
    }

    public static class InformationDialog extends JDialog {

        public InformationDialog(String information, int informationType) {
            JButton verifyButton = new JButton("确定");
            verifyButton.setBackground(NotepadConsts.BUTTON_BACKGROUND_COLOR);
            verifyButton.setFont(NotepadConsts.GENERAL_FONT);
            verifyButton.addActionListener(e -> dispose());
            verifyButton.setFocusable(false);

            JOptionPane optionPane = new JOptionPane(
                    information,
                    informationType,
                    JOptionPane.DEFAULT_OPTION);
            optionPane.setOptions(new Object[]{verifyButton});

            add(optionPane);
            setModal(true);
            setIconImage(NotepadImages.DOZEN_LEE_LOGO.getImage());
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setSize(NotepadConsts.INFORMATION_DIALOG_SIZE);
            setLocation(NotepadUtil.getPointToCentralWindow(NotepadConsts.SCREEN_SIZE, NotepadConsts.INFORMATION_DIALOG_SIZE));
        }

        public void showDialog() {
            setVisible(true);
        }
    }
}
