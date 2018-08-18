package hu.kuncystem.designpattern.facade;

import hu.kuncystem.designpattern.PatternTest;

/**
 * This pattern hide the complexities of the system. We have more objects, but we use just ones to work.
 * Complexities of the system will hide from the client.
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 18, 2018
 *  
 * @version 1.0
 */
public class Facade implements PatternTest {

    @Override
    public void test() {
        ShapeMaker maker = new ShapeMaker();
        maker.drawCircle();
        maker.drawRectangle();
        maker.drawSquare();
    }

}
