package practice0423;

public class SingletonClassDemo {

	public static void main(String[] args){
		Movie m1=Movie.getinstance(5);
		Movie m2=Movie.getinstance(10);
		Movie m3=Movie.getinstance(15);
		
		m1.getinstance(5);
		m1.getinstance(10);
	}
}
