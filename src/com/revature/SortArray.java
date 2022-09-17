package com.revature;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {

	// Write code to sort an array of numbers.
	public void sortIntArray(int[] intArr) {
		
		Arrays.sort(intArr);
		
		for (int num : intArr) {
			System.out.print(num + " ");
		}
		
	}
	
	public void bubbleSortIntArray(int[] arr) {
		
		boolean didSwitch = false;
		
		do {
			didSwitch = false;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					didSwitch = true;
				}
			}
		} while (didSwitch);
		
		System.out.println(Arrays.toString(arr));
	}

}
