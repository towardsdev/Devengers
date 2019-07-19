package com.spring.constructorInjection;

public class Address {

	private String Street;
	private int Door;
	private String City;

	public Address(int Door, String Street, String City) {

		this.City = City;
		this.Door = Door;
		this.Street = Street;
	}
	
	public String toString(){
		return Street+" "+City+ " "+ Door;
	}

}
