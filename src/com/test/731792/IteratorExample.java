package Practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.LinkedList;


public class IteratorExample {
	public static void main(String args[]){
		List<String> intvalues = new ArrayList<String>();
		
		intvalues.add("Dravid");
		intvalues.add("James");
		intvalues.add("Kumble");
		intvalues.add("Sachin");
		intvalues.add("Karthik");
				
		Iterator intv;
		intv=intvalues.iterator();  
		System.out.println("Items in the list using iterator:");
		while(intv.hasNext())
			System.out.println(intv.next());
		//intv.remove();	
		//System.out.println(intvalues);
	}
}
