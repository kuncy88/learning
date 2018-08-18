package hu.kuncystem.designpattern.factory;

/**
 * Class Comment
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 18, 2018
 *  
 * @version 1.0
 */
public class Server implements Computer{
    private String cpu;
    private String ram;
    private double price;
    
    public Server(String cpu, String ram, double price) {
        this.cpu = cpu;
        this.ram = ram;
        this.price = price;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public double getPrice() {
        return price;
    }
    
    public String toString() {
        return "CPU: " + getCpu() + ", RAM: " + getRam() + ", PRICE:  " + getPrice() + " Ft";
    }
}
