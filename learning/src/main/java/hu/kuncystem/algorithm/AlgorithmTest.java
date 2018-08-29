package hu.kuncystem.algorithm;

/**
 * Class Comment
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 19, 2018
 *  
 * @version 1.0
 */
public class AlgorithmTest {
    public AlgorithmTest() {
        Palindrome palindrome = new Palindrome();
        palindrome.test("abcba");
        palindrome.test("acdfgac");
        
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.test(0);
        fibonacci.test(1);
        fibonacci.test(2);
        fibonacci.test(5);
        fibonacci.test(10);
        
        Factorial fact = new Factorial();
        fact.test(0);
        fact.test(1);
        fact.test(2);
        fact.test(5);
        fact.test(10);
        
        int[] array = {1,34,10,45,21,78,45,10,2,3,0,12,9,8,543,221,3,23,67,43};
        BinarySearch search = new BinarySearch();
        search.test(array, 78);
        
        int[] unsorted = {5,1,4,8,2,9};
        BubbleSort sort = new BubbleSort(unsorted);
        sort.test();
        System.out.println(sort);
    }
}
