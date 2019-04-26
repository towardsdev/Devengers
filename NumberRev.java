public class NumberRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=533203;
		int no1=no;
		int len=String.valueOf(no).length();
		int modVal=0;
		System.out.println("Number reverse");
		for(int i=1;i<=len;i++){
			modVal=modVal*10;
			modVal=modVal+no%10;
			no=no/10;
		}
		System.out.println("original number :"+no1+" Reversed number :"+modVal);
	}

}
