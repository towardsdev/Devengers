import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeFormat {

	static String timeConversion(String s) {
		int re = 0;
		int defaultt = 12;
		String time = s.substring(0, 2);
		System.out.println(time);
		String format = s.substring(8, 10);
		System.out.println(format);
		if (format.equalsIgnoreCase("PM") && Integer.parseInt(time) <= 12) {
			re = Integer.parseInt(time) + defaultt;
		}
		else{
			re = Integer.parseInt(s.substring(0, 2));
		}

		System.out.println(re);
		String re1 = Integer.toString(re);
		System.out.println(re1);
		StringBuffer buf = new StringBuffer(s);
		buf.replace(0, 2, re1);
		String s1 = buf.substring(0, 8);
		System.out.println(s1);

		return s1;

	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bw = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scan.nextLine();

		String result = timeConversion(s);

		// bw.write(result);
		// bw.newLine();

		// bw.close();
	}
}
