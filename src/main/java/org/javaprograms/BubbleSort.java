package org.javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 12, 1, 4, 0, -2 };
		int temp, num = 121, rem, fin = 0, c = 0, fac = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}

		// factorial
		for (int i = 1; i <= 9; i++) {
			fac = fac * i;
		}
		System.out.println(fac);

		// reverse number
		num = 123;
		while (num > 0) {
			rem = num % 10;
			fin = fin * 10 + rem;
			num = num / 10;
		}
		System.out.println("reverse " + fin);
		String t = "This is keerthi Akula I am keerthi akula", s1;
		String s = t.toLowerCase();

		StringBuilder sb = new StringBuilder(s);
		s1 = sb.reverse().toString();
		if (s.equals(s1)) {
			System.out.println("same string");
		}
		String s2[] = s.split(" ");
		List li = new ArrayList();
		for (int i = 0; i < s2.length; i++) {
			int count = 0;

			if (!li.contains(s2[i])) {
				li.add(s2[i]);

			}
			for (int k = i + 1; k < s2.length; k++) {
				if (s2[i].equals(s2[k])) {
					count++;
				}

			}
			System.out.println(s2[i] + "  " + count);
		}
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
		String e[] = { "test", "abc" };
		List a = Arrays.asList(e);
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		Map<String, Integer> he = new HashMap<String, Integer>();
		he.put("ak", 10);
		Set q = he.entrySet();
		Iterator liw = q.iterator();
		while (liw.hasNext()) {
			Map.Entry mp = (Map.Entry) liw.next();
			System.out.println(mp.getKey());
		}

	}

}
