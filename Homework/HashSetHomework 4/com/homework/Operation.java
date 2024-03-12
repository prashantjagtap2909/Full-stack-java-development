package com.homework;
import java.util.HashSet;


public class Operation {

	
	HashSet<Employee> oprt() {
		Data d = new Data();
		HashSet<Employee> data = d.setDataOfEmployee();
		HashSet<Employee> temp = new HashSet<>();
		
		for(Employee employee : data) {
			// System.out.println(employee);
			
			if((Constants.DOJ) == (employee.getDOJ())) {
				temp.add(employee);
			}
		}
		return temp;
	}
	
	
}
