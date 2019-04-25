package src.mainProgram;

import src.practiceprogram.Singletonclass;

public class SingletonMain {

	public static void main(String[] args) {

		Singletonclass e = Singletonclass.getInstance();
		System.out.println(e);

		Singletonclass e1 = Singletonclass.getInstance();
		System.out.println(e1);

		e.booktickets(5);
		System.out.println(e.NoOfTickets);
		e.booktickets(4);
		System.out.println(e.NoOfTickets);
	}

}
