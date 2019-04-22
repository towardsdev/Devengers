package Workout_Sessions;

public class movie {
	private static movie m =null;
	int Seat =100;
	
private movie(){
	//Blocking object declaration
}

public int getSeats()
{
	System.out.println("No of Seats remaining :" + Seat);
	return Seat;
	
}
public void bookTickets(int count)
{
	 Seat = Seat - count;
	System.out.println("Tickets Booked now :"+ Seat);
}
public static movie getInstance()
{
	if(m==null)
	{ 
		m = new movie();
	
	}else{
		return m;
	}
	return m;
	}


}
