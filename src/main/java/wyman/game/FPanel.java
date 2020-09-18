package wyman.game;

import wyman.game.pojo.ImagePojo;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName: Start
 * @Description: first step
 * @Author: Wyman
 * @Date: 2020/9/16 19:47
 **/

public class FPanel extends JPanel {
    private ImagePojo image;

    public FPanel(ImagePojo image) {
        this.image = image;
    }

    @Override public void paint(Graphics g) {
        super.paint(g);

        g.drawImage(image.getImage(), image.getX(), image.getY(), null);

    }
}

