package org.programs;

public class chidoverride extends parentoverride {
	
	public void test() {
	
		System.out.println("child override");
		super.test();
		
	}
	
	public static void main(String args[]) {
		parentoverride p=new parentoverride();
		p.test();
		parentoverride c=new chidoverride();
		c.test();
		
	}

}
