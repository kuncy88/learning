package hu.kuncystem.designpattern.bridge;

/**
 * Class Comment
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 18, 2018
 *  
 * @version 1.0
 */
public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing circle [color: red, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }

}
