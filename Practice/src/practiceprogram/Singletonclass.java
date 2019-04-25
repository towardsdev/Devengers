package practiceprogram;

public class Singletonclass {

	private Singletonclass() {

	}

	public static int NoOfTickets = 100;
	private static Singletonclass instance = null;

	public static Singletonclass getInstance() {
		if (instance == null) {
			instance = new Singletonclass();
		}
		return instance;
	}

	public static int booktickets(int Nu) {

		return NoOfTickets = NoOfTickets - Nu;
		
	}
}
