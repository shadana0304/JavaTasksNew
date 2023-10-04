package com.task8;
import java.util.Scanner;
public class Task9 {
public static void main(String[] args) {
	
	int age;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the person age" );
	 age = sc.nextInt();
	 
	 	if(age>=60) {
		System.out.println("The person is senior citizen");
	}else {
		System.out.println("The person is not senior citizen");
	}	
}
}
