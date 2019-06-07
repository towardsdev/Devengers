package com.tutorialspoint.Spring;

public class Spring_Singleton {
	private static Spring_Singleton ss;
	private static int noOfSeats=250;
	private int countOfTkts;
	
	private Spring_Singleton(){
		//method declared private object declaration is blocked.
	}
	public static int getNoOfSeats() {
		return Spring_Singleton.noOfSeats;
	}

	public static void setNoOfSeats(int noOfSeats) {
		Spring_Singleton.noOfSeats = noOfSeats;
	}

	public static Spring_Singleton getSs() {
		return ss;
	}
	public static void setSs(Spring_Singleton ss) {
		Spring_Singleton.ss = ss;
	}
	
	public int getCountOfTkts() {
		return countOfTkts;
	}
	public void setCountOfTkts(int countOfTkts) {
		this.countOfTkts = countOfTkts;
	}

	public static void bookSeats(int countOfTkts){
		noOfSeats=noOfSeats-countOfTkts;
		System.out.println("Total number of seats booked:"+countOfTkts);
	}
	
	public static Spring_Singleton createObject(){
		if(ss==null){
			ss=new Spring_Singleton();
		}
		return ss;
	}

}