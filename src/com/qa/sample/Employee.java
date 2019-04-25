package com.qa.sample;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	public static List<String> Employeelist = new ArrayList<String>();
	public static List<Integer> Employeeid = new ArrayList<Integer>();
	
	public void Addemployeename(String empname)
	{
		Employeelist.add(empname);	
	}
	public void Addemployeeid(Integer empid)
	{
		Employeeid.add(empid);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.Addemployeename("Rajesh");
		emp.Addemployeename("Sujith");
		emp.Addemployeename("Malar");
		emp.Addemployeeid(123);
		emp.Addemployeeid(234);
		emp.Addemployeeid(456);
		System.out.println(Employeelist);
		
		AddEmployeesListintoMap admp = new AddEmployeesListintoMap();
		admp.Insertemployeelistintomap(Employeeid,emp);
	}

}
