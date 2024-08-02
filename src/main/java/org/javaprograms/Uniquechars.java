package org.javaprograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.bouncycastle.util.Arrays.Iterator;

public class Uniquechars {

	public static void main(String[] args) {
		String s = "only unique characters are allowed";
		Set<Character> se = new LinkedHashSet<Character>();
		Set tree=new TreeSet();
		Set ha=new HashSet();
		for (int i = 0; i < s.length(); i++) {
			se.add(s.charAt(i));
			tree.add(s.charAt(i));
			ha.add(s.charAt(i));
		}
		/*
		 * System.out.println(se); System.out.println(tree); System.out.println(ha);
		 */
		String sq="";
		for(int i=0;i<se.size();i++) {
			System.out.println(" 1 "+se.toString());
			
		}
		//System.out.println(" final "+sq);
	}

}
