package wyman.game;

import wyman.game.pojo.ImagePojo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @ClassName: FFrame
 * @Description: second step
 * @Author: Wyman
 * @Date: 2020/9/16 19:53
 **/

public class FFrame extends JFrame {
    public FFrame() {
        this.setTitle("憨憨就是涵涵");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(3000, 2000);
        //        this.setVisible(true);

        final Image image = new ImageIcon("src\\main\\resources\\image\\2.jpg").getImage();
        final ImagePojo imagePojo = new ImagePojo();
        imagePojo.setImage(image);
        imagePojo.setX(30);
        imagePojo.setY(30);
        FPanel panel = new FPanel(imagePojo);
        this.add(panel);
        this.setVisible(true);

        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(500);
//                imagePojo.setX(imagePojo.getX() + 10);
//                imagePojo.setY(imagePojo.getY() + 10);
//                panel.repaint();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //Man-machine interaction
            this.addKeyListener(new KeyListener() {

                public void keyTyped(KeyEvent e) {
                }

                @Override public void keyPressed(KeyEvent e) {
                    if (KeyEvent.VK_W == e.getKeyCode()) {
                        imagePojo.setY(imagePojo.getY() - 5);
                    } else if (KeyEvent.VK_S == e.getKeyCode()) {
                        imagePojo.setY(imagePojo.getY() + 5);
                    } else if (KeyEvent.VK_A == e.getKeyCode()) {
                        imagePojo.setX(imagePojo.getX() - 5);
                    } else if (KeyEvent.VK_D == e.getKeyCode()) {
                        imagePojo.setX(imagePojo.getX() + 5);
                    }

                }

                public void keyReleased(KeyEvent e) {

                }
            });
            panel.repaint();
        }
    }

    public static void main(String[] args) {
        FFrame fFrame = new FFrame();
    }
}
