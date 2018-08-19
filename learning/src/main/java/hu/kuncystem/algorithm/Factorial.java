package hu.kuncystem.algorithm;

/**
 * Class Comment
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 19, 2018
 *  
 * @version 1.0
 */
public class Factorial extends Test {
    int number = 0;
    
    public void test(int number) {
        this.number = number;
        this.test();
    }
    
    @Override
    public void test() {
       super.test(getClass());
    }

    @Override
    protected void run() {
       int num = recursive(number);
       System.out.println("Factorial recursive: " + num);
          
       num = iterative(number);
       System.out.println("Factorial iterative: " + num);
    }
    
    private int recursive(int n) {
        if(n == 0) {
            return 1;
        }
        return n * recursive(n-1);
    }
    
    private int iterative(int n) {
        if(n == 0) {
            return 1;
        }
        int fact = n;
        while(n > 1) {
            fact *= --n;
        }
        return fact;
    }
}
