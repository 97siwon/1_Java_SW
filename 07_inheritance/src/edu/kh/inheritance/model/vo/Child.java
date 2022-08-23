package edu.kh.inheritance.model.vo;

public class Child extends Parent {
// The type Child cannot subclass the final class Parent
	
	
	@Override
	public void method1() {
	// The method method1() of type Child must override or implement a supertype method
		System.out.println("자식의 메서드");
	}
	
	
}
