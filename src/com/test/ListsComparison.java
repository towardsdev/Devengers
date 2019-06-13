package com.test;

import java.util.*;

public class ListsComparison {


    private static  List<String> originValue = new ArrayList<>();
    private  static List<String> newValue = new ArrayList<>();
    private  static List<String> addedValue = new ArrayList<>();
    private static List<String> modValue = new ArrayList<>();
    private static List<String> delValue = new ArrayList<>();
    private  static Map<List<String>,String> map1 = new HashMap<>();
    private  static Set<String> set = new HashSet<>(addedValue);

    private void addOriginValues(){
        originValue.add("A");
        originValue.add("B");
        originValue.add("C");

    }

    private void addNewValues(){
        newValue.add("C");
        newValue.add("E");
        newValue.add("F");
    }


    private  void comparator() {


        for (int i = 0; i < originValue.size(); i++) {

            if (!newValue.contains(originValue.get(i))) {
                delValue.add(originValue.get(i));

            } else if (newValue.contains(originValue.get(i))) {
                modValue.add(originValue.get(i));
            }
        }

        newValue.removeAll(modValue);

        System.out.println("Modified Value" + modValue);
        System.out.println("Deleted Value" + delValue);
        System.out.println("Added value " + newValue);

    }


    public static void main(String[] args){

        ListsComparison list = new ListsComparison();
        list.addOriginValues();
        list.addNewValues();
        Collections.sort(originValue);
        Collections.sort(newValue);
        list.comparator();

    



    }


}
