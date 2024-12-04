package com.string;

public class Vowels {

	public static void main(String[] args) {
		
		
		String name="champions league rmaxbvb";
		
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			
			if (isVowel(ch)) {
				System.out.println(ch+"");
			}
			
			
			
			
			
			
			
			
		}

	}

	// Function to check if a characteris a vowel
	
	private static boolean isVowel(char ch) {
		
		
		ch = java.lang.Character.toLowerCase(ch);
		
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}

}
