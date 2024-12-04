package com.string;

import java.util.ArrayList;

public class SString {

	public static void main(String[] args) {
		
		ArrayList<String>al=new ArrayList<String>();
		
		al.add("italy");
		
		al.add("argentina");
		
		al.add("england");
		
		al.add("germany");
		
		al.add("eqcuador");
		
		al.add("france");
		
		al.add("colombia");
		
		al.add(1,"for");
		
		System.out.println(al);
		
		String bbb=al.get(4);
		
		System.out.println(bbb);

	}

}
