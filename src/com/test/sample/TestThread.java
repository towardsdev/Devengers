package com.test.sample;

class TestThread {

	public void run1() {
		for (int i = 1; i < 5; i++) {
			try {
				//this.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			//System.out.println(this.getId() + ", " + this.getName() + " and " + i);
			System.out.println(i);
		}
		
	}
	
	public void test() {
		
		System.out.println("Test");
	}

	public static void main(String args[]) {
		TestThread t1 = new TestThread();
		TestThread t2 = new TestThread();

		t1.run1();
		t2.run1();
		
		t1.test();
	}
}