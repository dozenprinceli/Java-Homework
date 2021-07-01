package AwtStudy.Graphics.PinBallGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Timer;

/**
 * 双人弹球小游戏窗口
 */
public class PinBallGameWindow {
    private Frame pinBallGameWindow= new Frame("Pin Ball Game");

    private final Dimension screenDimension = Toolkit.getDefaultToolkit().getScreenSize();
    private final int screenWidth = (int)screenDimension.getWidth();
    private final int screenHeight = (int)screenDimension.getHeight();
    
    private boolean isStart = false;
    private boolean isOver = false;

    private Canvas PinBallCanvas = new canvas();
    private final Dimension CANVAS_SIZE = new Dimension(800 ,500);

    // 小球参数
    private final int BALL_SIZE = 10;
    private final Color ballColor = Color.RED;
    private double ballSpeedX = 5;
    private double ballSpeedY = 2.5;
    private int ballX = (int)CANVAS_SIZE.getWidth() / 2;
    private int ballY = (int)CANVAS_SIZE.getHeight() / 2;
    
    // 球拍参数
    private final Dimension RACKET_SIZE = new Dimension(10, 80);
    private final int RACKET1X = 5;
    private final int RACKET2X = (int)CANVAS_SIZE.getWidth() - 15;
    private final Color racketColor = Color.BLUE;
    private int racket1Y = (int)CANVAS_SIZE.getHeight()/2 - (int)RACKET_SIZE.getHeight()/2;
    private int racket2Y = (int)CANVAS_SIZE.getHeight()/2 - (int)RACKET_SIZE.getHeight()/2;
    private int RACKET_MOVE = 5;

    // 游戏提示参数
    private final String gameOver = "GAME OVER";
        private final Font gameOverFont = new Font("Times", Font.BOLD, 40);
        private final int gameOverX = (int)CANVAS_SIZE.getWidth()/2 - PinBallCanvas.getFontMetrics(gameOverFont).stringWidth(gameOver)/2;
        private int gameOverY = 150;
    private String winner = "Winner: Player 1";
        private Font winnerFont = new Font("Times", Font.BOLD, 20);
        private final int winnerX = (int)CANVAS_SIZE.getWidth()/2 - PinBallCanvas.getFontMetrics(winnerFont).stringWidth(winner)/2;
        private final int winnerY = 220;
    private final String gameName = "2P Pinball Game";
        private final Font gameNameFont = new Font("Times", Font.BOLD, 40);
        private final int gameNameX = (int)CANVAS_SIZE.getWidth()/2 - PinBallCanvas.getFontMetrics(gameNameFont).stringWidth(gameName)/2;
        private final int gameNameY = 150;
    private final String gameStart = "Press Space to Start Game";
        private final Font gameStartFont = new Font("Times", Font.BOLD, 20);
        private final int gameStartX = (int)CANVAS_SIZE.getWidth()/2 - PinBallCanvas.getFontMetrics(gameStartFont).stringWidth(gameStart)/2;
        private final int gameStartY = 220;

    // 小球运动监听
    private ActionListener ballListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (isStart) {
                if (!isOver) {
                    int ballCenterY = ballY + BALL_SIZE/2;
                    boolean racket1GetBallX = ballX < RACKET1X + RACKET_SIZE.getWidth();
                    boolean racket2GetBallX = ballX > RACKET2X - BALL_SIZE;
                    boolean racket1GetBallY = racket1Y <= ballCenterY && ballCenterY <= racket1Y + RACKET_SIZE.getHeight();
                    boolean racket2GetBallY = racket2Y <= ballCenterY && ballCenterY <= racket2Y + RACKET_SIZE.getHeight();
                    
                    if (ballY <= 0 || ballY >= CANVAS_SIZE.getHeight() - BALL_SIZE) ballSpeedY = -ballSpeedY;
                    if (racket1GetBallX) {
                        if (racket1GetBallY) ballSpeedX = -ballSpeedX;
                        else {
                            isOver = true;
                            winner = "Winner: Player 2";
                            PinBallCanvas.repaint();
                            pinBallTimer.stop();
                        }
                    }
                    if (racket2GetBallX) {
                        if (racket2GetBallY) ballSpeedX = -ballSpeedX;
                        else {
                            isOver = true;
                            winner = "Winner: Player 1";
                            PinBallCanvas.repaint();
                            pinBallTimer.stop();
                        }
                    }
    
                    ballX += ballSpeedX;
                    ballY += ballSpeedY;
                
                    PinBallCanvas.repaint();
                }
            }
        }
    };

    // 时钟监听
    Timer pinBallTimer = new Timer(50, ballListener);

    // 键盘操作监听
    private KeyListener racketOperationListener = new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();

            if (!isStart) isStart = (keyCode == KeyEvent.VK_SPACE);
            else {
                boolean racket1TouchTop = racket1Y < 0;
                boolean rancket1TouchBottom = CANVAS_SIZE.getHeight() < racket1Y + RACKET_SIZE.getHeight();
                boolean racket2TouchTop = racket2Y < 0;
                boolean racket2TouchBottom = CANVAS_SIZE.getHeight() < racket2Y + RACKET_SIZE.getHeight();
            
                if (keyCode == KeyEvent.VK_W && !racket1TouchTop) racket1Y -= RACKET_MOVE;
                if (keyCode == KeyEvent.VK_S && !rancket1TouchBottom) racket1Y += RACKET_MOVE;

                if (keyCode == KeyEvent.VK_UP && !racket2TouchTop) racket2Y -= RACKET_MOVE;
                if (keyCode == KeyEvent.VK_DOWN && !racket2TouchBottom) racket2Y += RACKET_MOVE;
            }
        }
    };

    // 关闭窗口监听
    private WindowListener windowClosingListener = new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            pinBallGameWindow.dispose();
        }
    };

    // 画布重写paint方法
    class canvas extends Canvas {
        @Override public void paint(Graphics g) {
            if (isStart) {
                if (isOver) {
                    g.setFont(gameOverFont);
                    g.drawString(gameOver, gameOverX, gameOverY);
                    g.setFont(winnerFont);
                    g.drawString(winner, winnerX, winnerY);
                }
                else{
                    g.setColor(ballColor);
                    g.fillOval(ballX, ballY, BALL_SIZE, BALL_SIZE);
                    g.setColor(racketColor);
                    g.fillRect(RACKET1X, racket1Y, (int)RACKET_SIZE.getWidth(), (int)RACKET_SIZE.getHeight());
                    g.fillRect(RACKET2X, racket2Y, (int)RACKET_SIZE.getWidth(), (int)RACKET_SIZE.getHeight());
                }
            }else {
                g.setFont(gameNameFont);
                g.drawString(gameName, gameNameX, gameNameY);
                g.setFont(gameStartFont);
                g.drawString(gameStart, gameStartX, gameStartY);
            }
        }
    }
    
    // 初始化窗口
    public void PinBallGameWindowInit() {
        PinBallCanvas.setPreferredSize(CANVAS_SIZE);
        pinBallGameWindow.add(PinBallCanvas);

        pinBallGameWindow.addKeyListener(racketOperationListener);
        PinBallCanvas.addKeyListener(racketOperationListener);

        pinBallGameWindow.addWindowListener(windowClosingListener);

        pinBallTimer.start();

        pinBallGameWindow.pack();
        pinBallGameWindow.setLocation(screenWidth/2 - pinBallGameWindow.getWidth()/2, screenHeight/2 - pinBallGameWindow.getHeight()/2);
        pinBallGameWindow.setVisible(true);
    }
}