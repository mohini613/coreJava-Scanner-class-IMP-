package com.scanner;
import java.util.Scanner;

public class REVSCANNER {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int a = scanner.nextInt();

	        System.out.println("Original number: " + a);

	        int org = a;
	        int rev = 0;
	        int rem = 0;

	        while (a > 0) {
	            rem = a % 10;
	            rev = rev * 10 + rem;
	            a = a / 10;
	        }

	        System.out.println("Reverse number: " + rev);

	        scanner.close();
	    }
	}


