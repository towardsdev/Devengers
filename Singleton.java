package com.pack.sample;

public class Singleton {
	//1. Implement a singleton class and justify it by creating more than one object for it.
	int seats =100;
	private static Singleton Singleton_obj=null;
	private Singleton()
	{
		
	}
	public static Singleton getInstance()
	{
		if(Singleton_obj==null)
		{
			Singleton_obj=new Singleton();
			return Singleton_obj;
		}
		return Singleton_obj;
	}
	public void BookTicket(int count)
	{
		seats=seats-count;	
		System.out.println("Remaining seats as of now:"+seats);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton personA=Singleton.getInstance();
		personA.BookTicket(5);
		Singleton personB=Singleton.getInstance();
		personB.BookTicket(28);
		
	}

}
