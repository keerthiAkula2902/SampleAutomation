package org.javaprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class IntPractice {

	public static void main(String[] args) {
		String s = "a1b2c3d4abcdefghabcdefgh";

		int count1 = 1;
		List arr = new ArrayList();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (!arr.contains(s.charAt(i))) {
				arr.add(s.charAt(i));

				for (int j = i + 1; j < s.length(); j++) {
					if (s.charAt(i) == (s.charAt(j))) {
						count1++;
					}
				}
				hm.put(s.charAt(i), count1);
				count1 = 1;
			}
		}
		Set so = hm.entrySet();
		Iterator li = so.iterator();
		while (li.hasNext()) {
			Map.Entry mp = (Map.Entry) li.next();
			System.out.print(mp.getKey() + "=" + mp.getValue() + " ");
			System.out.println();
		}
		s = "a1b2c3d4abcdefghabcdefgh";
		Set se = new TreeSet();
		for (int i = 0; i < s.length(); i++) {
			se.add(s.charAt(i));
		}
		Iterator l = se.iterator();
		while (l.hasNext()) {
			System.out.print(l.next());
		}

	}

}
