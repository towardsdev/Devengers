package com.test.sample;

public class Parent {

	public Parent() {

		System.out.println("Parent const");
	}

	private String name;

	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int calculateAge(int year) {

		System.out.println("method in parent");
		int updatedAge;

		if (year > 2010) {
			updatedAge = 50;
		} else {
			updatedAge = 60;
		}

		return updatedAge;
	}

}
