package complex;

import java.util.HashMap;
import java.util.Map;

public class EmpMap extends Employee {

	public static void main(String args[])
	{
	Map<Integer,Employee> mapEmp = new HashMap<Integer,Employee>();
	
	Employee emp1 = new Employee();
	emp1.setEmp_id(1);
	emp1.setName("Ram");
	emp1.setAdrr("New Street");
	Employee emp2 = new Employee();
	emp2.setEmp_id(2);
	emp2.setName("Ravan");
	emp2.setAdrr("Spring Street");
	
	mapEmp.put(emp1.getEmp_id(), emp1);
	mapEmp.put(emp2.getEmp_id(), emp2);
	
	for(Map.Entry m:mapEmp.entrySet()){
		System.out.println(m.getKey()+""+m.getValue());	
	}
	
	
	
	}
}
