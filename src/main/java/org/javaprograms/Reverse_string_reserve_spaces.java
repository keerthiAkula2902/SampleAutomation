package org.javaprograms;

import java.util.ArrayList;
import java.util.List;

public class Reverse_string_reserve_spaces {

	public static void main(String[] args) {
		String str = "I my name is keerthi x to eee yt";
		List<Integer> li = new ArrayList<Integer>();
		List<Integer> done = new ArrayList<Integer>();
		System.out.println(str);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				li.add(i);
			}

		}
		str = str.replaceAll(" ", "");
		StringBuilder sb = new StringBuilder(str);
		String ak = sb.reverse().toString();
		int index = 0;

		for (int i = 0; i < (str.length() + li.size()); i++) {
			if (li.contains(i)) {
				System.out.print(" ");
			} else {
				System.out.print(ak.charAt(index++));
			}

		}

	}

}
