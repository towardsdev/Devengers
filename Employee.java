package com.pack.sample;

import java.util.Objects;
//Create a class Employee and load a list of employee and convert it into map which takes Emp id as key and the object itself as value.
//Override equals(),hashcode() and toString()
public class Employee {
//Github
	private String empname;
	private int age;
	private String address;
	
	public Employee(String empname,int age,String address)
	{
		this.empname = empname;
		this.age = age;
		this.address = address;
		
	}
	public Employee(int age,String address)
	{
		
		this.age = age;
		this.address = address;
		
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public boolean equals(Object object) {
		boolean result = false;
		System.out.println(object.getClass());
		if (object == null || object.getClass() != getClass()) {
			result = false;
		} else {
			Employee Emp = (Employee) object;
			if (this.getAge() == Emp.getAge() && this.getEmpname() == Emp.getEmpname() && this.getAddress()==Emp.getAddress())
			{
				result = true;
			}
		}
		return result;
	}

	@Override
	public int hashCode() {
		 return Objects.hash(empname, age, address);		
	}
	@Override
	public String toString()
	{
		return empname+" "+age+" "+address;
	}
	public static void main(String args[])
	{
		Employee A=new Employee("Ashok",25,"Adayar");
		Employee B=new Employee("Ashok",25,"Adayar");
		System.out.println(A.equals(B));
		System.out.println("Hashcode value for Employee A :"+A.hashCode());
		System.out.println("Hashcode value for Employee B :"+B.hashCode());
		
	}

}
