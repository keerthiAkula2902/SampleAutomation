package org.test;

public class  Employee {
	public static void main(String[] args) {
		//we can call static method of different class without creating object
	//	StudentStatic.addNum();
	//	System.out.println(StudentStatic.i);
		//no object required
	//	mytest();
		String s1="Happy new year keerthi!";
		String s2="";
		for (int i=s1.length()-1; i>0;i--) {
			s2=s2+s1.charAt(i);
			
		}
		System.out.println(s2);
	}
	public static void mytest() {
		//System.out.println("static method of own class");
	}
	public void greenGo() {
		// TODO Auto-generated method stub
		
	}
	public void redStop() {
		// TODO Auto-generated method stub
		
	}
	public void yellowReady() {
		// TODO Auto-generated method stub
		
	}
	public void flymode() {
		// TODO Auto-generated method stub
		
	}
	public void duplicateMethod() {
		// TODO Auto-generated method stub
		
	}

	
}
