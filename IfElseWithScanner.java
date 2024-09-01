package com.scanner;
import java.util.Scanner;
public class IfElseWithScanner {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int n = scanner.nextInt();

	        if (n > 0) {
	            System.out.println("Number is positive");
	            if (n % 2 == 0) {
	                System.out.println("Number is even");
	            } else {
	                System.out.println("Number is odd");
	            }
	        } else if (n < 0) {
	            System.out.println("Number is negative");
	        } else {
	            System.out.println("Number is zero");
	        }

	     //   scanner.close();
	    }
	}


