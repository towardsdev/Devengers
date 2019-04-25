package practice0415;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayValue {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrList={10,8,9,58};
		
		Scanner inPut = new Scanner(System.in);
		System.out.println("please input index value");
		int i = inPut.nextInt();
		System.out.println("Array value for the given index "+i+" is " +arrList[i] );
		
		// to print the array list values
		ArrList al=new ArrList(10, "Tom");
		ArrList al1=new ArrList(20, "Chandler");
		ArrList al2=new ArrList(30, "Jason");
		List<ArrList> arrlst=new ArrayList<ArrList>();
		arrlst.add(al);
		arrlst.add(al1);
		arrlst.add(al2);
		System.out.println("Array list values");
		for(ArrList alValue:arrlst){
			System.out.println("Employee ID = "+alValue.empID);
			System.out.println("Employee Name = "+alValue.nameEmp);
		}
	}

}
