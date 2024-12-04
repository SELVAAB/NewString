package com.string;

public class Reader {

	public static void main(String[] args) {
		
		
		String te="sergio busquets";
		
		char search='u';
		int count=0;
		
		for(int i=0;i<te.length();i++) {
			
			if(search == te.charAt(i))
				count++;
			
			//System.out.println("count of"+search+"is"+ count);
			char n=te.charAt(i);
			System.out.println(n);
			System.out.println("count of"+search+"is"+ count);
			
		}

		
		
	}

}
