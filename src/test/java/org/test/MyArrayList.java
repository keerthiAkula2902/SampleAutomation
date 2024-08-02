package org.test;

import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		ArrayList<String> ak=new ArrayList<String>();
		ak.add("adding first element");
		System.out.println(ak.get(0));
		ak.add(1, "3 element");
		System.out.println(ak.size());
		System.out.println(ak);
		ak.remove(1);
		System.out.println(ak);
		//ak.clear();
		System.out.println(ak);
	System.out.println(ak.contains("3"));
//	ak.equals(ak)

	}

}
