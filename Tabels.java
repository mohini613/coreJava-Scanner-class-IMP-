

	package com.scanner;
	import java.util.Scanner;

	public class Tabels {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int num;

	        do {
	            System.out.print("Enter a number (0 to exit): ");
	            num = scanner.nextInt();

	            if (num != 0) {
	                System.out.println("Multiplication table of " + num + ":");
	                printTable(num);
	            }
	        } while (num != 0);

	        System.out.println("Exiting...");
	        scanner.close();
	    }

	    public static void printTable(int num) {
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(num + " x " + i + " = " + (num * i));
	        }
	    }
	}
