package com.pratmodi.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 *
 *  5
	5 41 77 74 22 44
	1 12
	4 37 34 36 52
	0
	3 20 22 33
	5
	1 3
	3 4
	3 1
	4 3
	5 5
 * 
 * */


public class Solution9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<ArrayList<Integer>> listOfList = new ArrayList<ArrayList<Integer>>();		
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			int d = sc.nextInt();
			for(int j=0;j<d;j++) {
				int dx = sc.nextInt();
				list.add(dx);
			}
			listOfList.add(list);
		}
		int q = sc.nextInt();
		for(int i=0;i<q;i++) {
			int q1 = sc.nextInt();
			int q2 = sc.nextInt();
			try {
				int v = listOfList.get(q1-1).get(q2-1);
				System.out.println(v);
			} catch (Exception e) {
				System.out.println("ERROR!");
			}
		}
	}

}
