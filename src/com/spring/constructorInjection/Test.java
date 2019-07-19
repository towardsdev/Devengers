package com.spring.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("map.xml");
		// Bean with constructor of single argument
		//Employee emp = (Employee) context.getBean("employee");
		//emp.show();
		// Bean with constructor of double argument
		//Employee emp1 = (Employee) context.getBean("employee1");
		//emp1.show();
		
		// Bean to get the dependent class (Employee which is dependent with Address class)
		Employee emp2 = (Employee) context.getBean("q");
		emp2.show();
	}
}
