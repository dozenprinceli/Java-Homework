package homework4_3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Menu;
import java.awt.MenuShortcut;
import java.awt.CheckboxMenuItem;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.Toolkit;

/**
 * 编写一个简单的文本编辑器，具体形式参照“Windows系统中的记事本”
 */
public class homework4_3 {
    private Frame Notebook = new Frame("Notebook");
        private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        private int screenWidth = (int)screenSize.getWidth();
        private int screenHeight = (int)screenSize.getHeight();
    
    private TextArea textArea = new TextArea("\0", 30, 100, TextArea.SCROLLBARS_VERTICAL_ONLY);

    private MenuItem seprBarItem = new MenuItem("-");

    private MenuBar notebookMenuBar = new MenuBar();

    private Menu fileMenu = new Menu("文件(F)");
        private MenuItem newFileItem = new MenuItem("新建", new MenuShortcut(KeyEvent.VK_N));
        private MenuItem newWindowItem = new MenuItem("新窗口", new MenuShortcut(KeyEvent.VK_N, true));
        private MenuItem openFileItem = new MenuItem("打开", new MenuShortcut(KeyEvent.VK_O));
        private MenuItem saveFileItem = new MenuItem("保存", new MenuShortcut(KeyEvent.VK_S));
        private MenuItem otherSaveFileItem = new MenuItem("另存为", new MenuShortcut(KeyEvent.VK_S, true));
        private MenuItem pageSettingItem = new MenuItem("页面设置");
        private MenuItem printItem = new MenuItem("打印", new MenuShortcut(KeyEvent.VK_P));
        private MenuItem exitItem = new MenuItem("退出");

    private Menu editMenu = new Menu("编辑(E)");
        private MenuItem cancelItem = new MenuItem("撤销", new MenuShortcut(KeyEvent.VK_Z));
        private MenuItem cutItem = new MenuItem("剪切", new MenuShortcut(KeyEvent.VK_X));
        private MenuItem copyItem = new MenuItem("复制", new MenuShortcut(KeyEvent.VK_C));
        private MenuItem pasteItem = new MenuItem("粘贴", new MenuShortcut(KeyEvent.VK_V));
        private MenuItem deleteItem = new MenuItem("删除", new MenuShortcut(KeyEvent.VK_DELETE));
        private MenuItem searchInternetItem = new MenuItem("联网搜索", new MenuShortcut(KeyEvent.VK_E));
        private MenuItem lookForItem = new MenuItem("查找", new MenuShortcut(KeyEvent.VK_F));
        private MenuItem lookForLastItem = new MenuItem("查找上一个", new MenuShortcut(KeyEvent.VK_F3));
        private MenuItem lookForNextItem = new MenuItem("查找下一个", new MenuShortcut(KeyEvent.VK_F3, true));
        private MenuItem alterItem = new MenuItem("替换", new MenuShortcut(KeyEvent.VK_H));
        private MenuItem goToItem = new MenuItem("转到", new MenuShortcut(KeyEvent.VK_G));
        private MenuItem allSelectItem = new MenuItem("全选", new MenuShortcut(KeyEvent.VK_A));
        private MenuItem dateItem = new MenuItem("日期", new MenuShortcut(KeyEvent.VK_F5));

    private Menu formatMenu = new Menu("格式(O)");
        private CheckboxMenuItem autoEnterItem = new CheckboxMenuItem("自动换行");
        private MenuItem fontItem = new MenuItem("字体");

    private Menu lookMenu = new Menu("查看(V)");
        private Menu sizeMenu = new Menu("缩放");
            private MenuItem magSizeItem = new MenuItem("放大", new MenuShortcut(KeyEvent.VK_PLUS));
            private MenuItem shrinkSizenItem = new MenuItem("缩小", new MenuShortcut(KeyEvent.VK_MINUS));
            private MenuItem setDefaultSizeItem = new MenuItem("恢复默认缩放", new MenuShortcut(KeyEvent.VK_0));
        private CheckboxMenuItem showStatusBarItem = new CheckboxMenuItem("状态栏");

    private Menu helpMenu = new Menu("帮助(H)");
        private MenuItem seeHelpItem = new MenuItem("查看帮助");
        private MenuItem sendFeedbackItem = new MenuItem("发送反馈");
        private MenuItem aboutNotebookItem = new MenuItem("关于记事本");
    
    private Panel statusPanel = new Panel();
        private Label windowsLabel = new Label("Windows(CRLF)");
        private Label encodingLabel = new Label("UTF-8");

    private WindowAdapter windowClosing = new WindowAdapter() {
        
        @Override
        public void windowClosing(WindowEvent e) {
            Notebook.dispose();
        }

    };

    
    
    
    
    private void combineFileMenu() {
        fileMenu.add(newFileItem);
        fileMenu.add(newWindowItem);
        fileMenu.add(openFileItem);
        fileMenu.add(saveFileItem);
        fileMenu.add(otherSaveFileItem);
            fileMenu.add(seprBarItem);
        fileMenu.add(pageSettingItem);
        fileMenu.add(printItem);
            fileMenu.add(seprBarItem);
        fileMenu.add(exitItem);
    }

    private void combineEditMenu() {
        editMenu.add(cancelItem);
            editMenu.add(seprBarItem);
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        editMenu.add(deleteItem);
            editMenu.add(seprBarItem);
        editMenu.add(searchInternetItem);
        editMenu.add(lookForItem);
        editMenu.add(lookForLastItem);
        editMenu.add(lookForNextItem);
        editMenu.add(alterItem);
        editMenu.add(goToItem);
            editMenu.add(seprBarItem);
        editMenu.add(allSelectItem);
        editMenu.add(dateItem);
    }

    private void combineFormatMenu() {
        // 提供代码扩展性
        autoEnterItem.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                ;
            }
            
        });
        
        formatMenu.add(autoEnterItem);
        formatMenu.add(fontItem);
    }

    private void combineLookMenu() {
        showStatusBarItem.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) statusPanel.setVisible(true);
                if (e.getStateChange() == ItemEvent.DESELECTED) statusPanel.setVisible(false);
            }
            
        });
        
        sizeMenu.add(magSizeItem);
        sizeMenu.add(shrinkSizenItem);
        sizeMenu.add(setDefaultSizeItem);

        lookMenu.add(sizeMenu);
        lookMenu.add(showStatusBarItem);
    }

    private void combineHelpMenu() {
        helpMenu.add(seeHelpItem);
        helpMenu.add(sendFeedbackItem);
            helpMenu.add(seprBarItem);
        helpMenu.add(aboutNotebookItem);
    }

    private void combineMenuBar() {
        combineFileMenu();
        combineEditMenu();
        combineFormatMenu();
        combineLookMenu();
        combineHelpMenu();

        notebookMenuBar.add(fileMenu);
        notebookMenuBar.add(editMenu);
        notebookMenuBar.add(formatMenu);
        notebookMenuBar.add(lookMenu);
        notebookMenuBar.add(helpMenu);
    }
    
    private void combineStatusBox() {
        statusPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 0));
        
        statusPanel.add(windowsLabel);
        statusPanel.add(new Label("|"));
        statusPanel.add(encodingLabel);
    }

    
    
    
    
    public void init() {
        combineMenuBar();
        combineStatusBox();

        Notebook.setMenuBar(notebookMenuBar);
        Notebook.add(textArea);
        Notebook.add(statusPanel, BorderLayout.SOUTH);

        Notebook.addWindowListener(windowClosing);
        Notebook.pack();
        int notebookWidth = (int)Notebook.getSize().getWidth();
        int notebookHeight = (int)Notebook.getSize().getHeight();
        Notebook.setLocation(screenWidth/2 - notebookWidth/2, screenHeight/2 - notebookHeight/2);
        Notebook.setVisible(true);
    }

    public static void main(String[] args) {
        new homework4_3().init();
    }
}