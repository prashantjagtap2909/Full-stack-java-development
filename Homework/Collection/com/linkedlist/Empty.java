package com.linkedlist;


import java.util.LinkedList;

public class Empty {

	public static void main(String[] args) {
		LinkedList arr = new LinkedList();
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
