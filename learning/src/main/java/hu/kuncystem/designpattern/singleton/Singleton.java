package hu.kuncystem.designpattern.singleton;

import hu.kuncystem.designpattern.PatternTest;

public class Singleton implements PatternTest{
	public static Singleton instance;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	public void test() {
		System.out.println("Singleton calling");
	}

}
