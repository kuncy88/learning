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
public class RedShapeDecorator extends ShapeDecorator{

    /**
     * this is a constructor
     *
     * @param decoratedShape
     */
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    
    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }
    
    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
