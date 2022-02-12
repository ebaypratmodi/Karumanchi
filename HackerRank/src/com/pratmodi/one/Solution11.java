package com.pratmodi.one;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Solution11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
//		int L = sc.nextInt();
		List<Integer> L = new ArrayList<Integer>();
		for(int i=0;i<N;i++) {
			int var = sc.nextInt();
			L.add(var);
		}
		int Q = sc.nextInt();
		
		for(int j=0;j<2*Q;j++) {
			String s = sc.nextLine();
			
			if(s.equalsIgnoreCase("Insert")) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				L.add(x, y);
			}else if(s.equalsIgnoreCase("Delete")) {
				int x = sc.nextInt();
				L.remove(x);
			}
		}
		Iterator i = L.listIterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");	
		}
		
		sc.close();
	}

}
