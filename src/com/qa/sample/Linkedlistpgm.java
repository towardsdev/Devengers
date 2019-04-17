package com.qa.sample;

import java.util.LinkedList;

public class Linkedlistpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> ll = new LinkedList<String>();
ll.add("rajesh");
ll.add("ammu");
ll.add("sujith");
ll.add("rahul");
ll.add("jeevan");
//to print first element in a linked list
System.out.println(ll.getFirst());
//to print last element in a linked list
System.out.println(ll.getLast());
ll.getLast();
//to join 2 linked list
LinkedList<String> ll2 = new LinkedList<String>();
ll2.addAll(ll);
for(String names : ll2)
{
	System.out.println(names);
}
	}
	
	
}
