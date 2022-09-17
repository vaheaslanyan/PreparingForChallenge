package com.revature;

import java.util.Scanner;

//Write code to print "fizz" if a value is divisible by 5, "buzz" if a value is divisible by 3, and
//"fizzbuzz" if divisible by both 3 and 5. You cannot use the modulus operator.

public class RemainderWithoutModulus {
	
	public void divisabilityBy5or3(int num) {
		
		int remainderFromDivBy5 = (num - 5 * (num/5));
		int remainderFromDivBy3 = (num - 3 * (num/3));

		// Explanation with devision by 5
		int quotient = num/5; // Since Java rounds down for int divisions we will get the closest whole number result
		int product = quotient * 5; // Then we can simply multiply by the divisor to get the closest whole number to num that is by the divisor 
		int remainder = num - product; // And we get the rounded remainder here, if not 0 then it is not  by the divider
		
		System.out.println("Quotient (num/5) = " + quotient);
		System.out.println("Product (quotient * num) = " + product);
		System.out.println("Remainder (num - product) = " + remainder);
		
		System.out.println(remainderFromDivBy5);
		
		if (remainderFromDivBy5 == 0 && remainderFromDivBy3 == 0) {
			System.out.println("fizzbuzz");
		} else if (remainderFromDivBy5 == 0) {
			System.out.println("fizz");
		} else if (remainderFromDivBy3 == 0) {
			System.out.println("buzz");
		} else {
			System.out.println("NOT a fizzbuzz");
		}
		
	}
	
	public void fizzBuzzMathWay() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Type a number to check if fizzbuzz:");
		int input = in.nextInt();
		
		boolean isDivBy3 = false;
		boolean isDivBy5 = false;
		
		for (int i = 0; i < input; i++) {
			if (input - (i * 3) == 0) {
				isDivBy3 = true;
			}
			
			if (input - (i * 5) == 0) {
				isDivBy5 = true;
			}
		}
		
		if (isDivBy3 && isDivBy5) {
			System.out.println("Fizzbuzz");
		} else if (isDivBy3) {
			System.out.println("Fizz");
		} else if (isDivBy5) {
			System.out.println("Buzz");
		} else {
			System.out.println("Not s fizz nor buzz...");
		}
		
		
	}

}
