package com.pratmodi.one;

import java.util.Scanner;

public class CoderByte3 {

	public static String QuestionMarks(String str) {
		String[] s = str.split("");
		int a1=0,a2=0;
		for (int i = 0; i < s.length; i++) {
			int count = 0;
			if (s[i].equalsIgnoreCase("?")) {
				count++;
				// System.out.println("value "+s[i-1]+","+s[i+1]+","+s[i+2]+","+s[i+3]);
				if (i - 1 < 0 || i + 1 > s.length || i + 2 > s.length || i + 3 > s.length) {
					return "false";
				}
				if (s[i + 1].equalsIgnoreCase("?"))
					count++;
				if (s[i + 2].equalsIgnoreCase("?")) {
					
					try {
						a1=Integer.parseInt(s[i-1]);
						if(Integer.valueOf(s[i+2])<s.length) {
						a2=Integer.parseInt(s[i+2]);
						}
					}catch (Exception e) {
						e.printStackTrace();
					}	
					count++;
				}
				else {
					return "false";
				}
					
				
				
				if (count == 3) {
					int sum=a1+a2;
					System.out.println("SUM: "+sum);
					if(sum==10)
					return "true";
					else
						return "false";
				} else {
					return "false";
				}
			}
		}
		return "false";
	}

	public static void main(String[] args) {

		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(QuestionMarks(s.nextLine()));

	}

}