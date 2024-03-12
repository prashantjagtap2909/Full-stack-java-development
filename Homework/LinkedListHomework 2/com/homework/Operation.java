package com.homework;
import java.util.LinkedList;


public class Operation {

	
	LinkedList<Employee> oprt() {
		Data d = new Data();
		LinkedList<Employee> data = d.setDataOfEmployee();
		LinkedList<Employee> temp = new LinkedList<>();
		
		for(Employee employee : data) {
			// System.out.println(employee);
			
			if((Constants.DOJ)==(employee.getDOJ())) {
				temp.add(employee);
			}
		}
		return temp;
	}
	
	
}
