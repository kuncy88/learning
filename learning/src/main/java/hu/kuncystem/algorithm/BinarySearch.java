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
public class BinarySearch extends Test{

    private int[] array;
    private int needle;
    
    public void test(int[] array, int needle) {
        this.array = array;
        this.needle = needle;
        this.test();
    }
    @Override
    public void test() {
        super.test(getClass());
    }

    /* (non-Javadoc)
     * @see hu.kuncystem.algorithm.Test#run()
     */
    @Override
    protected void run() {
        Arrays.sort(array);
        
       /* int middle = array.length/2;
        if(array[middle] < needle) {
            search(0, middle);
        }else if(array[middle] > needle) {
            
        }else {
            //found
        }*/
        System.out.println("Found: " + search(0, array.length-1));
        System.out.println("Found: " + searchIterative());
    }
    
    private boolean search(int left, int right) {
        if(left > right){
            return false;
        }else {
            int middle = left + ((right - left) / 2);
            if(array[middle] > needle) {
                return search(left, middle);
            }else if(array[middle] < needle) {
                return search(middle + 1, right);
            }else {
                return true;
            }
        }
    }
    
    private boolean searchIterative() {
        int left = 0;
        int right = array.length-1;
        while(left <= right) {
            if(left > right){
                return false;
            }else {
                int middle = left + ((right - left) / 2);
                if(array[middle] > needle) {
                    right =  middle;
                }else if(array[middle] < needle) {
                   left = middle + 1;
                }else {
                    return true;
                }
            }
        }
        return false;
    }
    
}
