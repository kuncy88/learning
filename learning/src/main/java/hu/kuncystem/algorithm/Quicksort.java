package hu.kuncystem.algorithm;

import java.util.Arrays;

/**
 * Class Comment
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 19, 2018
 *  
 * @version 1.0
 */
public class Quicksort extends Test{
    private int[] array;
    int counter = 0;
    public void test(int[] array) {
        this.array = array;
        test();
    }
    @Override
    public void test() {
        super.test(getClass());
    }

    @Override
    protected void run() {
        
    }
    
    private void sort(int left, int right) {
        if(left >= right) {
            return;
        }
        int pivot = array[(left+right)/2];
    }

}
