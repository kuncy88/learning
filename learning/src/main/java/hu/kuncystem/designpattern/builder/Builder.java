package hu.kuncystem.designpattern.builder;

import hu.kuncystem.designpattern.PatternTest;

/**
 * The factory and abstract factory have a big problem. If we have lots of
 * parameters and one is required another is optional, then we can't use these pattern because these require all of parameter.
 * This problem solve the Builder class. We can add optional and required parameters.
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 18, 2018
 * 
 * @version 1.0
 */
public class Builder implements PatternTest {

    public void test() {
        Computer computer = new Computer.ComputerBuilder("Intel i5 4*3.2GHZ", "Kingston 6GB", 145236.12).setWifi(true)
                .setBluetooth(false).build();
        System.out.println(computer.toString());
    }

}
