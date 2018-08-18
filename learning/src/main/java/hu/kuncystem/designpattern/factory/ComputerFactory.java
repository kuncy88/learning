package hu.kuncystem.designpattern.factory;

/**
 * Class Comment
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 18, 2018
 *  
 * @version 1.0
 */
public class ComputerFactory {
    public static enum TYPE{PC, SERVER};
    
    public static Computer getComputer(TYPE type, String cpu, String ram, double price) {
        Computer computer = null;
        switch(type) {
            case PC:{
                computer = new PC(cpu, ram, price);
                break;
            }
            case SERVER:{
                computer = new Server(cpu, ram, price);
                break;
            }
        }
        return computer;
    }
}
