package com.pratmodi.one;

import java.util.Scanner;

public class ElseIf {

    private static final Scanner scanner = new Scanner(System.in);

	
	public static void main(String[] args) {

//		int N = scanner.nextInt();	
		
		System.out.println(getResult(18));
		scanner.close();
	}

	public static String getResult(int N) {
		 String str ="";
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//	        if(N%2!=0) {
//	        str = "Weird";
//	        }
//	        else if((N%2==0)  && (N>=2)||(N<=5)) {    
//	        str = "Not Weird";
//	        }
//	        else if((N%2==0)  && (N>=6)||(N<=20)) {    
//	        str = "Weird";
//	        }
//	        else if(N%2==0 && N>20) {    
//	        str = "Not Weird";
//	        }
	        
	        if(N%2==0){
	            if((N>=2)&&(N<=5))    
	            	str = "Not Weird";
	        else if((N>=6)&&(N<=20))    
	        	str = "Weird";   
	        else if(N>20)    
	        	str = "Not Weird"; 
	        }else if(N%2!=0){
	            System.out.println("Weird");
	        }
	        
	        return str;
	}
	
}
