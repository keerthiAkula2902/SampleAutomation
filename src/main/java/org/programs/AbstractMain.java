package org.programs;

public abstract class AbstractMain {
	final int item = 10;

	public abstract void intrest();

	AbstractMain(){
		System.out.println("contructor main method");
	}
	public static void test1() {
		// AbstractMain a=new AbstractMain();
		System.out.println("static method");

	}

	public final void test4() {
		// int a=10;
		System.out.println("final method");

	}

}
