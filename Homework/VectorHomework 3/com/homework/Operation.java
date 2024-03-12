package com.homework;
import java.util.Vector;


public class Operation {

	
	Vector<Employee> oprt() {
		Data d = new Data();
		Vector<Employee> data = d.setDataOfEmployee();
		Vector<Employee> temp = new Vector<>();
		
		for(Employee employee : data) {
			// System.out.println(employee);
			
			if((Constants.salary) <= (employee.getSalary())) {
				temp.add(employee);
			}
		}
		return temp;
	}
	
	
}
