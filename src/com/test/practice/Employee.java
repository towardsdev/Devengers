package com.test.practice;

public class Employee {

	
		// TODO Auto-generated method stub
		//System.out.println("Hello World");
		
		private String firstName;
		private String lastName;
		protected String city;
		
		private static Employee emp = null;
		
		private Employee() {
			//System.out.println("Constructor 1");
			}
		
		public static Employee getInstance() {
			
			if(emp == null) {
				
				emp = new Employee();
				return emp;
			}
			
			else {
				return emp;
			}
		}
		
		public Employee(String firstName, String lastName) {
			System.out.println("Constructor2)");
			this.firstName=firstName;
			this.lastName=lastName;
						
		}
		
		public void setName(String firstName,String lastName)
		{
			System.out.println("I am in setmethod");	
			this.firstName= firstName;
			this.lastName= lastName;
			
		}
		
		public String getfirstName()
		{
			System.out.println("set frist name");
			return this.firstName;
			
		}
		
		public String getlastName()
		{
			System.out.println("set last name");
			return this.lastName;
			
		}
		
		public int sum(int a, int b) {
			System.out.println("parent sum method");
			int sum= a*b;
			return sum;
			
		} 
		
		public static void main(String[] args) {
		System.out.println("I am in main");
		Employee emp = new Employee();
		//emp.setName("Sathya","Arukkutti");
		//System.out.println(emp.getfirstName());
		//System.out.println(emp.getlastName());
		//Employee emp1 = new Employee("a","b");
		//System.out.println(emp1.getfirstName());
		//System.out.println(emp1.getlastName());
		Employee p= new Child();
		Employee c2 = new Child2();
		System.out.println(p.sum(1,2));
		System.out.println(emp.sum(1,2));
		System.out.println(c2.sum(1,2));
	}
		

}
