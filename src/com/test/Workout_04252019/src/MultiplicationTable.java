import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MultiplicationTable {
	private static final Logger LOGGER = Logger
			.getLogger(MultiplicationTable.class.getName());

	private static final int multiplierLimit = 12;
	public static void main(String args[]) {
		long number = 0;
		LOGGER.info("Logger Name: " + LOGGER.getName());
		LOGGER.log(Level.INFO, "Program Name: Multiplication Table");
		try {
		Scanner s = new Scanner(System.in);
		System.out
				.println("Enter the number for which you would like to view the multiplication table");
		number = s.nextLong();
		s.close();
		LOGGER.info("Multiplication Table for the given number: " + number);
		for(int i=1; i <= multiplierLimit; i++) {
			// LOGGER.info(number + " X " + i + " = " + number * i);
			System.out.println(number + " X " + i + " = " + number * i);
		}
	} catch(InputMismatchException e) {
		// System.out.println("Sorry that's an unsupported input!");
		LOGGER.log(Level.SEVERE, "Exception occured", e);
	}
	}
}

/*long range: –9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.*/
/*int range: –2,147,483,648 to 2,147,483,647.*/
