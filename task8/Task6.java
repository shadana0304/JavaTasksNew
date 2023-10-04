package com.task8;
import java.util.Scanner;

public class Task6 {
        public static void main(String[] args) {
               	int a;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the value");
             a = sc.nextInt();
             
             int fact = 1;
             for(int i=1; i<=a; i++){
             fact = fact*i;
             }
         System.out.println(fact);
                    }
     		}

