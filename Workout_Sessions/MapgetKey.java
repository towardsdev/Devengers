package Workout_Sessions;

import java.util.HashMap;

public class MapgetKey {

	
	public static void main(String args[]){  
		   HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		   hash_map.put(1,"Linea");
		  hash_map.put(2,"Benz");
		  hash_map.put(3,"Audi");
		  hash_map.put(4,"BMW");
		  hash_map.put(5,"Alto");
		     
		   String val=(String)hash_map.get(3); 
		   
		   System.out.println("Value for key 3 is: " + val);
		   
           String val1=(String)hash_map.get(2); 
		   
		   System.out.println("Value for key 2 is: " + val1);
		   
		 }
}
