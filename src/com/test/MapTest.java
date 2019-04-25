package complex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {

	public static void main (String args[]){
		Map<Integer, String> mapValues = new HashMap<Integer,String>();
		mapValues.put(1, "Chennai");
		mapValues.put(2, "Mumbai");
		mapValues.put(3, "Kolkatta");
		mapValues.put(4, "Hyderabad");
		mapValues.put(5, "Delhi");
		System.out.println("Enter the Key Value that needs to be retrived");
		Scanner S = new Scanner(System.in);
		int key = S.nextInt();
		System.out.println(mapValues.get(key));
		S.close();
		
		
	}
}
