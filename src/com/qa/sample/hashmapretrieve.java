package com.qa.sample;

import java.util.HashMap;
import java.util.Map;

public class hashmapretrieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap<String,String> hm = new HashMap();
	hm.put("rajesh", "engineer");
	hm.put("", "engineer");
	hm.put("ammu", "doctor");
	
	System.out.println(hm.containsKey("ammu"));
	System.out.println(hm.containsValue("doctor"));
	System.out.println(hm.keySet());
	System.out.println(hm.get("ammu"));
	
	
	System.out.println(hm.size());
	for(Map.Entry<String,String> me : hm.entrySet())
	{
		System.out.println("key :"+me.getKey());
		System.out.println("key :"+me.getValue());
		
	//	System.out.println("key :"+me.getClass());
	}
	
	
	
	
	}

}


