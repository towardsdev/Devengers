
public class MovieSeating {
	private static int availableSeats = 100;
	private static MovieSeating movieSeating = null;
/*private MovieSeating() {
	
}
public static MovieSeating getSingletonInstance() {
	if(movieSeating == null) {
		movieSeating = new MovieSeating();
	}
	return movieSeating;
	
}*/

public int getAvailableSeats() {
	return availableSeats;
}

public void setAvailableSeats(int givenSeats) {
	availableSeats = availableSeats - givenSeats;
}

}
