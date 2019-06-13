package com.test;

public class EmpRatingResult {



     String empName;
     String deliverable;
     String sports;
     String outReach;

    public EmpRatingResult(String empName,String deliverable, String sports, String outReach) {
        this.empName = empName;
        this.deliverable = deliverable;
        this.sports = sports;
        this.outReach = outReach;
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

    public String getOutReach() {
        return outReach;
    }

    public void setOutReach(String outReach) {
        this.outReach = outReach;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
