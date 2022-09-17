package com.revature;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

	public void getFibonacci() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("How many fibonacci numbers would you like?");
		int input = in.nextInt();
		in.close();
		
		if (input < 2) {
			System.out.println(0);
			return;
		}
		
		int[] sequence = new int[input];
		
		sequence[0] = 0;
		sequence[1] = 1;
		
		for (int i = 2; i < input; i++) {
			sequence[i] = sequence[i - 1] + sequence[i - 2];
		}
		
		System.out.println(Arrays.toString(sequence));
	}
	
	public void getFibonacciNoArray() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many fib numbers would you like?");
		int count = scanner.nextInt();
		scanner.close();
		
		int a = 0;
		int b = 1;
		
		System.out.print(a + ", ");
		
		if (count < 2) {
			return;
		}
		
		System.out.print(b + ", ");
		
		for (int i = 2; i < count; i++) {
			int c = a + b;
			System.out.print(c + ", ");
			a = b;
			b = c;
		}
	}
	
}
