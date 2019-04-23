import java.util.Scanner;

public class Main {
	private static Scanner s;

	public static void main(String args[]) {
		System.out.println("Enter No. of customers");
		s = new Scanner(System.in);
		int numOfCustomers = Integer.parseInt(s.nextLine());
		for (int i = 0; i < numOfCustomers; i++) {
			System.out
					.println("Enter Customer name and required no.of seats separated by space");
			String custDetails[] = s.nextLine().split(" ");
			Customer c1 = new Customer(custDetails[0],
					Integer.parseInt(custDetails[1]));
			c1.seatAvailability();
		}
	}
}
