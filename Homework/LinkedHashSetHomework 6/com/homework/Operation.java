package com.homework;
import java.util.LinkedHashSet;


public class Operation {

	
	LinkedHashSet<Employee> oprt() {
		Data d = new Data();
		LinkedHashSet<Employee> data = d.setDataOfEmployee();
		LinkedHashSet<Employee> temp = new LinkedHashSet<>();
		
		for(Employee employee : data) {
			// System.out.println(employee);
			
			if((Constants.loc).equals(employee.getLoc())) {
				temp.add(employee);
			}
		}
		return temp;
	}
	
	
}
