package pers.dozenlee.exp.exp4.exp4_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main {
    private final Frame frame = new Frame("Horse Race Lamp");

    private final myCanvas canvas = new myCanvas();

    private final int defaultX = 800;
    private int stringX = defaultX;

    private final ActionListener timerTask = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (stringX < canvas.getX() - 190) stringX = defaultX;
            else stringX -= 5;
            canvas.repaint();
        }

    };

    public void init() {
        canvas.setPreferredSize(new Dimension(800, 500));
        frame.add(canvas);

        Timer timer = new Timer(100, timerTask);
        timer.start();

        frame.pack();
        frame.setVisible(true);
    }

    private class myCanvas extends Canvas {
        private final Color[] colorList = { Color.CYAN, Color.BLUE, Color.RED, Color.YELLOW, Color.GREEN, Color.MAGENTA, Color.PINK};

        Random rand = new Random();

        @Override
        public void paint(Graphics g) {
            g.setFont(new Font("Times", Font.BOLD, 50));
            g.setColor(colorList[rand.nextInt(colorList.length)]);
            int stringY = 250;
            g.drawString("Test String", stringX, stringY);
        }
    }

    public static void main(String[] args) {
        new Main().init();
    }
}
