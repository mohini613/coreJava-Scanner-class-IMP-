package com.scanner;
//import java.util.Hashset;
import java.util.*;
public class swapping3rd {
public static void main(String[] args) {
Scanner scanner =new Scanner (System.in);

{

	System.out.print("Enter the value of x: ");
    int x = scanner.nextInt();

    System.out.print("Enter the value of y: ");
    int y = scanner.nextInt();
	
	System.out.println("before swapping");
	
	System.out.println("x:"+x);
	System.out.println("y:"+y);
	System.out.println("after swapping ");
	int temp = x;
	x=y;
	y=temp;
	System.out.println("x:"+x);
	System.out.println("y:"+y);
}
	
	}

}
