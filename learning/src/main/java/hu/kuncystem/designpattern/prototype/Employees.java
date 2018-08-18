package hu.kuncystem.designpattern.prototype;

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
public class Employees implements Cloneable {
    private List<String> empList;
    
    public Employees() {
        empList = new ArrayList<String>();
    }
    
    public Employees(List<String> list) {
        this.empList = list;
    }
    
    public void loadDataFromDatabase() {
        empList.add("User1");
        empList.add("User2");
        empList.add("User3");
        empList.add("User4");
        empList.add("User5");
    }

    /**
     * @return the empList
     */
    public List<String> getEmpList() {
        return empList;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> tmp = new ArrayList<String>(empList);
        return new Employees(tmp);
    }
}
