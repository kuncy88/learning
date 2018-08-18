package hu.kuncystem.designpattern.flyweight;

/**
 * Class Comment
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 18, 2018
 *  
 * @version 1.0
 */
public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;
    
        
    public Circle(String color) {
        this.color = color;
    }


    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }


    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }


    /**
     * @param radius the radius to set
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }


    @Override
    public void draw() {
        System.out.println("Circle.Draw() [Color: " + color + ", x: " + x + ", y: " + y + ", radius: " + radius + "]");
    }
}
