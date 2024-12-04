package com.string;

public class Charat {

	public static void main(String[] args) {
		String city = "realmadrid  fcb";

		char vvvv = city.charAt(5);

		System.out.println(vvvv);

		char v = city.charAt(7);

		System.out.println(v);

		char vvv = city.charAt(3);

		System.out.println(vvv);

		char vv = city.charAt(3);

		System.out.println(vv);
		
		int b=city.indexOf(vv);
		
		System.out.println(b);
		
		String yy=city.substring(b, b);
		
		System.out.println(yy);

	}

}
