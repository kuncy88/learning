package hu.kuncystem.designpattern.facade;

import hu.kuncystem.designpattern.flyweight.Shape;

/**
 * Class Comment
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 18, 2018
 *  
 * @version 1.0
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }

}
