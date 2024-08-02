package org.test;

public class IndiaTraffic implements Traffic, Airways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IndiaTraffic obj = new IndiaTraffic();
		// or
//		Traffic objss=new Traffic();
		obj.greenGo();
		// Airways obj1=new IndiaTraffic();
		obj.flymode();
		// printing the i value from parent interface
		System.out.println(obj.i);

	}

	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green");

	}

	public void redStop() {
		// TODO Auto-generated method stub

	}

	public void yellowReady() {
		// TODO Auto-generated method stub

	}

	public void flymode() {
		System.out.println("flying");

	}

	public void duplicateMethod() {
		// TODO Auto-generated method stub

	}

}
