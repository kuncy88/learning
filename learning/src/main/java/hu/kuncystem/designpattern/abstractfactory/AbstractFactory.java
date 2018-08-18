package hu.kuncystem.designpattern.abstractfactory;

import hu.kuncystem.designpattern.PatternTest;
import hu.kuncystem.designpattern.factory.Computer;

/**
 * This class is similar to Factory pattern. But it has a big different. We
 * avoid if-else or switch statement when we create the sub-class. We have an
 * based abstract class which the sub-classes extending.
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 18, 2018
 * 
 * @version 1.0
 */
public class AbstractFactory implements PatternTest {

    public void test() {
        Computer pc = ComputerFactory
                .getComputer(new PCFactory("Intel Core i3 LGA 1155 3GHZ", "Kingston 4GB", 89234.0));
        System.out.println(pc.toString());

        Computer server = ComputerFactory
                .getComputer(new ServerFactory("Intel XEON 4*4GHZ", "Kingston 32GB", 234567.34));
        System.out.println(server.toString());
    }

}
