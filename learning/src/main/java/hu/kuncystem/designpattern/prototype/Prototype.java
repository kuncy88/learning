package hu.kuncystem.designpattern.prototype;

import java.util.List;

import hu.kuncystem.designpattern.PatternTest;

/**
 * We use this pattern if the creation is costly affair and requires lots of
 * time and resource. In this case we create an object and after we cloning
 * this. So, load the data(example from database) once, after we use the
 * original data more times.
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 18, 2018
 * 
 * @version 1.0
 */
public class Prototype implements PatternTest {

    /*
     * (non-Javadoc)
     * 
     * @see hu.kuncystem.designpattern.PatternTest#test()
     */
    public void test() {
        Employees e = new Employees();
        //load from data once
        e.loadDataFromDatabase();

        try {
            //use the original data more times
            Employees e1 = (Employees) e.clone();
            List<String> list1 = e1.getEmpList();
            list1.add("User6");

            Employees e2 = (Employees) e.clone();
            List<String> list2 = e2.getEmpList();
            list2.remove("User3");

            System.out.println("Original: " + e.getEmpList().toString());
            System.out.println("Clone1: " + list1.toString());
            System.out.println("Clone2: " + list2.toString());
        } catch (CloneNotSupportedException err) {
            // TODO Auto-generated catch block
            err.printStackTrace();
        }
    }

}
