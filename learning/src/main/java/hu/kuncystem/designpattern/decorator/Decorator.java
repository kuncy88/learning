package hu.kuncystem.designpattern.decorator;

import hu.kuncystem.designpattern.PatternTest;
import hu.kuncystem.designpattern.facade.Circle;
import hu.kuncystem.designpattern.facade.Rectangle;
import hu.kuncystem.designpattern.flyweight.Shape;

/**
 * The pattern allows to the user to add new functionality to an existing object
 * without altering structure. In this example, we have an circle with default
 * border. We don't modify this shape, rather we creating an new decorator
 * object which draw other border.
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 18, 2018
 * 
 * @version 1.0
 */
public class Decorator implements PatternTest {

    @Override
    public void test() {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle with red border");
        redCircle.draw();

        System.out.println("\nRectangle with red border");
        redRectangle.draw();
    }

}
