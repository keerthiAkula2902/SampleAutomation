package org.test;

public class ChildAbstract extends MyAbstractC{

	public static void main(String[] args) {
		
		ChildAbstract obj= new ChildAbstract();
		System.out.println("Accessing public integer "+obj.i);
		System.out.println("Accessing protected string "+obj.s);
		
	}

	@Override
	protected void test() {
		System.out.println("implemented protected test method in child class");
		
	}

	@Override
	public void test1() {
		System.out.println("implemented private test method in child class");
		
	}

}
