package hu.kuncystem.designpattern.composite;

import hu.kuncystem.designpattern.PatternTest;

/**
 * We use if need to treat a group of objects in similar way
 * It seem in this example, we create an tree structure.
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 18, 2018
 *  
 * @version 1.0
 */
public class Composite implements PatternTest {

    public void test() {
        Employee CEO = new Employee("CEO USER", "CEO");
        
        Employee marketing = new Employee("Marketing User", "Head Marketing");
        Employee otherUser = new Employee("Other User", "Head of cleaner");
        
        Employee cleaner1 = new Employee("Cleaner1", "clean");
        Employee cleaner2 = new Employee("Cleaner2", "clean");
        
        CEO.add(marketing);
        CEO.add(otherUser);
        
        otherUser.add(cleaner1);
        otherUser.add(cleaner2);
        
        System.out.println(CEO);
        for(Employee e: CEO.getSubEmployee()) {
            System.out.println(e);
            for(Employee e2: e.getSubEmployee()) {
                System.out.println(e2);
            }
        }
    }

}
