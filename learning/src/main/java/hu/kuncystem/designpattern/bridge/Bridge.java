package hu.kuncystem.designpattern.bridge;

import hu.kuncystem.designpattern.PatternTest;

/**
 * If we use this pattern we can decoupling the functions. In this example we
 * create an circle but the client can choose the drawing method.
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 18, 2018
 * 
 * @version 1.0
 */
public class Bridge implements PatternTest {

    @Override
    public void test() {
        Shape red = new Circle(100, 10, 3, new RedCircle());
        Shape green = new Circle(34, 75, 98, new GreenCircle());

        red.draw();
        green.draw();
    }

}
