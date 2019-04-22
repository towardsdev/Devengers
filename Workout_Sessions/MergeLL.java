package Workout_Sessions;

import java.util.LinkedList;

public class MergeLL {
	public static void main(String[] args) {
		// create an empty linked list
		LinkedList<String> l_list = new LinkedList<String>();
		// use add() method to add values in the linked list
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("Pink");
		l_list.add("orange");

		System.out.println("First linked list:" + l_list);
		LinkedList<String> l_list2 = new LinkedList<String>();
		// use add() method to add values in the linked list
		l_list2.add("Purple");
		l_list2.add("Green");
		l_list2.add("Black");
		l_list2.add("Pink");
		l_list2.add("Brown");
		System.out.println("Second linked list:" + l_list2);
		LinkedList<String> a = new LinkedList<String>();
		a.addAll(l_list);
		a.addAll(l_list2);
		System.out.println("Merged linked list: " + a);

	}
}
