package com.pratmodi.one;

public class Solution7 {

	public static void main(String[] args) {
		System.out.println(getResult(-100));
	}
	
	public static String getResult(int n) {
		String str ="";
		
		try {
			String.valueOf(n);
			str = "Good job";
			return str;
			
		} catch (Exception e) {
			e.printStackTrace();
			str = "Wrong Answer";
			return str;
		}
	}
}
