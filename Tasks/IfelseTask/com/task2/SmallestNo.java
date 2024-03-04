package com.task2;

import java.util.Scanner;

public class SmallestNo {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number ");
		int number1 = sc.nextInt();
		System.out.println("Enter the second number ");
		int number2 = sc.nextInt();
		
		if(number1 > number2) {
			System.out.println("The smallest number is "+ number2);
		}
		else {
			System.out.println("The smallest number is "+ number1);
		}
		
		
	}
}
