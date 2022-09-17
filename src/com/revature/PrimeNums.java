package com.revature;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNums {

	public void getList() {
		List<Integer> primeNums = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What number would you like to go up to?");
		int limit = scanner.nextInt();
		scanner.close();
		
		for (int num = 2; num <= limit; num++) {
			
			boolean isPrime = true;
			for (int factor = 2; factor <= num/2; factor++) {
				if (num % factor == 0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) {
				primeNums.add(num);
			}
		}
		
		System.out.println(primeNums);
		System.out.println("Their sum is: " + primeNums.stream()
			.mapToInt(num -> num).sum());
	}
	
}
