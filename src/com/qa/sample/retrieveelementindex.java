package com.qa.sample;

import java.util.ArrayList;
import java.util.List;

public class retrieveelementindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al = new ArrayList<String>();
al.add("rajesh");
al.add("ammu");
al.add("sujith");
al.add("malar");
al.ensureCapacity(2);
//to retrieve element at specific index
System.out.println(al.get(2));
//to retrieve all elements
for(String names : al)
{
	System.out.println(names);
}


	}

}
