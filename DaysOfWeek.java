package com.scanner;

import java.util.Scanner;

public class DaysOfWeek   
{

	public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in); 
			System.out.println("Please enter input value");
			int x = sc.nextInt();
			
			System.out.println("value of x:"+x);
			
		    switch(x)
		     {
		     case 1:
		    	    System.out.println("Sunday");
		    	    break;
		    	  
		     case 2:
		    	     System.out.println("monday");
		    	     break;
		    	     
		     case 3:
		    	    System.out.println("Tuesday");
		    	    break;
		    	    
		     case 4:
		    	    System.out.println("Wednesday");
		    	    break;
		    	    
		     case 5:
		    	    System.out.println("thursday");
		    	    break;
		    	    
		     case 6:
		    	     System.out.println("friday");
		    	     break;
		    	     
		     case 7: 
		    	     System.out.println("saturday");
		    	     break;
		    	     
		    default:
		    	System.out.println("please enter correct input value");
		    	
		}
	}

	 
}

