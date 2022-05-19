package com.basicOOPS;

public class VowelAndConsonant {
	public static void main(String[] args) {
	
		VowelAndConsonant check = new VowelAndConsonant();  // Creating new object it will store in heap
		check.charCheck('a');
		check.charCheck('B');
		check.charCheck('#');
	}
	
	 void charCheck(char ch) {
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
			
			System.out.println("Vowel");
		}
		else if(ch =='B' || ch == 'C' || ch == 'D' || ch == 'F' || ch == 'G' || ch == 'H' || ch == 'J' || ch == 'K' ||ch == 'L' || ch == 'M' || ch == 'N' || ch == 'P' || ch == 'Q' || ch == 'R' || ch == 'S' || ch == 'T' || ch == 'V' || ch == 'W' || ch == 'X' || ch == 'Y' || ch == 'Z' ) {
			
			System.out.println("Consonant");
		}
		else {
			
			System.out.println("Invalid");
		}
	}
}
