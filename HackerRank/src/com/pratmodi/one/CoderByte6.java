package com.pratmodi.one;

import java.util.Scanner;

public class CoderByte6 {

	public static String QuestionMarks(String str) {
		char[] s = str.toCharArray();
		int counter = 0;
		int digiCounter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(s[i])&&s[i]<s.length) {
					if (i < str.length()&&s[i] == '?') {
						counter++;
						if (i+1 < str.length()&&s[i + 1] == '?') {
							counter++;
							if (i+2 < str.length()&&s[i + 2] == '?') {
								counter++;
							}
						}
					}
					digiCounter++;
				}
			if (i + 3 < str.length()) {
				if (Character.isDigit(s[i + 4])) {
					System.out.println(s[i + 4]);
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
		return "false";
	}

	public static void main(String[] args) {

		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(QuestionMarks(s.nextLine()));

	}


}
