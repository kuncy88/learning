package hu.kuncystem.designpattern.iterator;

import hu.kuncystem.designpattern.PatternTest;

/**
 * We can reach elements of collection through this pattern.
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 18, 2018
 *  
 * @version 1.0
 */
public class IteratorTest implements PatternTest{

    @Override
    public void test() {
        NameRepository repo = new NameRepository();
        for(Iterator iter = repo.getIterator(); iter.hasNext();) {
            String name = (String) iter.next();
            System.out.println("Name: " + name);
        }
    }

}
