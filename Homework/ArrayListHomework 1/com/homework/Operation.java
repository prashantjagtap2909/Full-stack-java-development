package com.homework;
import java.util.ArrayList;


public class Operation {

	
	ArrayList<Employee> oprt() {
		Data d = new Data();
		ArrayList<Employee> data = d.setDataOfEmployee();
		ArrayList<Employee> temp = new ArrayList<>();
		
		for(Employee employee : data) {
			// System.out.println(employee);
			
			if((Constants.loc).equals(employee.getLoc())) {
				temp.add(employee);
			}
		}
		return temp;
	}
	
	
}
