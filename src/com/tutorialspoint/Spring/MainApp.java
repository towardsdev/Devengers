package com.tutorialspoint.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//      HelloWorld obj = (HelloWorld) context.getBean("HelloWorld");
//      obj.getMessage();
      Spring_Singleton.createObject();
      Spring_Singleton obj = (Spring_Singleton) context.getBean("singleton");
      int intRequest=obj.getCountOfTkts();
      System.out.println("no of seats requested:"+intRequest);
      Spring_Singleton.bookSeats(intRequest);
      System.out.println("Total seats available after booking:"+Spring_Singleton.getNoOfSeats());
      
      Spring_Singleton obj_1 = (Spring_Singleton) context.getBean("singleton");
      System.out.println("Total no of seats available for next person:"+obj_1.getNoOfSeats());
   }
}