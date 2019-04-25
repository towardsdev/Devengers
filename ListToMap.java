package com.pack.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//Create a class Employee and load a list of employee and convert it into map which takes Emp id as key and the object itself as value.
public class ListToMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee("ABC",23,"Adayar");
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee("AAA",23,"Adayar"));
		employees.add(new Employee("BBB",24,"Siruseri"));
		employees.add(new Employee("CCC",29,"Velachery"));
		Map<String,Employee> EmpMap=new HashMap<String,Employee>();
		for(Employee e:employees)
		{
		//EmpMap.put(e.getEmpname(), new Employee(e.getAge(),e.getAddress()));
			EmpMap.put(e.getEmpname(), e);
		}
		System.out.println("Map: "+EmpMap.toString());
		for(Map.Entry<String,Employee> entry:EmpMap.entrySet())
		{
			System.out.println("\nEmployee name:"+entry.getKey()+" "+"\nEmployee Age:"+entry.getValue().getAge());
			/*if(entry.getValue().getAge()==24)
			{			
				System.out.println(entry.getKey());
			}*/
		}
		
		
		
		
	}

}
