package org.programs;

public class classextedinginterfaces implements Interface1, Interface2 {

	int a=10;
	public static void main(String[] args) {
		classextedinginterfaces obj1 = new classextedinginterfaces();
		
		//accessing default method
		obj1.defaultMethod();
		
		//accesing static method
		int f=Interface1.staticMethod(3);
		System.out.println(f);
		obj1.test1();
		obj1.test2();
		

	}
	
	

	public void test1() {
		System.out.println("test1");

	}

	public void test2() {
		System.out.println("test2");

	}

}
