package com.task8;
import java.util.Scanner;

public class Task4 {
             public static void main(String[] args) {
				
            	 int a;
            	 int b;
             Scanner sc = new Scanner(System.in);
             
            System.out.println("Enter the value for a");
            a = sc.nextInt();
            System.out.println("Enter the value for b");
            b = sc.nextInt();
           
            System.out.println("Before swapping a "+a);
            System.out.println("Before swapping b "+b);
            int swap = a;
                  a=b;
                  b=swap;
             System.out.println("After swapping a "+a);     
             System.out.println("After swapping b "+b);   		  
            				
			}
}
