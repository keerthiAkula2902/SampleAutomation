package org.selenium;

public class MethodOverriding extends Test {

	public static void main(String[] args) {

		MethodOverriding onj = new MethodOverriding();
		Test s = new Test();
		Test te=new MethodOverriding();
		te.student(1000);
	//	s.student(200);
		//System.out.println(onj.student(100));
	}

	public int student(int id) {
		System.out.println("super class");
		return (id);

	}
}

class Test {
	public int student(int id) {
		System.out.println("child class");
		return (id);

	}

}
