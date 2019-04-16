package com.test.simple;

import com.test.sample.Employee;

public class Test {

	public boolean check(int hrs, int min) {

		// if(hrs >= 17 || (hrs == 16 && min > 30)) {
			//return true;
		//}
		//return false;
		
		return (hrs >= 17 || (hrs == 16 && min > 30)) ? true : false;
	}

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.check(15, 15));
		System.out.println(t.check(15, 30));
		System.out.println(t.check(15, 45));
		System.out.println(t.check(16, 15));
		System.out.println(t.check(16, 30));
		System.out.println(t.check(16, 45));
		System.out.println(t.check(17, 00));
		System.out.println(t.check(17, 15));
		System.out.println(t.check(20, 15));
		System.out.println(t.check(20, 45));
		// emp.getFirstName();
		// emp.getLastName();
	}
}
