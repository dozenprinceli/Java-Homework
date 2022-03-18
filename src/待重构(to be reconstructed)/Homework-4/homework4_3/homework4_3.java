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
 * ��дһ���򵥵��ı��༭����������ʽ���ա�Windowsϵͳ�еļ��±���
 */
public class homework4_3 {
    private Frame Notebook = new Frame("Notebook");
        private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        private int screenWidth = (int)screenSize.getWidth();
        private int screenHeight = (int)screenSize.getHeight();
    
    private TextArea textArea = new TextArea("\0", 30, 100, TextArea.SCROLLBARS_VERTICAL_ONLY);

    private MenuItem seprBarItem = new MenuItem("-");

    private MenuBar notebookMenuBar = new MenuBar();

    private Menu fileMenu = new Menu("�ļ�(F)");
        private MenuItem newFileItem = new MenuItem("�½�", new MenuShortcut(KeyEvent.VK_N));
        private MenuItem newWindowItem = new MenuItem("�´���", new MenuShortcut(KeyEvent.VK_N, true));
        private MenuItem openFileItem = new MenuItem("��", new MenuShortcut(KeyEvent.VK_O));
        private MenuItem saveFileItem = new MenuItem("����", new MenuShortcut(KeyEvent.VK_S));
        private MenuItem otherSaveFileItem = new MenuItem("���Ϊ", new MenuShortcut(KeyEvent.VK_S, true));
        private MenuItem pageSettingItem = new MenuItem("ҳ������");
        private MenuItem printItem = new MenuItem("��ӡ", new MenuShortcut(KeyEvent.VK_P));
        private MenuItem exitItem = new MenuItem("�˳�");

    private Menu editMenu = new Menu("�༭(E)");
        private MenuItem cancelItem = new MenuItem("����", new MenuShortcut(KeyEvent.VK_Z));
        private MenuItem cutItem = new MenuItem("����", new MenuShortcut(KeyEvent.VK_X));
        private MenuItem copyItem = new MenuItem("����", new MenuShortcut(KeyEvent.VK_C));
        private MenuItem pasteItem = new MenuItem("ճ��", new MenuShortcut(KeyEvent.VK_V));
        private MenuItem deleteItem = new MenuItem("ɾ��", new MenuShortcut(KeyEvent.VK_DELETE));
        private MenuItem searchInternetItem = new MenuItem("��������", new MenuShortcut(KeyEvent.VK_E));
        private MenuItem lookForItem = new MenuItem("����", new MenuShortcut(KeyEvent.VK_F));
        private MenuItem lookForLastItem = new MenuItem("������һ��", new MenuShortcut(KeyEvent.VK_F3));
        private MenuItem lookForNextItem = new MenuItem("������һ��", new MenuShortcut(KeyEvent.VK_F3, true));
        private MenuItem alterItem = new MenuItem("�滻", new MenuShortcut(KeyEvent.VK_H));
        private MenuItem goToItem = new MenuItem("ת��", new MenuShortcut(KeyEvent.VK_G));
        private MenuItem allSelectItem = new MenuItem("ȫѡ", new MenuShortcut(KeyEvent.VK_A));
        private MenuItem dateItem = new MenuItem("����", new MenuShortcut(KeyEvent.VK_F5));

    private Menu formatMenu = new Menu("��ʽ(O)");
        private CheckboxMenuItem autoEnterItem = new CheckboxMenuItem("�Զ�����");
        private MenuItem fontItem = new MenuItem("����");

    private Menu lookMenu = new Menu("�鿴(V)");
        private Menu sizeMenu = new Menu("����");
            private MenuItem magSizeItem = new MenuItem("�Ŵ�", new MenuShortcut(KeyEvent.VK_PLUS));
            private MenuItem shrinkSizenItem = new MenuItem("��С", new MenuShortcut(KeyEvent.VK_MINUS));
            private MenuItem setDefaultSizeItem = new MenuItem("�ָ�Ĭ������", new MenuShortcut(KeyEvent.VK_0));
        private CheckboxMenuItem showStatusBarItem = new CheckboxMenuItem("״̬��");

    private Menu helpMenu = new Menu("����(H)");
        private MenuItem seeHelpItem = new MenuItem("�鿴����");
        private MenuItem sendFeedbackItem = new MenuItem("���ͷ���");
        private MenuItem aboutNotebookItem = new MenuItem("���ڼ��±�");
    
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
        // �ṩ������չ��
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