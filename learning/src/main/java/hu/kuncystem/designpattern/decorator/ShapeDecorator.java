package hu.kuncystem.designpattern.decorator;

import hu.kuncystem.designpattern.flyweight.Shape;
/**
 * Class Comment
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 18, 2018
 *  
 * @version 1.0
 */
public abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;
    
    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }
    
    public void draw() {
        decoratedShape.draw();
    }
}
