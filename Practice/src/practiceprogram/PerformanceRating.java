package src.practiceprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import src.mainProgram.EmployeRating;

public class PerformanceRating {

	private String deliverable = null;
	private String sports = null;
	private String outreach = null;
	int ratA = 5;
	int ratB = 3;
	int ratC = 2;
	int result1 = 0;
	public String rating = null;

	public PerformanceRating(String deliverable, String outreach, String sports) {

		this.deliverable = deliverable;
		this.sports = sports;
		this.outreach = outreach;
	}

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

	public String toString() {

		String result = this.deliverable + this.outreach + this.sports;
		char[] ch = result.toCharArray();
		for (int i = 0; i < result.length(); i++) {
			if (String.valueOf(ch[i]).equalsIgnoreCase("A")) {
				result1 = result1 + ratA;
			}
			if (String.valueOf(ch[i]).equalsIgnoreCase("B")) {
				result1 = result1 + ratB;
			}
			if (String.valueOf(ch[i]).equalsIgnoreCase("C")) {
				result1 = result1 + ratC;
			}
		}

		if (result1 >= 12) {
			rating = "1st";
		}
		if (result1 <= 11 && result1 >= 8) {
			rating = "2nd";
		}
		if (result1 <= 7) {
			rating = "3rd";
		}

		System.out.println(result1);

		return "Rating of the Employee " + EmployeRating.name + " " + rating;

	}

}
