package org.ak;

public class INterview1 {

	public static void main(String args[]) {
		String a = "hello", b = "world";
		String test = "My name is keerthi";
		// split(regx,int)-> int number represents how many parts to be splitted
		String q[] = test.split(" ", 3);
		for (String temp : q) {
			System.out.println(temp);

			
		}
		// a = a + b;
		a = a.concat(b);
		// CharSequence is a readable sequence of char values->readonly access
		CharSequence str = a.subSequence(2, 9);
		System.out.println("Char sequence " + str);
		// returns a string
		String st = a.substring(2, 9);
		System.out.println(" String sequnce " + st);

		b = a.substring(0, a.length() - b.length());

		a = a.substring(b.length());
		System.out.println("a =" + a + " b =" + b);

	}

}
