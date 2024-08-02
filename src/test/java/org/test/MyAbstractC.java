package org.test;

public abstract class MyAbstractC {

	protected abstract void test();
	public abstract void test1();
	public int i = 10;
	protected String s = "keerthi";
//	we cannot declare private in abstract class
	//private s1="re";

	public void defining() {
		System.out.println("added methog definition");
	}

	public static void main(String[] args) {
		// We cannot create object for abstarct class
		// MyAbstractC c=new MyAbstractC();

	}

}
