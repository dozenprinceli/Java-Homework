package pers.dozenlee.exp.exp4.exp4_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * @author DozenPrince Li
 * @date 2022/3/25
 */
public class Main {
    public static void main(String[] args) {
        new MyFrame().init();
    }
}

@SuppressWarnings("FieldMayBeFinal")
class MyFrame extends JFrame {
    private JFrame frame;
    private final int DEFAULT_WIDTH = 800;
    private final int DEFAULT_HEIGHT = 540;

    private JButton buttonNorth = new JButton("<html><center>North Button</center></html>");
    private JButton buttonSouth = new JButton("<html><center>South Button</center></html>");
    private JButton buttonEast = new JButton("<html><center>East<br>Button</center></html>");
    private JButton buttonWest = new JButton("<html><center>West<br>Button</center></html>");

    public MyFrame() {
        frame = new JFrame("BorderLayout Test");
        ImageIcon icon = new ImageIcon("X:\\JAVA\\Java-Homework\\src\\swing\\nameLogo" +
                ".jpg");
        frame.setIconImage(icon.getImage());
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

    public void init() {

        JLabel label = new JLabel();
        label.setForeground(new Color(0x599EDC));
        label.setBackground(new Color(0x282C34));
        label.setOpaque(true);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setFont(new Font("Lucida Handwriting", Font.ITALIC, 50));

        buttonNorth.setPreferredSize(new Dimension(100, 75));
        buttonSouth.setPreferredSize(new Dimension(100, 75));
        buttonEast.setPreferredSize(new Dimension(150, 100));
        buttonWest.setPreferredSize(new Dimension(150, 100));

        buttonNorth.setFocusable(false);
        buttonSouth.setFocusable(false);
        buttonEast.setFocusable(false);
        buttonWest.setFocusable(false);
        
        buttonNorth.setFont(new Font("黑体", Font.BOLD, 25));
        buttonSouth.setFont(new Font("黑体", Font.BOLD, 25));
        buttonEast.setFont(new Font("黑体", Font.BOLD, 25));
        buttonWest.setFont(new Font("黑体", Font.BOLD, 25));

        buttonNorth.setForeground(Color.darkGray);
        buttonSouth.setForeground(Color.darkGray);
        buttonEast.setForeground(Color.darkGray);
        buttonWest.setForeground(Color.darkGray);

        buttonNorth.setBorder(BorderFactory.createEtchedBorder());
        buttonSouth.setBorder(BorderFactory.createEtchedBorder());
        buttonEast.setBorder(BorderFactory.createEtchedBorder());
        buttonWest.setBorder(BorderFactory.createEtchedBorder());

        buttonNorth.setBackground(Color.lightGray);
        buttonSouth.setBackground(Color.lightGray);
        buttonEast.setBackground(Color.lightGray);
        buttonWest.setBackground(Color.lightGray);

        ActionListener actionListener = e -> {
            String text = e.getActionCommand().replaceAll(" ", "<br>");
            label.setText(text);

            setAllButtonEnable();
            JButton source = (JButton) e.getSource();
            source.setEnabled(false);
        };

        buttonNorth.addActionListener(actionListener);
        buttonSouth.addActionListener(actionListener);
        buttonEast.addActionListener(actionListener);
        buttonWest.addActionListener(actionListener);

        frame.add(label);
        frame.add(buttonNorth, BorderLayout.NORTH);
        frame.add(buttonSouth, BorderLayout.SOUTH);
        frame.add(buttonEast, BorderLayout.EAST);
        frame.add(buttonWest, BorderLayout.WEST);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        Point point = new Point((int) ((dimension.getWidth() - DEFAULT_WIDTH) / 2),
                (int) ((dimension.getHeight() - DEFAULT_HEIGHT) / 2));
        frame.setLocation(point);
        frame.setVisible(true);
    }

    private void setAllButtonEnable() {
        buttonNorth.setEnabled(true);
        buttonSouth.setEnabled(true);
        buttonEast.setEnabled(true);
        buttonWest.setEnabled(true);
    }
}
