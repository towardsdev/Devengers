package practice0415;

public class PrintStructure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int star = 5;

        for(int i = 1; i <= star; i=i+2) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
		}
        
        for(int i = 3; i>=0; i=i-2) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
		}
        
	}

}
