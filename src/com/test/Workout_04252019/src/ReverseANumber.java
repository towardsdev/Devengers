import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReverseANumber {
	private static final Logger LOGGER = Logger
			.getLogger(MultiplicationTable.class.getName());

	public static void main(String args[]) {
		int number = 0;
		LOGGER.info("Logger Name: " + LOGGER.getName());
		try {
			Scanner s = new Scanner(System.in);
			System.out
					.println("Enter the number which you would like to reverse");
			number = s.nextInt();
			s.close();
			System.out.println("Your reversed number by while method: " + reverseMyNumber(number, "while"));
			System.out.println("Your reversed number by for method: " + reverseMyNumber(number, "for"));
			System.out.println("Your reversed number by recursion method: " + reverseMyNumber(number, "recursion"));
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Exception occured", e);
		}
	}

	public static int reverseMyNumber(int number, String reversalMethod) {
		int reversedNumber = 0;
		switch (reversalMethod) {
		case "while":
			while (number != 0) {
				LOGGER.info("number= " + number + " reversedNumber= " + reversedNumber);
				reversedNumber = reversedNumber * 10;
				reversedNumber = reversedNumber + number % 10;
				number = number / 10;
			}
			break;
		case "for":
			for (; number != 0;) {
				LOGGER.info("number= " + number + " reversedNumber= " + reversedNumber);
				reversedNumber = reversedNumber * 10;
				reversedNumber = reversedNumber + number % 10;
				number = number / 10;
			}
			break;
		case "recursion":
			reversedNumber = reverseByRecursion(number);
			break;
		default:
			System.out
					.println("Unsupported Reversal Method: " + reversalMethod);
		}
		return reversedNumber;
	}

	public static int reverseByRecursion(int number) {
		LOGGER.info("number= " + number);
		if (number > 10)
			reverseByRecursion(number / 10);
		return number;
	}
}
