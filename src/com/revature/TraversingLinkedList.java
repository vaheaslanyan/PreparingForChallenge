package com.revature;

import java.util.Iterator;
import java.util.LinkedList;

public class TraversingLinkedList {
	

	//5. Write code to traverse a linked list.
	LinkedList<String> linkedList = new LinkedList<>();
	
	public void traverseUsingForLoop (LinkedList<String> list) {
		
		linkedList.add(null);
		
		for (String item : list) {
			System.out.println(item);
		}
		
	}
	
	public void traverseUsingIterator (LinkedList<String> list) {
		
		Iterator<String> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
