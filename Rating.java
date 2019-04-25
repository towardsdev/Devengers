package com.pack.sample;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class Rating {
 //3. Write a program to put rating for an employee based on his performance in deliverable, sports and outreach. If he is A, A and A in all 3 then give 1st. Likewise.
	/*all 3 crietria >8 - rating 1
	any 2 criteria >8 or all 3 criteria >6 and <=8 or any 1 criteria >8 and 1 criteria >6 - rating 2
	else - rating 3*/	
	
	
	public static void main(String[] args) {
		List<PerformanceEvaluation> EmployeeList=new ArrayList<PerformanceEvaluation>();
		EmployeeList.add(new PerformanceEvaluation("Ashok",9,9,10));
		EmployeeList.add(new PerformanceEvaluation("Bhavani",6,9,10));		
		EmployeeList.add(new PerformanceEvaluation("Chithra",7,8,7));
		EmployeeList.add(new PerformanceEvaluation("Spoorthy",6,8,10));
		EmployeeList.add(new PerformanceEvaluation("Anu",6,5,3));
		EmployeeList.add(new PerformanceEvaluation("Sowmiya",3,2,8));
		/*for(PerformanceEvaluation p:EmployeeList)
		System.out.println(p.getEmployeeName());*/
		Map<String,Integer> Rating=new LinkedHashMap<String,Integer>();
		int deliverable;
		int sports;
		int outreach;
		int rating;		
		for(PerformanceEvaluation employee:EmployeeList)
		{
			deliverable=employee.getDeliverables();
			sports=employee.getSports();
			outreach=employee.getOutreach();
			if(deliverable>8 && sports>8 && outreach>8)
			{
				rating =1;
			}
			else if(deliverable>8 && sports>8 || deliverable >8 && outreach>8||sports>8&&outreach>8)
			{
				rating =2;
			}
			else if((deliverable>6 && deliverable<9) &&(sports>6 && sports<9) && (outreach>6 && outreach<9))
			{
				rating=2;
			}
			else if((deliverable>8 || sports>8 || outreach>8) && ((deliverable>6 && deliverable<9) || (sports>6 && sports<9) || (outreach>6 && outreach<9)))
			{
				rating=2;
			}
			else
			{
				rating=3;
			}
			Rating.put(employee.getEmployeeName(), rating);
			
		}
		
		System.out.println("Map: "+Rating.toString());
		for(Map.Entry<String,Integer> entry:Rating.entrySet())
		{
			System.out.println("\nEmployee name:"+entry.getKey()+" "+"\nEmployee rating:"+entry.getValue());
		
		}
	}

}
