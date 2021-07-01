package AwtStudy.Graphics.PinBallGame;

/**
 * 双人弹球小游戏主函数
 */
public class PinBallGameMain {
    public static void main(String[] args) {
        try {
            new PinBallGameWindow().PinBallGameWindowInit();
        }
        catch(Exception e) {
            System.out.println(e.getCause());
        }
    }
}