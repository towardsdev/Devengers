package com.pack.sample;

import java.util.ArrayList;
import java.util.List;

public class ListValidation {
	
	//Write a program to find the added, modified and deleted items in a list. 
	//For example, I have list of string which has A, B and C in it 
	//input list contains A, D, C then A is modified, D is added and C is modified and B is deleted.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<String> Original=Arrays.asList("A","B","C");
		
		List<String> Original=new ArrayList<String>();
		List<String> input=new ArrayList<String>();
		
		List<String> List1=new ArrayList<String>();
		List<String> List2=new ArrayList<String>();
		List<String> List3=new ArrayList<String>();
		
		Original.add("A");
		Original.add("B");
		Original.add("C");
		input.add("A");
		input.add("D");
		input.add("C");
		
		List1.addAll(Original);
		List2.addAll(input);
		List3.addAll(Original);
		
		//System.out.println(Original.equals(input));
		List1.removeAll(input); // To find deleted element
		List2.removeAll(Original); //To find new element added
		List3.retainAll(input);// Common or modified elements between list
		System.out.println("Deleted Element: "+List1);
		System.out.println("Added Element: "+List2);
		System.out.println("Modified Elements: "+List3);
		
	}

}
