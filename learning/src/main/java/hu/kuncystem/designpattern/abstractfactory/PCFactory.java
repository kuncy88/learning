package hu.kuncystem.designpattern.abstractfactory;

import hu.kuncystem.designpattern.factory.Computer;
import hu.kuncystem.designpattern.factory.PC;

/**
 * Class Comment
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 18, 2018
 *  
 * @version 1.0
 */
public class PCFactory implements ComputerAbstractFactory {

    private String cpu;
    private String ram;
    private double price;
    
    public PCFactory(String cpu, String ram, double price) {
        this.cpu = cpu;
        this.ram = ram;
        this.price = price;
    }
    
    public Computer create() {
        // TODO Auto-generated method stub
        return new PC(cpu, ram, price);
    }

}
