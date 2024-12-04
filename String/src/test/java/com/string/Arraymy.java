package com.string;

public class Arraymy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] myarray=new int[] {1,2,2,3};
		
		for(int i=0;i<4;i++) {
			System.out.println(myarray[i]);
			
			
		}
		
		
		int[] my=new int [5];
		my[3]=100;
		
		for(int j=0;j<5;j++) {
			System.out.println(my[j]);
		}
		
		
		int [][]past=new int[3][8];
		
		past[2][1]=7;
		for(int i=0;i<3;i++) {
			for(int j=0;j<8;j++) {
				System.out.println(past[i][j]);
			}
		
		}
		
		int[][][] bbb=new int[4][2][3];
		bbb[2][1][2]=1;
		for(int i=0;i<4;i++) {
			for(int k=0;k<2;k++) {
				for(int j=0;j<3;j++) {
					
				
			System.out.println(bbb[i][k][j]+"");
				}
		}
	}

}
}
