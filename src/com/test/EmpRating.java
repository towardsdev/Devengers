package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpRating {

     List<EmpRatingResult> perform ;
     String rate = null;
     static Map<String, String> finalRating = new HashMap<>();
     EmpRating() {
        perform = new ArrayList<>();
    }

    public  void addResults(){
        perform.add(new EmpRatingResult("Kassim","A","A","A"));
        perform.add(new EmpRatingResult("Tom","C","C","C"));
        perform.add(new EmpRatingResult("Kat","A","B","C"));
    }

    public Map  calPerformance(){

        for (EmpRatingResult empRateResult : perform){
            if("A".equalsIgnoreCase(empRateResult.deliverable) && "A".equalsIgnoreCase(empRateResult.outReach) && "A".equalsIgnoreCase(empRateResult.sports)) {
                rate = "A";
                finalRating.put(empRateResult.getEmpName(),rate);

            }

            else if("C".equalsIgnoreCase(empRateResult.deliverable) && "C".equalsIgnoreCase(empRateResult.outReach) && "C".equalsIgnoreCase(empRateResult.sports)){
                rate = "C";
                finalRating.put(empRateResult.getEmpName(),rate);

            }

            else{
                rate = "B";
                finalRating.put(empRateResult.getEmpName(),rate);

            }

        }

        return finalRating;
    }

   /* public static void main(String[] args){

        EmpRating empRate = new EmpRating();
        empRate.addResults();
        empRate.calPerformance();

        for(Map.Entry<String, String> e : finalRating.entrySet()){
            System.out.println("Employee Name "+e.getKey()+" Rating "+e.getValue() );

        }
    }*/

}
