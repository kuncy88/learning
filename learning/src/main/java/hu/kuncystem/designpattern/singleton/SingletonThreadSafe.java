package hu.kuncystem.designpattern.singleton;

import hu.kuncystem.designpattern.PatternTest;

public class SingletonThreadSafe implements PatternTest{
	public static volatile SingletonThreadSafe instance;
	
	private SingletonThreadSafe() {}
	
	public static SingletonThreadSafe getInstance() {
		if(instance == null) {
			synchronized (SingletonThreadSafe.class) {
				if(instance == null) {
					instance = new SingletonThreadSafe();
				}
			}
			
		}
		return instance;
	}
	public void test() {
		System.out.println("SingletonThreadSafe calling(double checking): " + this.toString());
	}

}
