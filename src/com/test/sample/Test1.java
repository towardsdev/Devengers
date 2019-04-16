package com.test.sample;

	final class Test1 {
	private double re, im;
	public Test1(double re, double im) {
	this.re = re;
	this.im = im;
	}
	Test1(Test1 c)
	{
	System.out.println("Copy constructor called");
	re = c.re;
	im = c.im;
	} 
	//public String toString() {
	//return (  re , im );
	//} 
	}
	class Main {
	public static void main(String[] args) {
		Test1 c1 = new Test1(10, 15);
		Test1 c2 = new Test1(c1); 
		Test1 c3 = c1; 
	System.out.println(c2);
	}

	
}
