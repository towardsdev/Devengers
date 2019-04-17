package com.test.javapractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.xml.soap.Node;


public class LinkedListExample {
	private Node first;
	
	public static void main(String args[]){
		
			List<String> intvalues = new LinkedList<String>();
			List<String> Stringvalues = new LinkedList<String>();
			
			intvalues.add("Dravid");
			intvalues.add("James");
			intvalues.add("Kumble");
			intvalues.add("Sachin");
			intvalues.add("Karthik");
			intvalues.add("James");
			intvalues.add("Sachin");
			
			Stringvalues.add("Cricket");
			Stringvalues.add("FootBall");
			Stringvalues.add("Hockey");
			Stringvalues.add("Rugby");
			
			System.out.println("First Occurrence of James in the intvalues list is:");
			System.out.println(intvalues.indexOf("James"));
			System.out.println("Last Occurrence of Sachin in the intvalues list is:");
			System.out.println(intvalues.lastIndexOf("Sachin"));
			
			System.out.println("Join Linked List:");
			Stringvalues.addAll(intvalues);
			
			System.out.println(Stringvalues);
			
	}
	
}

