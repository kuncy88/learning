package hu.kuncystem.designpattern.flyweight;

import hu.kuncystem.designpattern.PatternTest;

/**
 * This pattern reduce the number of objects created. If we have to create lots
 * of same object, we can use this, because it use an inner HashMap which
 * contains all of objects which have already created. In this example the key
 * is the color.
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 18, 2018
 * 
 * @version 1.0
 */
public class Flyweight implements PatternTest {
    private static final String[] colors = { "Red", "Blue", "White", "Black", "Purple" };

    @Override
    public void test() {
        for (int i = 1; i <= 10; i++) {
            Circle c = (Circle) ShapeFactory.getCircle(getColor());
            c.setX(getRandomNumber());
            c.setY(getRandomNumber());
            c.setRadius(100);
            c.draw();
        }
    }

    private String getColor() {
        Double d = Math.random() * colors.length;
        return colors[d.intValue()];
    }

    private int getRandomNumber() {
        Double d = Math.random() * 100;
        return d.intValue();
    }

}
