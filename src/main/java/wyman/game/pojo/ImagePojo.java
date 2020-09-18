package wyman.game.pojo;

import lombok.Data;

import java.awt.*;

/**
 * @ClassName: ImagePojo
 * @Description: 图片
 * @Author: Wyman
 * @Date: 2020/9/17 16:39
 **/
@Data
public class ImagePojo {

    private Image image;
    private int x,y,width,height;

}
