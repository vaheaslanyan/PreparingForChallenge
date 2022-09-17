package com.revature;

public class SwitchVarsWihoutTemp {

	// Write a program to swap two variables without
	// using a temp variable.
	public void switchVars(int x, int y) {
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("x is now: " + x);
		System.out.println("y is now: " + y);
	}
	
}
