package pers.dozenlee.notepad.gui.img;

import javax.swing.*;

/**
 * @author DozenPrince Li
 * @date 2022/3/30
 * 提供所有Notepad需要的图片文件引用
 */
public class NotepadImages {

    private NotepadImages() {}

    /**
     * DozenLee的logo，用于替代Windows记事本中原有的记事本图标
     */
    public static final ImageIcon DOZEN_LEE_LOGO = new ImageIcon("src/pers/dozenlee/notepad/gui/img/DozenleeLogo.jpg");

    /**
     * ”关于“页面的标题，这里使用了B站的2022春图片用于替换原本的Windows10图片
     */
    public static final ImageIcon ABOUT_PAGE_TITLE = new ImageIcon("src/pers/dozenlee/notepad/gui/img/AboutPageTitle.png");

    /**
     * 页面设置的横向预览图
     */
    public static final ImageIcon PREVIEW_HORIZONTAL = new ImageIcon("src/pers/dozenlee/notepad/gui/img/previewHorizontal.jpg");

    /**
     * 页面设置的纵向预览图
     */
    public static final ImageIcon PREVIEW_VERTICAL = new ImageIcon("src/pers/dozenlee/notepad/gui/img/previewVertical.jpg");
}
