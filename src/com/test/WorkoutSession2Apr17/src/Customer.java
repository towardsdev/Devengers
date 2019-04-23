public class Customer {
	private String custName;
	private int custRequiredSeats;
	// MovieSeating m = MovieSeating.getSingletonInstance();

	MovieSeating m = new MovieSeating();
	public Customer(String custName, int custRequiredSeats) {
		this.custName = custName;
		this.custRequiredSeats = custRequiredSeats;
	}

	public void seatAvailability() {
		if (this.custRequiredSeats <= m.getAvailableSeats()) {
			m.setAvailableSeats(this.custRequiredSeats);
			System.out.println("Dear " + this.custName
					+ " you have successfully booked " + this.custRequiredSeats
					+ " seats");
			System.out.println("System Log: Remaining seats: "
					+ m.getAvailableSeats());
		} else {
			System.out.println("Sorry " + this.custName + " requested "
					+ this.custRequiredSeats + " seats aren't available");
			;
			System.out.println("System Log: Remaining seats: "
					+ m.getAvailableSeats());
		}
	}

}
