package hu.kuncystem.algorithm;

/**
 * Class Comment
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 19, 2018
 *  
 * @version 1.0
 */
public class Palindrome extends Test{
    private String s1;
    
    public Palindrome() {}
    
    public void test() {
        super.test(getClass());
         
    }
    
    public void test(String s) {
        this.s1 = s;
        this.test();
    }

    @Override
    protected void run() {
       this.solveWithFor();
       this.solveWithBuilder();
    }
    
    private void solveWithFor() {
        System.out.println(" Solve with for statement");
        boolean ok = true;
        if(s1 != null) {
            for(int i = 0, j = s1.length()-1; i < s1.length()/2; i++, j--) {
                if(s1.charAt(i) != s1.charAt(j)) {
                    ok = false;
                    break;
                }
            }
        }
        if(ok) {
            System.out.println(s1 + " string is palindrome");
        }else {
            System.out.println(s1 + " string is not palindrome");
        }
    }
    
    private void solveWithBuilder() {
        System.out.println(" Solve with builder");
        StringBuilder b = new StringBuilder(s1);
        if(s1.equals(b.reverse().toString())) {
            System.out.println(s1 + " string is palindrome");
        }else {
            System.out.println(s1 + " string is not palindrome");
        }
    }
}
