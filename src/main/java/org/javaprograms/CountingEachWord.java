package org.javaprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountingEachWord {

	public static void main(String[] args) {
		String str = "Hello my name is keerthi is your name is keerthi";
		String sp[] = str.split(" ");
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		int a[] = {};
		int b[] = new int[10];
		ArrayList<String> arr = new ArrayList<String>();
		int count = 1;
		for (int i = 0; i < sp.length; i++) {
			if (!arr.contains(sp[i])) {
				arr.add(sp[i]);
				for (int j = i + 1; j < sp.length; j++) {
					if (sp[i].equals(sp[j])) {
						count++;
					}
				}
				h.put(sp[i], count);
				count = 1;
			}
		}
		Set s = h.entrySet();
		Iterator li = s.iterator();
		int i = 0;
		System.out.println("Printing unique values");
		while (li.hasNext()) {
			Map.Entry mp = (Map.Entry) li.next();
			int k = (Integer) mp.getValue();
			if (k == 1) {
				System.out.println(mp);
			}

		}

	}

}
