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
	
	mapEmp.put(1, emp1);
	
	
	
	
	}
}
