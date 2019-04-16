package com.test.collections;

public class Employee {

	public Employee(String name, int id, String city) {
		this.name = name;
		this.id = id;
		this.city = city;
	}

	private String name;
	private int id;
	private String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String toString() {

		return this.name;
	}

	public boolean equals(Employee e) {

		return this.id == e.id;
	}
}
