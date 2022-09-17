package com.revature;

import java.util.Objects;

//Write .equals() and hashcode() methods and explain what they do.

public class HashcodeEquals {
	
//	equals() will check for equality of the reference in memory, however we can override implementation 
//	of these methods in our class to make sure we identify duplicates correctly. 
//	This is very useful to avoid duplicates in Collections since Map will check for duplicates before “putting” them in the collection. 
//	Below is an example how we are assigning hashCode from id var in Student class and checking for equality in equals() method.
	
	String id;
	String name;
	
	public HashcodeEquals(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return this.id.hashCode();
		//return Objects.hash(id, name); we are replacing this default with hash of id, to check duplicates based on ID
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof HashcodeEquals) {
			if (obj.hashCode() == this.hashCode()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		HashcodeEquals other = (HashcodeEquals) obj;
//		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	
}
