package complex;

import java.util.Scanner;

public class Singleton {

	private static Singleton sing = null;
	static int seat = 100;
	private Singleton(){
		
	}
	public static Singleton getInstance(){
		if (sing==null){
			sing = new Singleton();
		}
		return sing;
	}
	public void bookTicket(int count){
		seat = count - seat;
	}
	
	public static void main (String args[]){
		System.out.println("Please Enter the number of Seats you want to Book");
		Scanner s = new Scanner(System.in);
		int Count = s.nextInt();
		//s.close();
		sing.getInstance();
		sing.bookTicket(Count);
		System.out.println("Total Available Tickets"+ seat);
		System.out.println("Please Enter the number of Seats you want to Book");
		Scanner s2 = new Scanner(System.in);
		int count2 = s.nextInt();
		//s2.close();
		sing.getInstance();
		sing.bookTicket(count2);
		System.out.println("Total Available Tickets"+ seat);
				
	}
}
