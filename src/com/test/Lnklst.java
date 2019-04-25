package complex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lnklst {
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
		//Get the first element
		System.out.println(abc.getFirst());
		//Get the Last element
		System.out.println(abc.getLast());
		//Get the First instance of element
		System.out.println(abc.indexOf("Object"));
		//Get the Last instance of element
		System.out.println(abc.lastIndexOf("Object"));
		/*
		System.out.println("*************");
		
		for (String s:abc)
		{
			System.out.println(s);
		}
		*/
		LinkedList<String> def=new LinkedList<String>();
		def.add("Collections");
		def.add("Exception");
		def.addAll(abc);
		for (String s:def)
		{
			System.out.println(s);
		}
		
		
		}
}
