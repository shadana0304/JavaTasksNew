package com.task8;
import java.util.Scanner;
public class Task1 {
	
	        public static void main(String[] args) {
				int a;
	        	int b;
	        	int c;
	        	int d;
	        Scanner sc = new Scanner(System.in);
	        	
	        	System.out.println("Enter the value for a");
	        	a =sc.nextInt();
	        	System.out.println("Enter the value for b");
	        	b =sc.nextInt();
	        	System.out.println("Enter the value for c");
	        	c =sc.nextInt();
	        	System.out.println("Enter the value for d");
	        	d =sc.nextInt();
	        	
	       System.out.println(a+b);
	       System.out.println(c+d);
	       
	       if(a+b>c+d) {
	    	   
	    	 System.out.println("a+b is greater");  
	       }else {
	    	   
	    	   System.out.println("c+d is greater");
	       }
	       
		}
}
