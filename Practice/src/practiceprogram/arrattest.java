package practiceprogram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrattest {

	public static void main(String[] args) {
		
		
		List<String> arrayl = new ArrayList<String>();
			
		arrayl.add("Venu");
		arrayl.add(1, "NGS");
		arrayl.add(2, "NGSsecond");
		arrayl.add(3, "NGSthird");
		System.out.println(arrayl.contains("Venu"));
		System.out.println(arrayl.size());
		System.out.println(arrayl.isEmpty());
		
		// to get the value at specified index
		System.out.println("Value at spectified index "+ arrayl.get(1));
		
		// Using for each loop
		System.out.println("For Each *******************************************************");
		
		for(String e : arrayl){
			
			System.out.println(e);
		}
		System.out.println("For loop *******************************************************");
		
		for(int i=arrayl.size()-1; i >= 0; i--){
			System.out.println(arrayl.get(i));
		}
		
		System.out.println("Iterator *******************************************************");
		Iterator<String> i = arrayl.iterator();

		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
