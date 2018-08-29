package hu.kuncystem.algorithm;

/**
 * Class Comment
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 29, 2018
 *  
 * @version 1.0
 */
public class BubbleSort extends Test {
    private int[] array;
    
    public BubbleSort(int[] array) {
        this.array = array;
    }
    /* (non-Javadoc)
     * @see hu.kuncystem.algorithm.Test#test()
     */
    @Override
    public void test() {
        for(int i = array.length-1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(array[j] > array[j+1]) {
                    swap(j, j+1);
                }
            }
            
        } 
    }
    
    private void swap(int from, int to) {
        int tmp = array[from];
        array[from] = array[to];
        array[to] = tmp;
    }

    /* (non-Javadoc)
     * @see hu.kuncystem.algorithm.Test#run()
     */
    @Override
    protected void run() {
        // TODO Auto-generated method stub

    }
    
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            s.append(array[i] + " ");
        }
        return s.toString();
    }

}
