package com.homework;

import java.util.LinkedList;

public class Prashant {
	
	void prash(){
		Operation op = new Operation();
		LinkedList<Employee> dd =  op.oprt();
		
		
		for(Employee employee : dd){
			System.out.println(employee);
			
			}
		}
	
	
	public static void main(String[] args) {
		Prashant jp = new Prashant();
		jp.prash();
	
}



	
	
	
		
	
	
}
