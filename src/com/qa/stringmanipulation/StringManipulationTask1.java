package com.qa.stringmanipulation;

public class StringManipulationTask1 {

	public static void main(String[] args) {
		
		String str1 = "today it is sunny";
		String str2 = "yesterday it was raining";
	
		System.out.println(str1.toUpperCase() + ", " + str2.toUpperCase() + ".");
		
		String substring1 = str1.substring(0, 10);
		String substring2 = str2.substring(15, 24);
		System.out.println((substring1 + substring2).toUpperCase() + ".");
		
	}
}
