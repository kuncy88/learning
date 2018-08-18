package hu.kuncystem.designpattern.bridge;

/**
 * Class Comment
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 18, 2018
 *  
 * @version 1.0
 */
public class Circle extends Shape{
    protected int x, y, radius;
    /**
     * this is a constructor
     *
     * @param drawAPI
     */
    protected Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        
        this.x = x;
        this.y = y;
        this.radius = radius;
        
        this.drawAPI = drawAPI;
        
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }

}
