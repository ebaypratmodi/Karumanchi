package com.pratmodi.one;

import java.util.Scanner;

public class CoderByte4 {

	public static String QuestionMarks(String str) {
		char[] s = str.toCharArray();
		int counter = 0;
		int digiCounter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(s[i])) {
				if (s[i] < str.length()) {
					if (s[i] == '?') {
						counter++;
						if (s[i + 1] == '?') {
							counter++;
							if (s[i + 2] == '?') {
								counter++;
							}
						}
					}
					digiCounter++;
				}
			}
			if (s[i + 3] < str.length()) {
				if (Character.isDigit(s[i + 3])) {
					digiCounter++;
					if (digiCounter==2&&counter == 3) {
						return "true";
					}
				
				}
				 else {
						return "false";
					}
			}
			
			if(counter==3) {
				return "true";
			}
			else {
				return "false";
			}
			}
		return "true";
	}

	public static void main(String[] args) {

		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(QuestionMarks(s.nextLine()));

	}

}
