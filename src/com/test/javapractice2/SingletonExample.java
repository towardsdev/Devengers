package com.test.javapractice2;

import java.io.IOException;

public class SingletonExample {

	public static void main(String[] args) throws IOException {
		SingletonClassExample scObj;
		SingletonClassExample scObj2;
		scObj=SingletonClassExample.createObject();
		scObj.bookTickets(110);
		scObj2=SingletonClassExample.createObject();
		System.out.println(scObj2.getNoOfSeats());
	}
	
}
