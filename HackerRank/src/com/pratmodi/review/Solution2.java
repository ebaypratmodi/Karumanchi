package com.pratmodi.review;

public class Solution2 {

	public static void main(String[] args) {

		int[][] array2 = new int[10][10];

		
		for(int i=0;i<array2.length;i++) {
			for(int j=0;j<array2[i].length;j++) {
				array2[i][j] = i*j;
			}
		}
		
		for(int i=0;i<array2.length;i++) {
			for(int j=0;j<array2[i].length;j++) {
				System.out.print(array2[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
