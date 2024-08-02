package org.javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import org.checkerframework.checker.units.qual.m;

public class SetList {

	public static void main(String[] args) {

		String arr[] = { "ak", "keerthi" };
		List li = Arrays.asList(arr);
		List l1 = new ArrayList();
		List l2 = new Vector();
		List l3 = new LinkedList();
		// li.add(null);
		Iterator lis = li.iterator();
		while (lis.hasNext()) {
			System.out.println(lis.next());
		}
		for (int i = 0; i < li.size(); i++) {
			// System.out.println(i+" "+li.get(i));
		}

		Set hs = new HashSet();
		Set h1 = new LinkedHashSet();
		Set h2 = new TreeSet();
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(20, "ak");
		m.put(30, "test");
		Set s = m.entrySet();
		Iterator i = s.iterator();
		while (i.hasNext()) {
			Map.Entry mp = (Map.Entry) i.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			// System.out.println(i.g);
		}

		hs.add("test");
		hs.add("java");
		hs.add(10);
		hs.add("java");
		hs.iterator();

		// System.out.println(hs);
		// to iterate in the set we use iterator
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		hs.remove("java");
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());

	}

}
