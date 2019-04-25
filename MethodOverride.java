
public class MethodOverride {
	//constructor
	public  MethodOverride(){
		System.out.println("Parent class constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Method overriding implementing parent class method
		MethodOverride parentMethod=new MethodOverride();
		parentMethod.parentDisplay();
		
		// Method overriding implementing child class method
		ChildClass childMethod=new ChildClass();
		childMethod.parentDisplay();
	}
	
	public void parentDisplay(){
		System.out.println("Parent Method");
	}

}

