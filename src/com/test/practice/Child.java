package com.test.practice;

public class Child extends Employee{
	
	private String city;
	
	public Child(){
		//System.out.println("Child constructor");
	}
	
	public int sum(int a, int b) {
		System.out.println("child method");
		int sum= a+b;
		return sum;
		
	}
	
	public static void main(String[] args)
{
	System.out.println("child main");
	Child c = new Child();
	Employee p = new Child();
	Employee e = new Employee();
	//c.setName("childfn", "childln");
	//System.out.println(c.getfirstName());
	//System.out.println(c.getlastName());
	System.out.println(c.sum(1,2));
	System.out.println(p.sum(1,2));
	System.out.println(e.sum(1,2));
	System.out.println(c.city="chennai");
	
}
}