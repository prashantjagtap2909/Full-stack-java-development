package com.task2;
import java.util.Scanner;

public class EvenNo {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int number = sc.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("The given number is even");
		}
		
		
		
	}
}
