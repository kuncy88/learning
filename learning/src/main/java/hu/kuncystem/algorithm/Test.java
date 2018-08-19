package hu.kuncystem.algorithm;

/**
 * Class Comment
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 19, 2018
 *  
 * @version 1.0
 */
public abstract class Test {  
    public Test() {
    }
    
    protected void test(Class<?> obj) {
        System.out.println("\n --- " + obj.getName() + " --- ");
        this.run();
    }
    
    public abstract void test();
    
    protected abstract void run();
}
