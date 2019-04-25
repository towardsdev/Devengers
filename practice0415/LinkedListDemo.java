package practice0415;

import java.util.LinkedList;



public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<String> ll=new LinkedList<String>();  
		 ll.add("Jose");  
		 ll.add("Jumbo");  
		 ll.add("Tango");  
		  
		 for(String i:ll){
			 System.out.println(i);
		 }
		 
		 ll.addFirst("AddedFirst");
		 ll.add(3, "Jose");
		 System.out.println("After adding the new value");
		 for(String i:ll){
			 if(i=="Jose"?true:false){
				 
			 }
			 System.out.println(i);
		 }
		 
		 
	}

}
