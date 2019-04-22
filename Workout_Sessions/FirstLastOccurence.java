package Workout_Sessions;
import java.util.LinkedList;
public class FirstLastOccurence {

  public static void main(String[] args) {

     // create a LinkedList
     LinkedList<String> list = new LinkedList<String>();

     // Add elements
     list.add("AA");
     list.add("BB");
     list.add("CC");
     list.add("AA");
     list.add("DD");
     list.add("AA");
     list.add("EE");
 
     // Display LinkedList elements
     System.out.println("LinkedList elements: "+list);
     System.out.println("FirstIndex of AA:"+list.indexOf("AA"));
     System.out.println("LastIndex of AA:"+list.lastIndexOf("AA"));
     System.out.println("LastIndex of ZZ:"+list.lastIndexOf("ZZ"));
     System.out.println("FirstIndex of ZZ:"+list.indexOf("ZZ"));
  }
}


