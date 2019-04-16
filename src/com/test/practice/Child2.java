package com.test.practice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Child2 extends Child{

public Child2() 
{
	//System.out.println("child2 constructor");
}

public int sum(int a,int b)
{
	System.out.println("sum in child2");
	int sum=(a+b)+2;
	return sum;
}

public int sum(int a,int b,int c)
{
	System.out.println("sum in child2");
	int sum=(a+b+c);
	return sum;
}

public String sum(int a,int b,String c)
{
	System.out.println("sum in child2");
	int sum=(a+b);
	return sum+ c;
}

public void example() {
	int i=0;
	int a = i++;//Assigns a as 0 and then increments i
	int b=++i;//increments i by 1 and then assigns to b
	System.out.println(i);
	System.out.println(a);
	System.out.println(b);
	
	//for (int i=0;i<5;++i)
	//System.out.println(i);
}

public void foreach() {
	List<String> flowers = new ArrayList<String>();
	flowers.add("tulips");
	flowers.add(1,"rose");
	flowers.add("lilly");
	
	System.out.println(flowers.get(1));
	
	for (String f : flowers)
	{
		//System.out.println(f);
		//System.out.println(f.contains("lips"));
		System.out.println(f.length());
	}
	
	
}


public static void main(String[] args)
{
//System.out.println("c2 main method");
Child2 c2 = new Child2();
/*Child c = new Child2();
Employee e = new Child2();
e.city="Chennai";
System.out.println(c2.sum(3, 5));
System.out.println(c2.sum(3, 5,6));
System.out.println(c2.sum(3, 5,"hello"));
System.out.println("city is"+ e.city);*/
//c2.example();
c2.foreach();

}
}