package com.scanner;
import java.util.Scanner;

public class AGE {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter Ram's age: ");
	        int ramAge = scanner.nextInt();

	        System.out.print("Enter Rahul's age: ");
	        int rahulAge = scanner.nextInt();

	        System.out.print("Enter Nikhil's age: ");
	        int nikhilAge = scanner.nextInt();

	        if (ramAge > rahulAge && ramAge > nikhilAge) {
	            System.out.println("Ram is older, Nikhil and Rahul are younger");
	        } else if (rahulAge > ramAge && rahulAge > nikhilAge) {
	            System.out.println("Rahul is older, Ram and Nikhil are younger");
	        } else {
	            System.out.println("Nikhil is older, Ram and Rahul are younger");
	        }

	        scanner.close();
	    }
	}


