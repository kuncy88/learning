package hu.kuncystem.learning;

import java.util.Date;
import java.util.Random;

/**
 * Class Comment
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 28, 2018
 *  
 * @version 1.0
 */
public class Pair {
    final int a;
    final String s;

    public Pair(String s, int a) {
        this.a = a;
        this.s = s;
    }
    
    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 17 + this.a;
        hash = hash * 31 + this.s.hashCode();
        System.out.println(hash);
        return hash;
    }
    
    @Override
    public boolean equals(Object o) {
        if(o == null) {
            return false;
        }else if(!(o instanceof Pair)) {
            return false;
        } else if(o == this) {
            return true;
        }else {
            Pair pair = (Pair) o;
            return (pair.a == this.a && pair.s.equalsIgnoreCase(this.s));
        }
    }
}
