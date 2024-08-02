package org.selenium;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.student();
		obj.student(10);
		obj.student(10, "ak");
		obj.student("test", 100);

	}

	public void student() {
		System.out.println("empty definition");
	}

	public void student(int id) {
		System.out.println("id"+id);

	}

	public void student(int id, String name) {
		System.out.println("id, name "+id+name);

	}

	public void student(String name, int id) {
		System.out.println("name, id "+name+id );

	}

}
