package org.javaprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AddinNumberInString {

	public static void main(String[] args) {
		
//		int num=123456;
//		int sum = 0,rem=0,count=0;
//		String temp = "";
//		/*
//		 * for (int i = 0; i < s.length(); i++) { if (s.charAt(i) >= 48 && s.charAt(i)
//		 * <= 57) { temp = temp + s.charAt(i); sum = sum + Integer.parseInt(temp); }
//		 * temp = "";
//		 * 
//		 * }
//		 */
//		while(num>0) {
//			rem+=num%10;
//		//	count=count+rem;
//			num=num/10;			
//					
//		}
//
//		System.out.println(rem);
		String s = "aabbccaaddbba";
		int count1=1;
		List arr=new ArrayList();
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			if(!arr.contains(s.charAt(i))) {
				arr.add(s.charAt(i));
			
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==(s.charAt(j))) {
					count1++;
				}
			}
			hm.put(s.charAt(i), count1);
			count1=1;
			}
		}
		Set so=hm.entrySet();
		Iterator li= so.iterator();
		while(li.hasNext()) {
			Map.Entry mp=(Map.Entry)li.next();
			System.out.print(mp.getKey()+""+mp.getValue()+" ");			
		}
		

	}

}
