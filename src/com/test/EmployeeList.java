

package com.test ;


import com.test.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeList {
    private static List<Employee> empList = new ArrayList<>();
    private static void addEmployee(){

        EmployeeList.empList.add(new Employee(1,"Kassim","SA"));
        EmployeeList.empList.add(new Employee(2,"Arun","A"));
        EmployeeList.empList.add(new Employee(3,"Thilak","SA"));
        EmployeeList.empList.add(new Employee(4,"Vinoth","A"));
    }


    private static Map<Integer,Employee> map = new HashMap<>();

    private static void addListtoMap() {
        for (Employee emp1 : empList) {
            map.put(emp1.getEmpId(), emp1);
            System.out.println("Key---"+emp1.getEmpId()+ "---Value "+ emp1.getEmpName()+"-"+emp1.getEmpDesignation());
        }


    }


    public static void main(String[] args){
        addEmployee();
        addListtoMap();

    }
}