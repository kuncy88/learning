package hu.kuncystem.designpattern.factory;

import hu.kuncystem.designpattern.PatternTest;

/**
 * We  have a super class with multiple sub-class.The client don't have to instantiation of a class.
 * We have an static factory method which creating the necessary class by type. 
 * */
public class Factory implements PatternTest{

	public void test() {
		Computer pc = ComputerFactory.getComputer(
		        ComputerFactory.TYPE.PC, "Intel Core i3 LGA 1155 3GHZ", "Kingston 4GB", 89234.0);
		System.out.println(pc.toString());
		
		Computer server = ComputerFactory.getComputer(
		        ComputerFactory.TYPE.SERVER, "Intel XEON 4*4GHZ", "Kingston 32GB", 234567.34);
		System.out.println(server.toString());
	}

}
