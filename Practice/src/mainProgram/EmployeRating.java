package src.mainProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import src.practiceprogram.PerformanceRating;

public class EmployeRating {

	public static String name;
	public static int nuofemp = 0;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number of Employees");
		nuofemp = scan.nextInt();
		for (int i = 0; i < nuofemp; i++) {
			System.out.println("Enter the Employee name");
			name = scan.next();
			System.out.println("Enter the performance details for Employee " + name);

			PerformanceRating pm = new PerformanceRating(scan.next(), scan.next(), scan.next());
			Map<String, PerformanceRating> Employeem = new HashMap<String, PerformanceRating>();

			Employeem.put(name, pm);
			for (Map.Entry entry : Employeem.entrySet()) {
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
			}

		}

	}

}
