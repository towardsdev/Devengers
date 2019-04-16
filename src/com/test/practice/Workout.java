package com.test.practice;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Workout {
	
//to print a star pattern 1 3 5 3 1
public void printStar() {
	int i;
	int j;
	int k=1;
	//to print 1,3 and 5 (odd) stars
	for(i=0;i<3;i++)
	{
		for(j=0;j<k;j++)
		{
			System.out.print("*");
		}
		k+=2;
		System.out.println();
	}
	
	//to print reverse order (3 and 1 number of stars)
	for(i=2;i>=1;i--)
	{
		for(j=1;j<(i*2);j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
}

//working with arraylist
//required index needs to be passed as argument
public void flowerList(int n) {
	int in=0;
	List<String> flowers = new ArrayList<String>();
	flowers.add("tulips");
	flowers.add("lilly");
	flowers.add("rose");
	
	try 
	{
		//to print a element at specified index
		if (!flowers.isEmpty() && n<=flowers.size()){
		System.out.println(flowers.get(n));
		}
	}
	catch(IndexOutOfBoundsException e){
		System.out.println("Please enter a valid number, less than or equal to " + flowers.size());
	}

//to print all elements in arraylist using index
	int totalElements = flowers.size();
	if(!flowers.isEmpty())
	{
		for(in=0;in<totalElements;in++)
		{
			System.out.println("The" + in +"element in list is:"+ flowers.get(in));
		}
	}
	else {System.out.println("Oops! the list is empty");}
}


public void linkedList(String name ) {
	int i,j;
	LinkedList<String> cars = new LinkedList<String>();
	cars.add("abc");
	cars.add("Audi");
	cars.add("BMW");
	cars.add("BMW");
	cars.add("Tesla");
	
	for(i=0;i<cars.size();i++) {
		if (cars.contains(name)){
			System.out.println("First Ooccurance is at"+i);
			break;
		}
	}
	for(j=cars.size()-1;j>0;j--)
	{
		if (cars.contains(name)){
			System.out.println("Last Ooccurance is at"+j);
			break;
	}
		
	}

}

public static void main(String[] args) {
	Workout w = new Workout();
	//w.printStar();
	//w.flowerList(5);
	//w.linkedList("BMW");
	
	//Employee e1 = new Employee();
	Employee e1 = Employee.getInstance();
	
	System.out.println(e1);
	
	//Employee e2 = new Employee();
	
	Employee e2 = Employee.getInstance();
	
	System.out.println(e2);
}
}