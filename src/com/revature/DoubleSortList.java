package com.revature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleSortList {

	public static List<String> strList = new ArrayList<>();
	
	public DoubleSortList() {
		super();
		strList.add("Hello");
		strList.add("Anounce");
		strList.add("World");
		strList.add("Cup");
		strList.add("Zebra");
		strList.add("Hi");
		System.out.println(strList);
	}

	public void doubleSort( ) {
		
		// Sorting alphabetically
		Collections.sort(strList);
		
		// Sorting by length
		List<String> sortedList = strList.stream()
				.sorted(Comparator.comparingInt(str -> str.length()))
				.collect(Collectors.toList());
		
	}
	
	public void doubleBubbleSort() {
		
		boolean didSwap = false;
		
		// Sorting alphabetically
		do {
			didSwap = false;
			for (int i = 0; i < strList.size() - 1; i++) {
				if (strList.get(i).compareTo(strList.get(i + 1)) > 0) {
					String temp = strList.get(i);
					strList.set(i, strList.get(i + 1));
					strList.set(i + 1, temp);
					didSwap = true;
				}
			}	
		} while (didSwap);
		
		// Sorting by length
		do {
			didSwap = false;
			for (int i = 0; i < strList.size() - 1; i++) {
				if (strList.get(i).length() > strList.get(i + 1).length()) {
					String temp = strList.get(i);
					strList.set(i, strList.get(i + 1));
					strList.set(i + 1, temp);
					didSwap = true;
				}
			}	
		} while (didSwap);
	}
	
}
