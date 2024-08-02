package org.javaprograms;

public class program2 {

	public static void main(String[] args) {

		String s = "keerthi.akula";
		String ar[] = s.split(".");
		int count = 0;
		String a = "", b = "";
		// int j = 0;
		// System.out.println(ar[0]+"&"+ar[1]);

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '.') {
				count = 1;

			} else if (s.charAt(i) != '.' && count == 0) {

				a = a + s.charAt(i);

			} else if (count == 1 && s.charAt(i) != '.') {
				b = b + s.charAt(i);

			}
		}
		System.out.println(a + " " + b);

//		String te[] = new String[30];
//		int dot = 0, j = 0, k = 0;
//		for (int i = 0; i < s.length() - 1; i++) {
//			if (s.charAt(i) == '.') {
//				dot++;
//			}
//		}
//		// System.out.println(dot);
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) == '.') {
//				te[j] = b;
//				b = "";
//				j++;
//			} else if (i == s.length() - 1) {
//				b = b + s.charAt(i);
//				te[j] = b;
//				break;
//
//			} else if (s.charAt(i) != '.') {
//				b = b + s.charAt(i);
//			}
//
//			else {
//
//			}
//
//		}
//		for (int i = 0; i <= j; i++) {
//			System.out.println(te[i]);
//		}

	}

}
