 package homework4_1;

 import java.awt.Button;
 import java.awt.Frame;
 import java.awt.Label;
 import java.awt.BorderLayout;
 import java.awt.event.ActionListener;
 import java.awt.event.ActionEvent;
 import java.awt.event.WindowAdapter;
 import java.awt.event.WindowEvent;

 /**
 * 编写程序，使用BorderLayout的布局策略在五个位置分别加入四个按钮和一个标签，当点击按钮时，标签的文本就是按钮的标签的文本
 */
 public class homework4_1 {
    // Frame initialized
    private Frame TestFrame = new Frame("Test Frame");

    // Button initialized
    private Button nButton = new Button("North Button");
    private Button wButton = new Button("West Button");
    private Button sButton = new Button("South Button");
    private Button eButton = new Button("East Button");

    // Label initialized
    private Label displayLabel = new Label(null, Label.CENTER);

    // Label show words if button clicked
    private class ClickButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
            String location = e.getActionCommand();
            displayLabel.setText(location + " Clicked");
		}
        
    }

    // Initialization function
    public void init() {
        // Bind clickbutton with buttons
        ClickButton clickButton = new ClickButton();
        nButton.addActionListener(clickButton);
        wButton.addActionListener(clickButton);
        sButton.addActionListener(clickButton);
        eButton.addActionListener(clickButton);

        // Add components to main frame
        TestFrame.add(displayLabel);
        TestFrame.add(nButton, BorderLayout.NORTH);
        TestFrame.add(wButton, BorderLayout.WEST);
        TestFrame.add(sButton, BorderLayout.SOUTH);
        TestFrame.add(eButton, BorderLayout.EAST);

        // Use anonymous class to bind windowClosing with TestFrame
        TestFrame.addWindowListener(new WindowAdapter() {
            
            @Override
            public void windowClosing(WindowEvent e) {
                TestFrame.dispose();
            }

        });

        // Set TestFrame to appropriate size and set it visible
        TestFrame.setSize(300, 240);
        TestFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new homework4_1().init();
    }
 }