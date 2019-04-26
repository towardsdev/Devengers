package complex;

import java.util.*;

public class Rating {

	private String deliverable;
	private String sports;
	private String outreach;
	private int emp_id;
	private String emp_name;
	public static String rate = null;
	
		
	public String getDeliverable() {
		return deliverable;
	}



	public void setDeliverable(String deliverable) {
		this.deliverable = deliverable;
	}



	public String getSports() {
		return sports;
	}



	public void setSports(String sports) {
		this.sports = sports;
	}



	public String getOutreach() {
		return outreach;
	}



	public void setOutreach(String outreach) {
		this.outreach = outreach;
	}



	public int getEmp_id() {
		return emp_id;
	}



	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}



	public String getEmp_name() {
		return emp_name;
	}



	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}



	public String rating(String deliverable, String sports, String outreach)
	{
		
		if (deliverable.equals("A") && sports.equals("A") && outreach.equals("A"))
		{
			rate = "A";
			}
		else if (deliverable.equals("A") && sports.equals("A") && outreach.equals("B"))
		{
			rate = "B";
			}
		else if (deliverable.equals("A") && sports.equals("B") && outreach.equals("A"))
		{
			rate = "B";
			}
		else if (deliverable.equals("A") && sports.equals("B") && outreach.equals("B"))
		{
			rate = "B";
			}
		else if (deliverable.equals("B") && sports.equals("B") && outreach.equals("B"))
		{
			rate = "B";
			}
		else 
		{
			rate = "C";
			}
		return rate;
	}
	
	public static void main (String Args[])
	{
		Rating r = new Rating();
		Scanner S = new Scanner(System.in);
		System.out.println("Please Enter number of Employee who are going to be rated");
		int count = S.nextInt();
		List<String> empList = new ArrayList<String>();
		
		for (int i=0;i<count;i++)
		{
		System.out.println("Please Enter the Emp ID");
		r.emp_id = S.nextInt();
		System.out.println("Please Enter the Emp Name");
		r.emp_name = S.next();
		System.out.println("Please Enter the rating for deliverable in terms of A or B or C");
		r.setDeliverable(S.next());
		System.out.println("Please Enter the rating for Sports in terms of A or B or C");
		r.setSports(S.next());
		System.out.println("Please Enter the rating for Outreach in terms of A or B or C");
		r.setOutreach(S.next());
		r.rating(r.deliverable, r.sports, r.outreach);
		
		
		empList.add(Integer.toString((r.getEmp_id())));
		empList.add(r.getEmp_name());
		empList.add(rate);
			
		}
		System.out.println(empList);
	}
	
}
