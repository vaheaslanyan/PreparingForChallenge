package com.revature;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Palindrome {

	public void isPalindromeUsingStack(String str) {
		String cleanedStr = str.replaceAll("[^A-Za-z]", "").toLowerCase();
		LinkedList<Character> halfStack = new LinkedList<>();

		int i = 0;

		for (char c : cleanedStr.toCharArray()) {
			if (cleanedStr.length() % 2 != 0 && i == cleanedStr.length() / 2) {
				i++;
				continue;
			}
			if (i < cleanedStr.length() / 2) {
				halfStack.push(c);
			} else if (halfStack.isEmpty() || halfStack.pop() != c) {
				System.out.println("String is NOT palindrome!");
				return;
			}
			i++;
		}

		System.out.println("String IS palindrome!");

	}
	
	// Not using StringBuilder
	public boolean isStringPalindrome(String str) {
		
		String reversedString = "";
		
		for (int i = 0; i < str.length(); i++) {
			
			char charToAdd = str.charAt(i);
			
			reversedString = charToAdd + reversedString; 
			
		}
		
		if (str.equals(reversedString)) {
			System.out.println("String is Palindrome");
			return true;
		} else {
			System.out.println("String is not a palindrome");
			return false;
		}
	}
	
	// Using StringBuilder
	public boolean isStringPalindromeUsingStringBuilder(String str) {
		
		StringBuilder reverseBuilder = new StringBuilder(str).reverse();
		String reverseString = reverseBuilder.toString();
		
		if (str.equals(reverseString)) {
			System.out.println("String is palidrome!");
			return true;
		} else {
			System.out.println("String is not palidrome!");
			return false;
		}
		
	}
	
//	public boolean isListPalindrome(LinkedList list) {
//		
//		LinkedList reverseList = Collections.reverse(list);
//		
//	}

	public void checkInputForPalindrome() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Type string to check if palindrome:");
		String str = in.next();
		
		String reversedStr = "";
		
		for (int i = 0; i < str.length(); i++) {
			
			char charToAdd = str.charAt(i);
			reversedStr = charToAdd + reversedStr;
		}
		
		if (str.equals(reversedStr)) {
			System.out.println("String is palindrome!");
		} else {
			System.out.println("String is not a palindrome!");
		}
		
	}
	
	public void checkInputForPalindromeWithStringBuilder() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Type text to check if palindrome:");
		String str = in.next();
		
		StringBuilder reverseBuilder = new StringBuilder(str);
		String reverseStr = reverseBuilder.reverse().toString();
		
		if (str.equals(reverseStr)) {
			System.out.println("String is palidrome!");
		} else {
			System.out.println("String is not palindrome!");
		}
		
	}
	
	public void isIntPalindrome(int x) {
		
		int num = x;
		int reverse = 0;
        
		while (num > 0) {
		    int remainder = num % 10;
		    reverse = reverse * 10 + remainder;
		    num /= 10;
		}
		
		if (reverse == x) {
		    System.out.println("Number IS palindrome");
		} else {
		    System.out.println("Number is NOT palindrome");
		}
	}
}
