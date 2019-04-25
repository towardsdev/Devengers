package practice0423;

public class Movie {
private static Movie m=null;
private static int noCount=100;
	private Movie(){
		//private constructor
	}
	
	private void seat(int no){
		noCount=noCount-no;		
	}
	
	public static Movie getinstance(int noOfTickets){
		System.out.println("Seat availability ="+noCount);
		if(m==null){
			m= new Movie();
			m.seat(noOfTickets);
			System.out.println("First Instance");
		}else{
			m.seat(noOfTickets);
			System.out.println("Not a first instance");
		}
		System.out.println("no Of Tickets Booked :"+noOfTickets);
		System.out.println("*****************************");
		return m;
	}
	
}
