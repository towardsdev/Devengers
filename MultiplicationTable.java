package com.pack.sample;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		int till=scan.nextInt();
		int op=0;
		for(int i=1;i<=till;i++){
			op=number*i;
			System.out.println(number+" * "+i+" = "+op);
		}

	}

}
