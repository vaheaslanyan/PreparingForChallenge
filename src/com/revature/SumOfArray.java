package com.revature;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {

	public void getSumOfArray() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers would you like to add?");
		int arraySize = in.nextInt();
		
		int[] arr = new int[arraySize];
		
		System.out.println("Type the numbers on each line:");
		for (int i = 0; i < arr.length; i++) {
			
			int num = in.nextInt();
			arr[i] = num;
		}
		
		int sum = Arrays.stream(arr).sum();
		
		System.out.println(sum);
		
	}
	
}
