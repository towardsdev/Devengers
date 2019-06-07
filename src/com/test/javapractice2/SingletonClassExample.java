package com.test.javapractice2;

public class SingletonClassExample {
	private static SingletonClassExample sc;
	private static int noOfSeats=100;
	private SingletonClassExample(){
		//Object declaration is blocked
	}
	public static SingletonClassExample getSc() {
		return sc;
	}
	public static void setSc(SingletonClassExample sc) {
		SingletonClassExample.sc = sc;
	}
	public static int getNoOfSeats() {
		return noOfSeats;
	}
	public static void setNoOfSeats(int noOfSeats) {
		SingletonClassExample.noOfSeats = noOfSeats;
	}
	public boolean bookTickets(int countOfTkts){
		boolean result=false;
		if(countOfTkts<noOfSeats){
			this.noOfSeats=this.noOfSeats-countOfTkts;
			result=true;
		}
		return result;
	}
	
	public static SingletonClassExample createObject(){
		if(sc==null)
			sc=new SingletonClassExample();
		return sc;
	}
	
}
