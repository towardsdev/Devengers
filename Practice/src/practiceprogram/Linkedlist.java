package src.practiceprogram;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {

		LinkedList<String> emp = new LinkedList<String>();

		emp.add("Name1");
		emp.add(1, "Name2");
		emp.add("Name3");

		System.out.println("First Element of the Linkedlist " + emp.getFirst());
		System.out.println("Last Element of the Linkedlist " + emp.getLast());

		LinkedList<String> emp1 = new LinkedList<String>();

		emp1.add("NGS1");
		emp1.add(1, "NGS2");
		emp1.add("NGS3");
		emp1.add("NGS4");

		// TO Add emp linked list to emp1 linked list

		emp1.addAll(emp);

		System.out.println("@**********************************");

		for (String E : emp1) {

			System.out.println(E);
		}

	}
}
