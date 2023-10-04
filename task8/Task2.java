package com.task8;
import java.util.Scanner;

public class Task2 {
	
        public static void main(String[] args) {
			
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        a =sc.nextInt();
        System.out.println(a);
        
         if(a%2==0) {
        	System.out.println("a is even number");
        }else {
        	System.out.println("a is odd number");
        }
		}
}
