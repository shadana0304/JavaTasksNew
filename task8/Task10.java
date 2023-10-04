package com.task8;
import java.util.Scanner;

public class Task10 {
     public static void main(String[] args) {
		int a;
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		a=sc.nextInt();
	   while(a>0) {
		   count++;
		   a=a/10;
	   }
	    	 System.out.println(count);
	     }
	}

