package com.revature;

import java.util.Scanner;

//2. Write pseudocode to calculate the sum of 2 numbers.

public class SumOfTwoNumbers {

	public int sum(int a, int b) {
		return a + b;
	}
	
	public void sumOfTwoInts() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Type two numbers on each line to get their sum:");
		int a = in.nextInt();
		int b = in.nextInt();
		in.close();
		
		System.out.println(a + b);
		
	}
	
}
