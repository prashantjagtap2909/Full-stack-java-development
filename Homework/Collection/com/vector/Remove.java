package com.vector;


import java.util.Vector;

public class Remove {
	public static void main(String[] args) {
		Vector arr = new Vector();
		arr.add(20);
		arr.add(15);
		arr.add(26);
		arr.add(51);
		arr.add(9);
		arr.add(67);
		
		
		System.out.println(arr);
		System.out.println(arr.remove(2));
	}
}
