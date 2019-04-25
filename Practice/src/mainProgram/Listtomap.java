package src.mainProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import src.practiceprogram.Employee;

public class Listtomap {

	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<Employee>();
		Map<Integer, Employee> mape = new HashMap<Integer, Employee>();

		emp.add(new Employee(101, "Venu"));
		emp.add(new Employee(201, "NGS"));
		emp.add(new Employee(301, "ECOS"));

		// To convert List to Map with Id as Key

		for (Employee e : emp) {

			mape.put(e.getId(), e);
			System.out.println(e.getId());
			System.out.println(e.getName());
		}
		System.out.println("******************** LIST To MAP CONVERSION**********************************");
		for (Map.Entry entry : mape.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}
