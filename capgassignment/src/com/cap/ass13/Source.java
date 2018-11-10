package com.cap.ass13;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

class Person {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(final String name) {
		this.name = name;
	}
	public void printName() {
		System.out.println(name);
	}
	
}

public class Source {

	public static void main(String[] args) {
		Person p1 = new Person(null);
		Person p2 = new Person(null);
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		final ArrayList<Person> l1 = new ArrayList<Person> ();
		p1.setName(s1);
		p2.setName(s1);
		l1.add(p1);
		l1.add(p2);
		l1.forEach(Person::printName);
		
		
		
	

	}

}
