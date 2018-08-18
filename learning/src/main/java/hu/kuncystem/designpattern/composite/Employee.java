package hu.kuncystem.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Comment
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 18, 2018
 *  
 * @version 1.0
 */
public class Employee {
    private String name;
    private String dept;
    
    private List<Employee> subEmployee;
    
    public Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
        
        subEmployee = new ArrayList<Employee>();
    }
    
    public void add(Employee e) {
        subEmployee.add(e);
    }
    
    public void remove(Employee e) {
        subEmployee.remove(e);
    }
    
    public List<Employee> getSubEmployee(){
        return subEmployee;
    }
    
    public String toString() {
        return "Name: " + name + ", Dept: " + dept;
    }
}
