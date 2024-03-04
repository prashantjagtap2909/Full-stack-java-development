package com.task2;

import java.util.Scanner;

public class EvenSum {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number ");
		int number1 = sc.nextInt();
		System.out.println("Enter the second number ");
		int number2 = sc.nextInt();
		
		if(number1 %2 == 0 &&  number2 % 2 == 0) {
			System.out.println("The sum of two even number is "+ (number1 + number2));
		}
		else {
			System.out.println("The two numbers is not even ");
		}
		
		
	}
}
