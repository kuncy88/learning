package hu.kuncystem.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Class Comment
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 18, 2018
 *  
 * @version 1.0
 */
public class ShapeFactory {
    private final static Map<String, Circle> circleMap = new HashMap<>();
    
    public static Shape getCircle(String color) {
        Circle circle = circleMap.get(color);
        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color: " + color);
        }
        
        return circle;
    }
}
