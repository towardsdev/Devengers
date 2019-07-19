package com.spring.constructorInjection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// Method to validate constructor Injection

public class Employee {

	private int id = 0;
	private String name = "";
	private Address address;
	private List<String> answers;
	private Map<Answer,User> answers3;

	public Employee(int id) {
		this.id = id;
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Employee(int id, String name, Address address, List<String> answers) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.answers = answers;
	}
	public Employee(int id, String name, Address address, Map<Answer, User> answers3) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.answers3 = answers3;
	}
	public Employee(int id, String name, Map<Answer, User> answers3) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.answers3 = answers3;  
	}  
	
	
	void show() {
		System.out.println(id + " " + name + " " + address.toString());
		System.out.println("Anwers are");
		 Set<Entry<Answer, User>> set=answers3.entrySet();  
		 Iterator<Entry<Answer, User>> itr=set.iterator();  
		    while(itr.hasNext()){  
		        Entry<Answer, User> entry=itr.next();  
		        Answer ans=entry.getKey();  
		        User user=entry.getValue();  
		        System.out.println("Answer Information:");  
		        System.out.println(ans);  
		        System.out.println("Posted By:");  
		        System.out.println(user);  
		    }  

	}

}
