package com.qa.sample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddEmployeesListintoMap {
	
HashMap<Integer,Object> Employeehashmap = new HashMap();

public void Insertemployeelistintomap(List<Integer> Employeeid,Employee em)
{
	for(int i =0;i<Employeeid.size();i++)
	{
		Employeehashmap.put(Employeeid.get(i),em.Employeelist.get(i));
			}
	System.out.println(Employeehashmap);
}



}
