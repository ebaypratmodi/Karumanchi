package com.pratmodi.one;

import java.util.Scanner;

public class Solution2 {

	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 String s1=sc.next();
         int x=sc.nextInt();
         sc.nextLine();
         getResult(s1, x);
         sc.close();
 }
	public static void getResult(String s1, int x) {
		
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            System.out.printf("%-15s", s1);
           	if(x>999)
           		return;
            if(x>99&&x<1000)
           		System.out.printf("%d%n",x);
           	else if(x>=0&&x<100)
            System.out.printf("%03d%n",x);
        }
        System.out.println("================================");
	}
}
