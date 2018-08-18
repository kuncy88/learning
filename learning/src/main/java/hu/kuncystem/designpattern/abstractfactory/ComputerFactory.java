package hu.kuncystem.designpattern.abstractfactory;

import hu.kuncystem.designpattern.factory.Computer;

/**
 * Class Comment
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 18, 2018
 *  
 * @version 1.0
 */
public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.create();
    }
}
