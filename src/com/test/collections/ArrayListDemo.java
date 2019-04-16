package com.test.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		/*
		 * 
		 * //Declaring a list List<String> listOfValues = new ArrayList<String>();
		 * 
		 * //Adding elements to the list listOfValues.add("Rahul");
		 * listOfValues.add("Sharath"); listOfValues.add("Dravid");
		 * 
		 * listOfValues.add(4, "Text"); //Printing size of list
		 * //System.out.println(listOfValues.size());
		 * 
		 * //Iterate through list for(String value : listOfValues) {
		 * System.out.println(value); }
		 * 
		 * //Removing the element form the list
		 * //System.out.println(listOfValues.remove("Sharath"));
		 * //System.out.println(listOfValues.remove("Unknown"));
		 * 
		 * 
		 * //System.out.println(listOfValues.size());
		 * 
		 * for(String value : listOfValues) { //System.out.println(value); }
		 * 
		 * //System.out.println("Removing the element at index 1 - "+listOfValues.remove
		 * (1));
		 * 
		 * for(String value : listOfValues) { //System.out.println(value); }
		 * 
		 * List<Integer> intValues = new ArrayList<Integer>();
		 * 
		 * intValues.add(Integer.parseInt("1")); intValues.add(Integer.valueOf(2));
		 * intValues.add(Integer.valueOf(3));
		 * 
		 * for(Integer value : intValues) { //System.out.println("Int value - "+value);
		 * }
		 * 
		 * List<Integer> newList = new ArrayList<Integer>(); newList.addAll(intValues);
		 * 
		 * for(Integer value : newList) { //System.out.println("New value - "+value); }
		 * 
		 * 
		 * 
		 * //System.out.println(intValues.remove(2)); intValues.clear();
		 * 
		 * //System.out.println(intValues.size());
		 * 
		 * System.out.println(listOfValues.contains("Rahul"));
		 * System.out.println(listOfValues.contains("Rahul123"));
		 * System.out.println(listOfValues.isEmpty());
		 * 
		 */

		List<Integer> intValues = new ArrayList<Integer>();

		intValues.add(Integer.parseInt("1"));
		intValues.add(Integer.valueOf(2));
		intValues.add(Integer.valueOf(3));

		// for each loop
		for (Integer i : intValues) {
			// System.out.println(i);
		}

		// traditional for loop
		for (int i = intValues.size() - 1; i >= 0; i--) {

			// System.out.println(intValues.get(i));
		}

		// Iterator
		Iterator<Integer> i = intValues.iterator();
		while (i.hasNext()) {
			// System.out.println("@@");
			i.next();
		}

		List<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee("A", 10, "Cbe"));
		employees.add(new Employee("B", 20, "Chennai"));
		employees.add(new Employee("C", 30, "blore"));
		
		for (Employee e : employees) {
			//System.out.println(e.getName());
			//System.out.println(e.getId());
			//System.out.println(e.getCity());
			//System.out.println("#####################################");
		}
		
		Employee e1 = new Employee("A", 10, "Cbe");
		Employee e2 = new Employee("A", 20, "Cbe");
		
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println(e1.equals(e2));

	}

}
