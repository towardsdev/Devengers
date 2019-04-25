package src.practiceprogram;

import java.util.Scanner;

public class MulitiplicationTable {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the number to multiple");
		int n = Scan.nextInt();
		System.out.println("Enter the number till which need to multiple");
		int p = Scan.nextInt();

		for (int i = 1; i <= p; i++) {

			System.out.println(n + " * " + i + " = " + n * i);
		}

	}

}
