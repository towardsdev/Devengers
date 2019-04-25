package src.practiceprogram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EmployeeRating {

	public static void main(String[] args) {
		performance();
	}

	public static void performance() {

		List<String> emp = new ArrayList<String>();
		Map<String, String> rate = new HashMap<String, String>();

		emp.add("Emp1");
		emp.add("Emp2");
		emp.add("Emp3");

		Scanner scan = new Scanner(System.in);

		System.out.println("Provide Employee Name");
		String employee = emp.get(scan.nextInt());
		System.out.println("Provide deliverable rating");
		String Deliverable = scan.next();
		System.out.println("Provide sports rating");
		String sports = scan.next();
		System.out.println("Provide outreach rating");
		String outreach = scan.next();

		if ((Deliverable.equalsIgnoreCase("A")) && (sports.equalsIgnoreCase("A")) && (outreach.equalsIgnoreCase("A"))) {

			rate.put(employee, "1st");
		}
		
		else if((Deliverable.equalsIgnoreCase("A")) && (sports.equalsIgnoreCase("A")) && (outreach.equalsIgnoreCase("B"))){
			rate.put(employee, "2st");
		}

			
	}

}
