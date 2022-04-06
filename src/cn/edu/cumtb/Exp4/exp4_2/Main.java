package pers.dozenlee.exp.exp4.exp4_2;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * @author DozenPrince Li
 * @date 2022/3/28
 */
public class Main {

    public static void main(String[] args) {
        new MyFrame().init();
    }
}

class MyFrame extends JFrame implements ChangeListener {

    private static final int FRAME_WIDTH = 550;
    private static final int FRAME_HEIGHT = 500;

    private static final int LABEL_WIDTH = 70;

    private static final Dimension RGB_DIMENSION = new Dimension(80, 320);

    private static final Dimension RGB_PANEL_DIMENSION = new Dimension(80, FRAME_HEIGHT);

    private static final Dimension RGB_LABEL_DIMENSION = new Dimension(40, 40);

    private static final int RGB_MIN_VALUE = 0;
    private static final int RGB_MAX_VALUE = 255;
    private static final int RGB_INITIAL_VALUE = 127;

    private static final Color INITIAL_COLOR = new Color(
            RGB_INITIAL_VALUE,
            RGB_INITIAL_VALUE,
            RGB_INITIAL_VALUE);

    private static final int RGB_MINOR_TICK = 16;
    private static final int RGB_MAJOR_TICK = 255;

    private static final Font RGB_INITIAL_FONT = new Font(
            "Lucida Console", Font.BOLD, 10);

    private static final ImageIcon LOGO_ICON = new ImageIcon(
            "X:\\JAVA\\Java-Homework\\src\\swing\\nameLogo.jpg");

    private JLabel colorLabel;

    private JSlider redSlider;
    private JSlider greenSlider;
    private JSlider blueSlider;

    MyFrame() {
        this.setTitle("Color Selector");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setResizable(false);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
        this.setIconImage(LOGO_ICON.getImage());
    }

    void init() {

        /* Panel Setting */
        JPanel redPanel = new JPanel();
        JPanel greenPanel = new JPanel();
        JPanel bluePanel = new JPanel();

        redPanel.setPreferredSize(RGB_PANEL_DIMENSION);
        greenPanel.setPreferredSize(RGB_PANEL_DIMENSION);
        bluePanel.setPreferredSize(RGB_PANEL_DIMENSION);

        redPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 20));
        greenPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 20));
        bluePanel.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 20));

        /* colorLabel setting */
        colorLabel = new JLabel();
        colorLabel.setPreferredSize(new Dimension(LABEL_WIDTH, FRAME_HEIGHT));
        colorLabel.setBackground(INITIAL_COLOR);
        colorLabel.setOpaque(true);

        /* RGB slider setting */
        redSlider = new JSlider(SwingConstants.VERTICAL, RGB_MIN_VALUE,
                RGB_MAX_VALUE, RGB_INITIAL_VALUE);
        greenSlider = new JSlider(SwingConstants.VERTICAL, RGB_MIN_VALUE,
                RGB_MAX_VALUE, RGB_INITIAL_VALUE);
        blueSlider = new JSlider(SwingConstants.VERTICAL, RGB_MIN_VALUE,
                RGB_MAX_VALUE, RGB_INITIAL_VALUE);

        redSlider.setAlignmentY(JSlider.CENTER);
        greenSlider.setAlignmentY(JSlider.CENTER);
        blueSlider.setAlignmentY(JSlider.CENTER);

        redSlider.setAlignmentX(JSlider.CENTER);
        greenSlider.setAlignmentX(JSlider.CENTER);
        blueSlider.setAlignmentX(JSlider.CENTER);

        redSlider.setPreferredSize(RGB_DIMENSION);
        greenSlider.setPreferredSize(RGB_DIMENSION);
        blueSlider.setPreferredSize(RGB_DIMENSION);

        redSlider.setMinorTickSpacing(RGB_MINOR_TICK);
        greenSlider.setMinorTickSpacing(RGB_MINOR_TICK);
        blueSlider.setMinorTickSpacing(RGB_MINOR_TICK);

        redSlider.setMajorTickSpacing(RGB_MAJOR_TICK);
        greenSlider.setMajorTickSpacing(RGB_MAJOR_TICK);
        blueSlider.setMajorTickSpacing(RGB_MAJOR_TICK);

        redSlider.setPaintTicks(true);
        greenSlider.setPaintTicks(true);
        blueSlider.setPaintTicks(true);

        redSlider.setForeground(Color.gray);
        greenSlider.setForeground(Color.gray);
        blueSlider.setForeground(Color.gray);

        redSlider.setPaintLabels(true);
        greenSlider.setPaintLabels(true);
        blueSlider.setPaintLabels(true);

        redSlider.setFont(RGB_INITIAL_FONT);
        greenSlider.setFont(RGB_INITIAL_FONT);
        blueSlider.setFont(RGB_INITIAL_FONT);

        redSlider.setOpaque(true);
        greenSlider.setOpaque(true);
        blueSlider.setOpaque(true);

        redSlider.addChangeListener(this);
        greenSlider.addChangeListener(this);
        blueSlider.addChangeListener(this);

        /* RGB label setting */
        JLabel redLabel = new JLabel();
        JLabel greenLabel = new JLabel();
        JLabel blueLabel = new JLabel();

        redLabel.setPreferredSize(RGB_LABEL_DIMENSION);
        greenLabel.setPreferredSize(RGB_LABEL_DIMENSION);
        blueLabel.setPreferredSize(RGB_LABEL_DIMENSION);

        redLabel.setOpaque(true);
        greenLabel.setOpaque(true);
        blueLabel.setOpaque(true);

        redLabel.setBackground(Color.red);
        greenLabel.setBackground(Color.green);
        blueLabel.setBackground(Color.blue);

        /* Gap label setting */
        JLabel gapLabel = new JLabel();
        gapLabel.setPreferredSize(new Dimension(40, FRAME_HEIGHT));

        /* Add operations */
        redPanel.add(redSlider);
        redPanel.add(redLabel);

        greenPanel.add(greenSlider);
        greenPanel.add(greenLabel);

        bluePanel.add(blueSlider);
        bluePanel.add(blueLabel);

        this.add(colorLabel);
        this.add(gapLabel);
        this.add(redPanel);
        this.add(greenPanel);
        this.add(bluePanel);
        this.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        Color newColor = new Color(
                redSlider.getValue(),
                greenSlider.getValue(),
                blueSlider.getValue());
        colorLabel.setBackground(newColor);
    }
}
