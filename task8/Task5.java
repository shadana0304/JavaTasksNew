package com.task8;
import java.util.Scanner;

public class Task5 {
	public static void main(String arg[]) {	
		int count=0;
   	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number ");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
	   if(n%i==0)
	   {
	        count++;
	   }
	}
	if(count==2)
	       System.out.println("prime number ");
	else
	System.out.println("Not a prime number ");	        
	}
}


