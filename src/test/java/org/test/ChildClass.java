package org.test;

public class ChildClass extends ParentClass {
	void childmethod() {
		System.out.println("calling child class");
		super.parentmethod();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj1 = new ChildClass();
		obj1.childmethod();
	//	obj1.parentmethod();
		
	//	obj1.grandmethod();
	}
	void parentmethod() {
		
	}

}
