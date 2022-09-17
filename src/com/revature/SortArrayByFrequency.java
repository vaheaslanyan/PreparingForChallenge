package com.revature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortArrayByFrequency {
	
	// Write code to sort an array so it's ordered in 
	// increasing order by how many times an integer occurs.
	public void sortArray(int[] arr) {
		
		List<Integer> numList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> countList = new ArrayList<>(); 
		List<Integer> outputList = new ArrayList<>();
		
		// Adding values and their count into the map
		for (int i : numList) {	
			int count = map.getOrDefault(i, 0);
			map.put(i, count + 1);			
		}
		
		// Adding counts to countList
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			Integer countValue = entry.getValue();
			countList.add(countValue);
		}
		
		// Sorting countList
		Collections.sort(countList);
		
		// For every count add the value same amount of times as count to outputList, only if not already present 
		for (Integer count : countList) {
			for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
				if (entry.getValue() == count) {
					
					if (!outputList.contains(entry.getKey())) {
						for (int i = 0; i < count; i++) {
							outputList.add(entry.getKey());	
						}	
					}
				}
			}
		}
		
		System.out.println(outputList);
	}
	
}
