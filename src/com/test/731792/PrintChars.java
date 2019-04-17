package Practice1;

public class PrintChars {
	public static void main(String args[]){
		int i=1;
		do{
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.print("\n");
			i=i+2;
			
		}while(i<6);
		i=i-2;
		while(i>1){
			i=i-2;
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.print("\n");			
		}
	}
}
