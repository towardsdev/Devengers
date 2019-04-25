package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("Lakshmi", "tryey", 10);
		Employee e1 = new Employee("sdrheh", "HF", 20);
		Employee e2 = new Employee("xfhder", "sergsw", 30);
		Employee e3 = new Employee();

		e3.setName("dfhedh");
		e3.setDepartment("egweg");
		e3.setEmpID(235);

		List<Employee> emp = new ArrayList<Employee>();
		emp.add(e);
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);

		System.out.println("Size of AL " + emp.size());

		Map<Integer, Employee> mapEmp = new HashMap<Integer, Employee>();

		for (Employee ee : emp) {
			mapEmp.put(ee.getEmpID(), ee);
		}
		
		for(Map.Entry<Integer, Employee> ent : mapEmp.entrySet()){
			System.out.println("Integer"+ent.getKey());
			System.out.println("Employee Department"+ent.getValue().Department);
			System.out.println("*******************");
		}
		
	
		
	}

}
