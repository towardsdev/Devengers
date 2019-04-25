package complex;
import java.util.*;

public class Arylst {

	public static void main(String args[])
	{
		List<String> abc = new ArrayList<String>();
		abc.add("Object");
		abc.add("Class");
		abc.add("Polymorphism");
		abc.add("Inheritance");
		abc.add("Encapsulation");
		System.out.println(abc.get(1));
		System.out.println("*************");
		
		for (String s:abc)
		{
			System.out.println(s);
		}
						
		
	}
}
