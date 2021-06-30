package homework4_2;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 设计一个标签，三个滚动条，分别表示红、绿、蓝三种颜色，改变滑块的值，从而改变标签背景的颜色
 */
public class homework4_2 {
    private Frame TestFrame = new Frame("Test Frame");
    
    private Panel mainPanel = new Panel();

    private Label label = new Label();

    private Scrollbar RedScrollBar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);
    private Scrollbar GreenScrollBar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);
    private Scrollbar BlueScrollBar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);

    private class ScrollbarChange implements AdjustmentListener {

        @Override
        public void adjustmentValueChanged(AdjustmentEvent e) {
            // TODO Auto-generated method stub
            TestFrame.setBackground(new Color(RedScrollBar.getValue(), GreenScrollBar.getValue(), BlueScrollBar.getValue()));
            label.setBackground(new Color(RedScrollBar.getValue(), GreenScrollBar.getValue(), BlueScrollBar.getValue()));
        }
        
    }

    public void init() {
        TestFrame.setBackground(Color.WHITE);
        label.setBackground(Color.BLACK);
        
        ScrollbarChange scrollbarChange = new ScrollbarChange();
        RedScrollBar.addAdjustmentListener(scrollbarChange);
        GreenScrollBar.addAdjustmentListener(scrollbarChange);
        BlueScrollBar.addAdjustmentListener(scrollbarChange);

        mainPanel.setLayout(new GridLayout(6, 1));

        mainPanel.add(new Label("Red"));
        mainPanel.add(RedScrollBar);

        mainPanel.add(new Label("Green"));
        mainPanel.add(GreenScrollBar);

        mainPanel.add(new Label("Blue"));
        mainPanel.add(BlueScrollBar);

        TestFrame.add(mainPanel);
        TestFrame.add(label, "North");

        TestFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                TestFrame.dispose();
            }
        });
        
        TestFrame.pack();
        TestFrame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new homework4_2().init();
    }
}