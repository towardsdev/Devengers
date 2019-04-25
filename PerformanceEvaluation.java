package com.pack.sample;

public class PerformanceEvaluation {
//Write a program to put rating for an employee based on his performance in deliverable, sports and outreach. If he is A, A and A in all 3 then give 1st. Likewise.
	private String employeeName;
	private int deliverables;
	private int sports;
	private int outreach;
	
	public PerformanceEvaluation(String employeeName, int deliverables,int sports,int outreach)
	{
		this.employeeName = employeeName;
		this.deliverables = deliverables;
		this.sports = sports;
		this.outreach = outreach;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getDeliverables() {
		return deliverables;
	}
	public void setDeliverables(int deliverables) {
		this.deliverables = deliverables;
	}
	public int getSports() {
		return sports;
	}
	public void setSports(int sports) {
		this.sports = sports;
	}
	public int getOutreach() {
		return outreach;
	}
	public void setOutreach(int outreach) {
		this.outreach = outreach;
	}
	
	
}
