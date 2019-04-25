package list;

import java.util.ArrayList;
import java.util.List;




public class ArrayListValidation {

//	public ArrayList() {
//		System.out.println("pareant class constructor");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		java.util.List arraylistA = new java.util.ArrayList();
		List<String> al=new ArrayList<String>();
		al.add("abc");
		al.add("efg");
		for(String name:al){
			System.out.println(name);		
		}
		ArrayListValidation ar=new ArrayListValidation();
		ar.methodImp();
	}

	public void methodImp() {
		System.out.println("Method Implementation");
	}
}
