package org.test;

public class ChildAbstractClass extends MyAbstractClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAbstractClass obj=new ChildAbstractClass();
		obj.engineCapacity();
		obj.planeColor();
		obj.engineCapacity();

	}

	@Override
	public void planeColor() {
		// TODO Auto-generated method stub
		System.out.println("Red color");
	}

}
