package com.test.simple;

import java.util.ArrayList;
import java.util.List;

class EnumClass {
	enum Season {
		WINTER(5), SPRING(10), SUMMER(15), FALL(20);

		private int value;

		private Season(int value) {
			this.value = value;
		}
	}

	/*
	 * public static void main(String args[]) { //for (Season s : Season.values())
	 * //System.out.println(s + " " + s.value);
	 * 
	 * List<String> list = new ArrayList<String>(); list.add("hello"); list.add(1);
	 * 
	 * for(int i = 0;i<list.size();i++) { System.out.println(list.get(i)); }
	 * 
	 * }
	 */
	
	public static <T> String printArray(T item) {
		
		return item.toString();
		
	}  
	
    public static void main( String args[] ) {  
        Integer[] intArray = { 10, 20, 30, 40, 50 };  
        Character[] charArray = { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' };  
  
        //System.out.println( "Printing Integer Array" );  
        //printArray( intArray  );   
  
       //System.out.println( "Printing Character Array" );  
       // printArray( charArray );   

        System.out.println(printArray("String"));
        System.out.println(printArray(1));
    }  
	
	
}
