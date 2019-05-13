import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinMax {

	// Complete the miniMaxSum function below.
	static void miniMaxSum(int[] arr) {
		int i = 0;
		long max = arr[0];
		long min = arr[0];
		long minsum = 0;
		long maxsum = 0;
		long sum =0;
		for (i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		for (int k = 1; k < arr.length; k++) {
			if (arr[k] < min) {
				min = arr[k];
			}
		}
		
		for(int h =0;h<arr.length;h++){
			sum =sum + arr[h];
		}
		
//		for (int j = 0; j < arr.length; j++) {
//			if (arr[j] == max) {
//				continue;
//			}
//			minsum = minsum + arr[j];
//
//		}
//		
//		for(int l=0;l<arr.length;l++){
//			if (arr[l] == min) {
//				continue;
//			}
//			maxsum = maxsum + arr[l];
//			
//		}
		System.out.println((sum-max) +" "+(sum-min));

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[5];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < 5; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		miniMaxSum(arr);

		scanner.close();
	}
}
