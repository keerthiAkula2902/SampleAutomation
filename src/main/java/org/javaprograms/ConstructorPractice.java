package org.javaprograms;

public class ConstructorPractice {
	int i;
	String s;

	public static void main(String[] args) {

		/*
		 * ConstructorPractice o = new ConstructorPractice(10, "ak"); //below calling
		 * method not allowed //o.ConstructorPractice(10,"ak"); ConstructorPractice o1 =
		 * new ConstructorPractice("aa", 100);
		 */

		// o.tes();
	}

	ConstructorPractice() {
		System.out.println("default constructor");
		// System.out.println(i);
	}

	ConstructorPractice(int i, String s) {
		System.out.println(i + s);
	}

	ConstructorPractice(String s, int i) {
		System.out.println(i + s);
	}

	ConstructorPractice(int i, float f, double d) {

	}
}
