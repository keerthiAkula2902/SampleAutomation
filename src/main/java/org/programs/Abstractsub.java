package org.programs;

public class Abstractsub extends AbstractMain {

	public static void main(String[] args) {
		AbstractMain aa = new Abstractsub();

		aa.test1();
		aa.test4();

	}
	Abstractsub(){
		System.out.println("Abstractsub");
	}
	@Override
	public void intrest() {
		// TODO Auto-generated method stub

	}

	
}
