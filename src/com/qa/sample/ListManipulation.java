package com.qa.sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListManipulation {
	public static List<String> Namelist= new ArrayList<String>();
	public static List<String> NewNamelist= new ArrayList<String>();

	public void ListAddModifyDelete(List<String> NewNamelist)
	{
		for(int i=0;i<NewNamelist.size();i++)
		{
					
			if(Namelist.contains(NewNamelist.get(i)))
			{
				List<String> Modifylist= new ArrayList<String>();
				Modifylist.add(NewNamelist.get(i));
				System.out.println(Modifylist + " is modified");
			}
			else
			{
				
				List<String> Addlist= new ArrayList<String>();
				Addlist.add(NewNamelist.get(i));
				System.out.println(Addlist+ " is added");
			}
			Set<String> listset = new HashSet<String>(Namelist);
			listset.retainAll(NewNamelist);
			if(!(listset.contains(Namelist.get(i))))
			{
				List<String> Deletelist= new ArrayList<String>();
				Deletelist.add(Namelist.get(i));
				System.out.println(Deletelist+ " is deleted");
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Namelist.add("A");
		Namelist.add("B");
		Namelist.add("C");
		NewNamelist.add("A");
		NewNamelist.add("D");
		NewNamelist.add("C");
		ListManipulation lm = new ListManipulation();
		lm.ListAddModifyDelete(NewNamelist);
	}

}
