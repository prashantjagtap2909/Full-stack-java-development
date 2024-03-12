package com.homework;
import java.util.ArrayList;
public class Data {
	
	ArrayList<Employee> setDataOfEmployee(){
		Employee e1 = new Employee();
		e1.setName("Kiran");
		e1.setLoc("Mumbai");
		e1.setSalary(49000);
		e1.setDOJ(2020);
		
		Employee e2 = new Employee();
		e2.setName("Rohan");
		e2.setLoc("Pune");
		e2.setSalary(77000);
		e2.setDOJ(2019);
		
		Employee e3 = new Employee();
		e3.setName("Raju");
		e3.setLoc("Mumbai");
		e3.setSalary(66000);
		e3.setDOJ(2020);
		
		Employee e4 = new Employee();
		e4.setName("Raj");
		e4.setLoc("Hydrabad");
		e4.setSalary(69000);
		e4.setDOJ(2022);
		
		Employee e5 = new Employee();
		e5.setName("Karan");
		e5.setLoc("Pune");
		e5.setSalary(48000);
		e5.setDOJ(2021);
		
		
		ArrayList<Employee> alemp = new ArrayList<>();
			alemp.add(e1);
			alemp.add(e2);
			alemp.add(e3);
			alemp.add(e4);
			alemp.add(e5);
			
			// System.out.println(alemp);
			
			// System.out.println("********************************");
			
			for(Employee employee : alemp) {
			//	System.out.println(employee);
			}
		return alemp;
	}
	
	public static void main(String[] args) {
		Data d = new Data();
		d.setDataOfEmployee();
	}
	
	
	
	
	
	
}
