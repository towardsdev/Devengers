package com.test.sample;

public class Child extends Parent {

	public Child() {
		System.out.println("child const");
	}

	public String place;

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int calculateAge(int year) {

		System.out.println("method in child");
		int calculateAge;

		if (year > 2000) {
			calculateAge = 50;
		} else {
			calculateAge = 60;
		}

		return calculateAge;
	}

}
