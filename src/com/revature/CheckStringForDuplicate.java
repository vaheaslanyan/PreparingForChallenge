package com.revature;

public class CheckStringForDuplicate {

	//Write code to check for duplicate values in a string
	public void checkString(String string) {
		
		char[] charsArr = string.toCharArray();
		
		System.out.println("Duplicate chars are: ");
		
		for (int i = 0; i < string.length(); i++) {
			for (int j = i + 1; j < string.length(); j ++) {
				if (charsArr[i] == charsArr[j]) {
					System.out.println(charsArr[j]);
				}
			}
		}

	}

}
