package Workout_Sessions;

public class PrintStar {
	
	 
	       public static void main(String[] args) {
	 
	              for (int i = 1; i <= 5; i++) {
	 
	                     for (int j = 0; j < i; j++) {
	 
	                           if ((i == 2) || (i == 4)) {
	                                  continue;
	                           }
	                           System.out.print("*");
	                     }
	                     if ((i == 2) || (i == 4)) {
	                           continue;
	                     }
	                     System.out.println("");
	              }
	 
	              for (int i = 3; i > 0; i--) {
	 
	                     for (int j = 0; j < i; j++) {
	 
	                           if (i == 2) {
	                                  continue;
	                           }
	                           System.out.print("*");
	                     }
	                     if (i == 2) {
	                           continue;
	                     }
	                     System.out.println("");
	 
	              }
	       }
	} 


