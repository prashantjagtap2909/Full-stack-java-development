package com.homework;
import java.util.LinkedList;

public class Employee {

	private int salary;
	private int DOJ;
	private String name;
	private String loc;
	
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDOJ() {
		return DOJ;
	}
	public void setDOJ(int dOJ) {
		DOJ = dOJ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", DOJ=" + DOJ + ", name=" + name + ", loc=" + loc + "]";
	}
	
	
}
