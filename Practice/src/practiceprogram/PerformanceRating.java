package src.practiceprogram;

import src.mainProgram.EmployeRating;

public class PerformanceRating {

	private String deliverable = null;
	private String sports = null;
	private String outreach = null;
	int ratingAScore = 5;
	int ratingBScore = 3;
	int ratingCScore = 2;
	int sumofratingscore = 0;
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
				sumofratingscore = sumofratingscore + ratingAScore;
			}
			if (String.valueOf(ch[i]).equalsIgnoreCase("B")) {
				sumofratingscore = sumofratingscore + ratingBScore;
			}
			if (String.valueOf(ch[i]).equalsIgnoreCase("C")) {
				sumofratingscore = sumofratingscore + ratingCScore;
			}
		}

		if (sumofratingscore >= 12) {
			rating = "1st";
		}
		if (sumofratingscore <= 11 && sumofratingscore >= 8) {
			rating = "2nd";
		}
		if (sumofratingscore <= 7) {
			rating = "3rd";
		}

		return "Rating of the Employee " + EmployeRating.name + " " + rating;

	}

}
