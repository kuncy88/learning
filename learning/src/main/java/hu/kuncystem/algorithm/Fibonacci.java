package hu.kuncystem.algorithm;

/**
 * Class Comment
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 19, 2018
 *  
 * @version 1.0
 */
public class Fibonacci extends Test {
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
        int num = this.recursive(number);
        System.out.println("Fibonacci recursive: " + num);
        
        num = this.iterative(number);
        System.out.println("Fibonacci iterative: " + num);
    }
    
    private int recursive(int n) {
        if(n <= 1) {
            return n;
        }else {
            return recursive(n - 1) + recursive(n - 2);
        }
    }
    
    protected int iterative(int n) {
        if(n == 0) {
            return 0;
        }
        int current = 1;
        int prev = 0, tmp = 0;
        while(n > 1) {
            tmp = current;
            current = current + prev;
            prev = tmp;
            n--;
        }        
        return current;
    }
}
