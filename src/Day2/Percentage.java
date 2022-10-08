package Day2;

import java.util.Scanner;

public class Percentage
{

	
	public static void main(String args[])
	{
	     int  phy, chem, math; 
	     
	     double total, percentage;
	     
	    Scanner op=new Scanner(System.in);
	    
	    
	    System.out.println("Enter marks of  subjects:");
	    
	   
	    System.out.print("Enter marks of physics subjects:");
	    phy=op.nextInt();
	    
	    System.out.print("Enter marks of chemistry subjects:");
	    chem=op.nextInt();
	    
	    System.out.print("Enter marks of maths subjects:");
	    math=op.nextInt();
	   

	   
	    total =  phy + chem + math ;
	   
	    percentage = (total / 300.0) * 100;

	    if(percentage>=40)
	    	System.out.println("Student is PASS");
	    else
	    	System.out.println("Student is FAIL");
	    	
	    
	    System.out.println("Total marks ="+total);
	   
	    System.out.println("Percentage = "+percentage);

	   }
	}

