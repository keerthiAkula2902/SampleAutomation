package org.programs;

public interface Interface1 {
	void test1();

	void test2();

	default  void defaultMethod() {
		System.out.println("default method in interface");
	}
	
	static int staticMethod(int n) {
		return n*3;
	}

}
