package homework4_4;

import java.util.Random;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

/**
 * 编写一个GUI程序，实现文字跑马灯的效果（举例：LED显示屏上文字滚动显示）
 */
public class homework4_4 {
    private Frame frame = new Frame("Horse Race Lamp");

    private myCanvas canvas = new myCanvas();
    
    private int defaultX = 800;
    private int stringX = defaultX;
    private final int stringY = 250;

    private ActionListener timerTask = new ActionListener() {

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
            g.drawString("Test String", stringX, stringY);
        }
    }
    
    public static void main(String[] args) {
        new homework4_4().init();
    }
}