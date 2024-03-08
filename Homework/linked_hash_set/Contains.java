package com.linked_hash_set;


import java.util.LinkedHashSet;

public class Contains {

	public static void main(String[] args) {
		LinkedHashSet arr = new LinkedHashSet();
		arr.add(20);
		arr.add(15);
		arr.add(26);
		arr.add(51);
		arr.add(9);
		arr.add(67);
		
		System.out.println(arr);
		System.out.println(arr.contains(51));
	}
}
