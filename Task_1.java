package com.task9;
public class Task_1 {
           public static void main(String[] args) {
			
        	   int num = 121;
        	   int rev = 0;
        	   int temp = num;
          	while(num>0) {
        		int r =num%10;
        		rev=rev*10+r;
        		num=num/10;
        	} 		 
        		 if(temp==rev) {
            		 
            		 System.out.println("The number is palindrom");
            	 }else {
            		 
            		 System.out.println("The number is not palindrom");
            	 }
        		         	 }
		}

