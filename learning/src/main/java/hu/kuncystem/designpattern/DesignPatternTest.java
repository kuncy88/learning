package hu.kuncystem.designpattern;

import hu.kuncystem.designpattern.abstractfactory.AbstractFactory;
import hu.kuncystem.designpattern.adapter.Adapter;
import hu.kuncystem.designpattern.bridge.Bridge;
import hu.kuncystem.designpattern.builder.Builder;
import hu.kuncystem.designpattern.composite.Composite;
import hu.kuncystem.designpattern.decorator.Decorator;
import hu.kuncystem.designpattern.facade.Facade;
import hu.kuncystem.designpattern.factory.Factory;
import hu.kuncystem.designpattern.flyweight.Flyweight;
import hu.kuncystem.designpattern.iterator.IteratorTest;
import hu.kuncystem.designpattern.prototype.Prototype;
import hu.kuncystem.designpattern.proxy.Proxy;
import hu.kuncystem.designpattern.singleton.Singleton;
import hu.kuncystem.designpattern.singleton.SingletonThreadSafe;

public final class DesignPatternTest {
	private static PatternTest designPattern;
	
	public DesignPatternTest() {
	    System.out.println("--=== Creational Design ===--");
	    //creational design
		this.singleton();
		this.factory();
		this.abstractFactory();
		this.builder();
		this.prototype();
		
		//structural design
		System.out.println("\n--=== Structural Design ===--");
		this.adapter();
		this.composite();
		this.proxy();
		this.flyweight();
		this.facade();
		this.bridge();
		this.decorator();
		
		//behavioral desing
		System.out.println("\n--=== Behavioral Design ===--");
		this.iterator();
	}
	
	private void blockHeader(String text) {
	    System.out.println("");
		System.out.println("----- " + text + " -----");
	}
	
	private void singleton() {
		blockHeader("Singleton");
		designPattern = Singleton.getInstance();
		designPattern.test();
		designPattern = SingletonThreadSafe.getInstance();
		designPattern.test();
		designPattern = SingletonThreadSafe.getInstance();
		designPattern.test();
	}
	
	private void factory() {
	    blockHeader("Factory");
	    designPattern = new Factory();
	    designPattern.test();
	}
	
	private void abstractFactory() {
		blockHeader("Abstract Factory");
		designPattern = new AbstractFactory();
		designPattern.test();
	}
	
	private void builder() {
	    blockHeader("Builder");
	    designPattern = new Builder();
	    designPattern.test();
	}
	
	private void prototype() {
	    blockHeader("Prototype");
	    designPattern = new Prototype();
	    designPattern.test();
	}
	
	
	
	private void adapter() {
	    blockHeader("Adapter");
	    designPattern = new Adapter();
	    designPattern.test();
	}
	
	private void composite() {
	    blockHeader("Composite");
	    designPattern = new Composite();
	    designPattern.test();
	}
	
	private void proxy() {
	    blockHeader("Proxy");
	    designPattern = new Proxy();
	    designPattern.test();
	}
	
	private void flyweight() {
	    blockHeader("Flyweight");
	    designPattern = new Flyweight();
	    designPattern.test();
	}
	
	private void facade() {
	    blockHeader("Facade");
	    designPattern = new Facade();
	    designPattern.test();
	}
	
	private void bridge() {
	    blockHeader("Bridge");
	    designPattern = new Bridge();
	    designPattern.test();
	}
	
	private void decorator() {
	    blockHeader("Decorator");
	    designPattern = new Decorator();
	    designPattern.test();
	}
	
	
	private void iterator() {
        blockHeader("Iterator");
        designPattern = new IteratorTest();
        designPattern.test();
    }
}
