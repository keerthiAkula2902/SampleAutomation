package org.programs;

import java.util.regex.Pattern;

public class JavaProgram2 {

	public static void main(String[] args) {
		int a = 10, b = 20, max;
		String s="ae4thy";
		int l = 0, u = 0, n = 0;
		max = a > b ? a : b;
		// System.out.println("Maximum is = " + max);
		String s1 = "WelcOme ATOa 1 23 5";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
				l++;

			} else if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				u++;
			} else if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				n++;

			} else {

			}

		}
		Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
		if(s1.contains("[aeiou]")) {
			System.out.println("contains vowels");
		}
		System.out.println("lower case " + l + " upper case  " + u + " digits " + n);
		// Sum of odd numbers from 1 to 100
		int odd = 0, even = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				odd = i + odd;
			} else
				even = i + even;

		}
		System.out.println("odd is " + odd + " " + "even is " + even);

		// factorial number
		int num = 9, fac = 1;
		for (int i = 1; i <= 9; i++) {
			fac = fac * i;
		}
		System.out.println(fac);

		// nth highest nummer -> sort the array and query the nth highest index value

		// to check if palindrome

		int rem = 0, j = 0, output = 0,input=153;
		while(input>0) {
			rem=input%10;
			output=output*10+rem;
			input=input/10;
		}
		System.out.println("reverse the num "+ output);
		
	}

}
