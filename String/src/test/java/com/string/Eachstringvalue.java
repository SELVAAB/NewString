package com.string;

public class Eachstringvalue {

	public static void main(String[] args) {
		
		
		
		String name="uruguayxxx";
		
		char search='x';
		
		char search1='u';
		
		char search2='r';
		
		char search3='r';
		
		char search4='r';
		
		int count=0;
		
		for(int i=0;i<name.length();i++) {
			
			if(search == name.charAt(i))
				count++;
			 char a=name.charAt(i);
				
				System.out.println(a);
				
			System.out.println("count of"+search+"is"+ count);
			
			System.out.println("count of"+search1+"is"+ count);
			
			System.out.println("count of"+search2+"is"+ count);
			
			System.out.println("count of"+search3+"is"+ count);
			
			System.out.println("count of"+search4+"is"+ count);
			
			 
			
		}
		
		for(char c:name.toCharArray()) {
			
			System.out.println(c);
		}

	}

}
