import java.util.Scanner;


public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Input Table number");
		int tabNo=s.nextInt();
		
		for(int i=1;i<=10;i++){
			System.out.println(tabNo+" * "+i+" = "+(tabNo*i));
		}
		
	}

}
