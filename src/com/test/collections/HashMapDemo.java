package com.test.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> mapValues = new HashMap<Integer, String>();

		mapValues.put(1, "Rahul");
		mapValues.put(2, "Sharath");
		mapValues.put(3, "Dravid");

		// System.out.println(mapValues.get(3));

		// for(Map.Entry entry : mapValues.entrySet()) {

		// System.out.println(entry.getKey());
		// .out.println(entry.getValue());
		// }

		// Iterating the keys
		// for(Integer i : mapValues.keySet()) {
		// System.out.println(i);
		// System.out.println(mapValues.get(i));
		// }

		// Iterating the values
		for (String s : mapValues.values()) {
			System.out.println(s);
		}
	}

}
