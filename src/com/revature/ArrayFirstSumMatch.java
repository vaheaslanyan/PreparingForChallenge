package com.revature;


public class ArrayFirstSumMatch {

	//Write a function that defines an array parameter and a sum
	//and finds the first two values that, when added, equal that sum.
	public void findMatch(int[] arr, int sum) {
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				int thisSum = arr[i] + arr[j];
				if (thisSum == sum) {
					System.out.println("The first two values are: " 
							+ arr[i] + " and " + arr[j]);
					return;
				}	
			}	
		}
	}
	
}
