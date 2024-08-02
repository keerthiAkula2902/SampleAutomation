package org.javaprograms;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CopyingConstructor {

	int num;
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyingConstructor o = new CopyingConstructor(10, "as");
		CopyingConstructor obj = new CopyingConstructor(o);
		o.display();
		obj.display();
//		int i=0;
//		for(;;) {
//			
//			System.out.println(i);
//		}
		int i = 1;
		String keerthi = "";

		switch (i) {
		case 1:
			System.out.println("hi");break;

		case 2:
			System.out.println("case2");
			break;
		case 3:
			System.out.println("case3");break;
		default:
			System.out.println("nothing worked out");

		}
	}

	CopyingConstructor(int i, String s) {
		num = i;
		name = s;

	}

	void display() {
		System.out.println(num + name);
	}

	CopyingConstructor(CopyingConstructor obj) {
		num = obj.num;
		name = obj.name;
	}

}
