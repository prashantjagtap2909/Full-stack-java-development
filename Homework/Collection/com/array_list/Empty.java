package com.array_list;

import java.util.ArrayList;

public class Empty {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(20);
		arr.add(15);
		arr.add(26);
		arr.add(51);
		arr.add(9);
		arr.add(67);
		
		System.out.println(arr);
		System.out.println(arr.isEmpty());
	}
}
