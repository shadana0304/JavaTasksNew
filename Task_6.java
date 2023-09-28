package com.task9;
import java.util.Scanner;

public class Task_6 {
        public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
    		System.out.println("Enter Month number :");
    		int monthno = sc.nextInt();
    		System.out.println("Enter  rent per day :");
    		int rentperday = sc.nextInt();
    		System.out.println("Enter number of days :");
    		int days = sc.nextInt();
    		double totalrent = 0;
    		switch (monthno) {
    		case 1:
    			System.out.println(" January");
    			break;
    		case 2:
    			System.out.println(" Febraury");
    			break;
    		case 3:
    			System.out.println(" March");
    			break;
    		case 4:
    			System.out.println(" April");
    			break;
    		case 5:
    			System.out.println(" May");
    			break;
    		case 6:
    			System.out.println("June");
    			break;
    		case 7:
    			System.out.println(" July");
    			break;
    		case 8:
    			System.out.println(" August");
    			break;
    		case 9:
    			System.out.println("September");
    			break;
    		case 10:
    			System.out.println(" October");
    			break;
    		case 11:
    			System.out.println(" November");
    			break;
    		case 12:
    			System.out.println("December");
    			break;
    		}

    		if (monthno == 4 || monthno == 5 || monthno == 6 || monthno == 10 || monthno == 11 || monthno == 12) {
    			totalrent = (rentperday * days) + ((20 * rentperday) / 100) * days;
    		} else {
    			totalrent = rentperday * days;
    		}
    		System.out.printf("%.2f",totalrent);
    			
           			
    			
}
        }   		
    		
 		
    		
    		
    		
    		
    		