package org.javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountingEachChar {

	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 5, 1, 9, 1, 4, 7 };
		int count = 1;
		// List li=Arrays.asList(a);
		ArrayList arr = new ArrayList();
		for (int i = 0; i < a.length; i++) {
			if (!arr.contains(a[i])) {
				arr.add(a[i]);
				for (int j = i + 1; j < a.length; j++) {
					if (a[j] == a[i]) {
						count++;
					}

				}
				System.out.println(a[i]+" "+(count));
				if(count==1) {
					System.out.println(a[i]+" is my unique number");
				}
				count=1;
			}
			

		}

	}

}
