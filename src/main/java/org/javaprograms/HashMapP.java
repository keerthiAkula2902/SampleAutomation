package org.javaprograms;

import java.util.*;
import java.util.Map.Entry;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HashMapP {

	public static void main(String[] args) {
		//HasMap
		Map<Integer, String> h = new HashMap<Integer, String>();
		//HashTable
		HashMap<Integer, String> h1=new HashMap<Integer, String>();
		List l=new ArrayList();
		h.put(1, "ak");
		h.put(10, "keerthi");
		h.put(10, "test");
		h.put(32, null);
		// System.out.println(h.get(10));
		h.remove(1);
		h.containsKey(10);
	//	System.out.println(h.keySet());
		// System.out.println(h.get(10));
		Set s = h.entrySet();
		Iterator li = s.iterator();
		while (li.hasNext()) {
			Map.Entry mp = (Map.Entry) li.next();
			System.out.println(li.next());
			System.out.print(mp.getKey());
			System.out.println(mp.getValue());

		}

	}

}
