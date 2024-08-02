package org.javaprograms;

public class reversenamewithCapital {

	public static void main(String[] args) {
		String s = "Test is my passion";
		StringBuilder sb = new StringBuilder(s.toLowerCase());
		s = sb.reverse().toString();
		String temp = "";
		String[] s1 = s.split(" ");
		for (String e : s1) {
			temp = temp + Character.toUpperCase(e.charAt(0)) + e.substring(1, e.length()) + " ";

		}
		System.out.println(temp);

	}

}
