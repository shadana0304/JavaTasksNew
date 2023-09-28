package com.task9;
import java.util.Scanner;
public class Task_5 {
             public static void main(String[] args) {
            	 
            	    Scanner sc = new Scanner(System.in);
            	 
            	    System.out.print("Enter Marks ");
            	    int mark = sc.nextInt();
            	 
            	    if (mark > 100){
            	     System.out.print("Invalid Input");
            	    }
            	    else if (mark==100)
            	    {
            	      System.out.print("Grade S");
            	    }
            	    else if(mark >= 90 && mark<= 99) 
            	    {
            	      System.out.print("Grade A");
            	    }
            	    else if (mark >= 80 && mark<= 89)
            	    {
            	      System.out.print("Grade B");
            	    }
            	    else if(mark>70 && mark <=79)
            	    {
            	      System.out.print("Grade C");
            	    }else if(mark>60 && mark <=69)
            	    {
            	      System.out.print("Grade D");
            	    }
            	    else if(mark>50 && mark <=59)
            	    {
            	      System.out.print("Grade E");
            	    }else if(mark<50) 
            	    {
            	      System.out.print("Grade F");
            	    }
			}
}
