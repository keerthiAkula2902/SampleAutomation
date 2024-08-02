package org.test;

public class Pyramid {

	public static void main(String args[]) {
		// int i=1;int j=1;
		int count = 1;
		for (int i = 0; i < 4; i++) 
		{
		
			for (int j = i; j >=0; j--) 
			{
				System.out.print(count*3 + " ");
				count++;
			}
			System.out.println();
		}

	}

}
