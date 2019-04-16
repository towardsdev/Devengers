package com.test.sample;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String firstName;
	private String lastName;

	/*
	 * public Employee() { System.out.println("const 1"); }
	 * 
	 * public Employee(String firstName) { System.out.println("contsructor2");
	 * this.firstName = firstName; }
	 * 
	 * public Employee(String firstName, String lastName) {
	 * System.out.println("contsructor3"); this.firstName = firstName; this.lastName
	 * = lastName; }
	 */
	String getFirstName() {
		System.out.println("getFN");
		return firstName;
	}

	public String getLastName() {
		System.out.println("getLN");
		return lastName;
	}

	// creating a method that accepts only child class of Shape
	public static void drawShapes(List<? extends Shape> lists) {
		for (Shape s : lists) {
			s.draw();// calling method of Shape class by child class instance
		}
	}

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * System.out.println("main");
		 * 
		 * String test = "value";
		 * 
		 * Employee emp = new Employee();
		 * 
		 * System.out.println(emp.getFirstName());
		 * System.out.println(emp.getLastName());
		 * 
		 * 
		 * // Parent parent = new Parent();
		 * 
		 * // System.out.println(parent.calAge(2009));
		 * 
		 * Child child = new Child(); System.out.println(child.calculateAge(2001));
		 * Parent parent = new Parent(); System.out.println(parent.calculateAge(2001));
		 * parent = child; System.out.println(child.calculateAge(2001));
		 * System.out.println(parent.calculateAge(2001));
		 * 
		 * Parent p = new Child(); System.out.println(p.calculateAge(2001)); //Child ch
		 * = new Parent();
		 * 
		 * // System.out.println(child.calAge(2009));
		 */

		List<Rectangle> list1 = new ArrayList<Rectangle>();
		list1.add(new Rectangle());

		List<Circle> list2 = new ArrayList<Circle>();
		list2.add(new Circle());
		list2.add(new Circle());
		
		List<Square> list3 = new ArrayList<Square>();
		list3.add(new Square());

		drawShapes(list1);
		drawShapes(list2);
		//drawShapes(list3);
	}

}
