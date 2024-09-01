package com.scanner;
import java.util.*;
public class SwitchCaseJava {

	static Scanner sc=new Scanner(System.in);
	static SwitchCaseJava t=new SwitchCaseJava();
	public void addition()
	{
		System.out.println("please enter first input value");
		int p = sc.nextInt();
		System.out.println("please enter second input value");
		int q = sc.nextInt();
		System.out.println("The Addition Of 1st and 2nd Value is \n:"+(p+q));
	}
	public void subtraction(){
		System.out.println("please enter first input value");
		int a = sc.nextInt();
		System.out.println("please enter second input value");
		int b = sc.nextInt();
		System.out.println("The Subtraction Of 1st and 2nd Value is \n:"+(a-b));
	}	
	public void division(){
		System.out.println("please enter first input value");
		int c = sc.nextInt();
		System.out.println("please enter second input value");
		int d = sc.nextInt();
		System.out.println("The Division Of 1st and 2nd Value is \n:"+(c/d));
	}
	public void multiplication(){
		System.out.println("please enter first input value");
		int x = sc.nextInt();
		System.out.println("please enter second input value");
		int y = sc.nextInt();
		System.out.println("The Multiplication Of 1st and 2nd Value is \n:"+(x*y));
	}

	public static void main(String[] args) 
	{
		System.out.println("please enter your choice");
		System.out.println("1.Addition \n2. Subtraction \n3. Division \n4. Multiplication");
		  int x = sc.nextInt();
		  
		  switch(x)
		  {
		  case 1:
			      t.addition();
			      break;
		  case 2:
		          t.subtraction();
		      break;
		      
		  case 3:
		         t.division();
		      break;
		      
		  case 4:
		         t.multiplication();
		      break;
		      
			   default:
				   break;
		  }
	}

}

