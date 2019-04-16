package com.test.sample;

public class ExceptionSample {

	public int operation(int a, int b) {

		int result = 0;

		int firstValue = a * 10;

		int secondValue = b * 10;

		try {
			result = firstValue / secondValue;
		}

		catch (ArithmeticException e) {
			
		}

		return result - 10;
	}

	public static void main(String[] args) {

		ExceptionSample e = new ExceptionSample();

		int output = e.operation(70, 0);

		System.out.println(output);

	}
}
