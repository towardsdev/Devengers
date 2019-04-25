package complex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Lnklst2 {
	public static void main(String args[])
	{
		LinkedList<String> abc=new LinkedList<String>(); 
		abc.add("Object");
		abc.add("Polymorphism");
		abc.add("Class");
		abc.add("Inheritance");
		abc.add("Polymorphism");
		abc.add("Encapsulation");
		abc.add("Object");
		abc.add("Inheritance");
		abc.add("Encapsulation");
		abc.add("Class");
		
		
		System.out.println("Please enter element you wanted to add to Linked List");
		Scanner S = new Scanner(System.in);
		String element = S.nextLine();
		System.out.println("Please enter Index at which you want to add to Linked List");
		int ind = S.nextInt();
		S.close();
		abc.add(ind, element);
		for (String s:abc)
		{
			System.out.println(s);
		}
		
		
		}
}
