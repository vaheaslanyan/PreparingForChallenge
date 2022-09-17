package com.revature;

import java.util.Arrays;

//3. Write code that takes a list of integers and prints out the sum using streams.

import java.util.List;

public class StreamSumListOfInts {

	// Stream API - consists of classes, interfaces, and enum to allow functional-style operations on elements.
	// Supports internal iteration, i.e. no need for client program to handle the algorithm to iterate over a list (external iteration)
	// It is used to process collections of objects.
	// It is not a data source, instead it takes input from Collections, Arrays, or I/O objects.
	// It does not change the original data structure, instead it provides a result.
	// Operations are lazily executed and can be pipelined. Terminal operations return the result.
	// More on Streams API: https://www.w3schools.blog/java-8-stream-api-tutorial-with-examples ; https://www.baeldung.com/java-stream-sum ; https://www.geeksforgeeks.org/stream-in-java/
	
	List<Integer> integerList = Arrays.asList(1, 3, 7, 9, 7);
	
	public void sumFromList(List<Integer> list) {
		
		Integer sum = list.stream().mapToInt(num -> num.intValue()).sum();
		
		System.out.println(sum);
	}
	
}
