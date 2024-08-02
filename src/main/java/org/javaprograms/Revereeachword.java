package org.javaprograms;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Revereeachword {

	public static void main(String[] args) {
		String str = "my name is keerthi", rev = "", f = "";

		String spi[] = str.split(" ");
		for (int i = 0; i < spi.length; i++) {
			StringBuilder s = new StringBuilder(spi[i]);
			/*
			 * StringBuffer s1=new StringBuffer(); s1.rev;
			 */
			rev = rev + s.reverse() + " ";

		}
		System.out.println(rev);
		for (int i = 0; i < spi.length; i++) {
			String t=spi[i].toString();
			for(int j=t.length()-1;j>=0;j--) {
				System.out.print(t.charAt(j));
			}
			System.out.print(" ");
			
		}
	}

}
