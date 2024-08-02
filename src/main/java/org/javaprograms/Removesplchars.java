package org.javaprograms;

public class Removesplchars {

	public static void main(String[] args) {
		String s = "avc% &jjdn^= njknk 1221 ";
		String f="";
		
		System.out.println("original string = "+s);
		 f=s.replaceAll("[^0-9a-zA-Z ]", "");
		 System.out.println(" remove spl chars = "+f);

		/*
		 * for(int i=s.length()-1;i>=0;i--) { f=f+s.charAt(i); }
		 */
	//	System.out.println(f);
		StringBuilder sb = new StringBuilder(s);
		// we can use below
		// StringBuilder sb=new StringBuilder();
		// sb.append(s);
		System.out.println("reverse the whole string = "+sb.reverse());

		// reverse each word

		String splitted[] = s.split(" ");
		String f1 = "";
		
		for (int i = 0; i < splitted.length; i++) {
			StringBuilder sb1 = new StringBuilder(splitted[i]);
			sb1.reverse();
			f1=f1+sb1+" ";
		}
		System.out.println("reverse each word => "+f1);

	}

}
