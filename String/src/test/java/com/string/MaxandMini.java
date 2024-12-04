package com.string;

import java.util.Arrays;

public class MaxandMini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr= {90,54,78,98,321,98076,67};
		
		
		//minimum value element
		int min=Arrays.stream(arr).min().getAsInt();
		
		System.out.println(min);
		
		
		
		int maximum=Arrays.stream(arr).max().getAsInt();
		
		System.out.println(maximum);

	}

}
