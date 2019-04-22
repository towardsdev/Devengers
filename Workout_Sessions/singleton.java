package Workout_Sessions;

public class singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		movie m1 =movie.getInstance();
		movie m2 =movie.getInstance();
		m1.getSeats();
		m1.bookTickets(5);
		m2.getSeats();
		m2.bookTickets(4);
	}

}
