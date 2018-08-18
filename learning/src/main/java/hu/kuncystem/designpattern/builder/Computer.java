package hu.kuncystem.designpattern.builder;

/**
 * Class Comment
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 18, 2018
 *  
 * @version 1.0
 */
public class Computer {
    //required parameters
    private String cpu;
    private String ram;
    private double price;
    
    //optional parameters
    private boolean isBluetooth = false;
    private boolean isWifi = false;
    
    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public double getPrice() {
        return price;
    }
    
    public boolean isBluetooth() {
        return isBluetooth;
    }
    
    public boolean isWifi() {
        return isWifi;
    }
    
    private Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.price = builder.price;
        this.isBluetooth = builder.isBluetooth;
        this.isWifi = builder.isWifi;
    }
    
    public String toString() {
        return "CPU: " + getCpu() + ", RAM: " + getRam() + ", PRICE:  " + getPrice() + " Ft, " + " Wifi: " + isWifi() + ", Bluetooth: " + isBluetooth();
    }
    
    public static class ComputerBuilder {
        //required parameters
        private String cpu;
        private String ram;
        private double price;
        
        //optional parameters
        private boolean isBluetooth = false;
        private boolean isWifi = false;
        
        public ComputerBuilder(String cpu, String ram, double price) {
            this.cpu = cpu;
            this.ram = ram;
            this.price = price;
        }
        
        public ComputerBuilder setBluetooth(boolean enabled) {
            this.isBluetooth = enabled;
            return this;
        }
        
        public ComputerBuilder setWifi(boolean enabled) {
            this.isWifi = enabled;
            return this;
        }
        
        public Computer build() {
            return new Computer(this);
        }
    }
}
