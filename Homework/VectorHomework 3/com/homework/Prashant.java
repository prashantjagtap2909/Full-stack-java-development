package com.homework;

import java.util.Vector;

public class Prashant {
	
	void prash(){
		Operation op = new Operation();
		Vector<Employee> dd =  op.oprt();
		
		
		for(Employee employee : dd){
			System.out.println(employee);
			
			}
		}
	
	
	public static void main(String[] args) {
		Prashant jp = new Prashant();
		jp.prash();
	
}



	
	
	
		
	
	
}
