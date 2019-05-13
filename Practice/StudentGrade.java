import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class StudentGrade {

	/*
	 * Complete the gradingStudents function below.
	 */
	static int[] gradingStudents(int[] grades) {

		int i = 0;
		int[] newgrades = new int[grades.length];
		for (i = 0; i < grades.length; i++) {

			if ((!((grades[i] % 5) == 0)) && (grades[i] >= 38)) {

				newgrades[i] = (grades[i] + 5) / 5 * 5;
				if (newgrades[i] - grades[i] < 3) {
					newgrades[i] = newgrades[i];
				} else {
					newgrades[i] = grades[i];
				}

			}
			
			else if(grades[i] < 38){
				newgrades[i] = grades[i];
			}
			
			System.out.println(newgrades[i]);
		}

		return newgrades;

		/*
		 * Write your code here.
		 */

	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bw = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(scan.nextLine().trim());

		int[] grades = new int[n];

		for (int gradesItr = 0; gradesItr < n; gradesItr++) {
			int gradesItem = Integer.parseInt(scan.nextLine().trim());
			grades[gradesItr] = gradesItem;
		}

		int[] result = gradingStudents(grades);

		// for (int resultItr = 0; resultItr < result.length; resultItr++) {
		// bw.write(String.valueOf(result[resultItr]));
		//
		// if (resultItr != result.length - 1) {
		// bw.write("\n");
		// }
		// }
		//
		// bw.newLine();
		//
		// bw.close();
	}
}
