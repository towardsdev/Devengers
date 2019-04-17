package com.qa.sample;

import java.util.LinkedList;

public class Linkedlistinsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> linklistinsert=new LinkedList<String>();
linklistinsert.addFirst("ram");
linklistinsert.add("dam");
linklistinsert.addLast("sam");
linklistinsert.add(2, "lom");
for(String e : linklistinsert)
{
	System.out.println(e);
}




	}

}
