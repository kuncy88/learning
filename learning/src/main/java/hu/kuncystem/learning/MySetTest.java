package hu.kuncystem.learning;

import java.util.HashSet;
import java.util.Set;

/**
 * Class Comment
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 28, 2018
 * 
 * @version 1.0
 */
public class MySetTest {
    private HashSet<Pair> set = new HashSet<>();

    public MySetTest() {
        set.add(new Pair("David", 16));
        set.add(new Pair("John", 16));
        set.add(new Pair("John", 16));
       // set.add(new Pair("John", 17));
      // set.add(new Pair("Philipe", 23));
        
        //Pair remove = new Pair("John", 16);
       //set.remove(remove);
    }
    
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(Pair test: set) {
            builder.append("[" + test.s + "]: " + test.a + " ");
        }
        return builder.toString();
    }
}
