package org.ak;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {

	public static void main(String[] args) {
		String str = "Java is java again java";
		List li = new ArrayList();
		int count = 1;
		String s[] = str.split(" ");
		for (int i = 0; i < s.length; i++) {
			if (!li.contains(s[i])) {
				li.add(s[i]);
				for (int j = i + 1; j < s.length; j++) {
					if (s[i].equals(s[j])) {
						count++;

					}
					

				}
				System.out.println(s[i] + count);
				count = 1;

			}
		}

	}

}
