package Practice1;

import java.util.List;
import java.util.ArrayList;

public class ListExample {
	public static void main(String args[]){
		List<String> example=new ArrayList<String>();
		for(int i=0;i<5;i++)
		{
			example.add("Dravid");
			example.add("James");
			example.add("Kumble");
			example.add("Sachin");
			example.add("Karthik");
		}
		System.out.println(example.get(3));
		System.out.println(example.indexOf("Kumble"));
	}
}
