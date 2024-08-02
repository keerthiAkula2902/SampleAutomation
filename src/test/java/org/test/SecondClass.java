package org.test;

 public class SecondClass {

	public static void main(String[] args) {
		SecondClass obj1=new SecondClass();
		obj1.sname();
		obj1.noOutput();
		obj1.sname();

	}
	public  void sname() {
		System.out.println("**sname being called**");
	}
	public void noOutput() {
		System.out.println("");
	}
}
