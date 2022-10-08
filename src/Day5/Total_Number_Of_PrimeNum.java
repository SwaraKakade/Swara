package Day5;

import java.util.Scanner;

public class Total_Number_Of_PrimeNum 
{
	public void num()
	{
		
		  int primeCheckNumber;
		  int n = 1;
		  int divisibleCount;

		  while (n <= 100) 
			   
		  {
		   divisibleCount = 0;
		   primeCheckNumber = 2;
		   while (primeCheckNumber <= n / 2) 
		   {
		    if (n % primeCheckNumber == 0) 
		    {
		     divisibleCount++;
		     break;
		    }
		    primeCheckNumber++;
		   }
		   if (divisibleCount == 0 && n != 1) {
		    System.out.println(n + " ");
		   }
		   n++;
		  }

	}
	
	        public static void main(String[] args) 
	    	{
	            System.out.println("Enter a number to check Prime or Not");
	            Total_Number_Of_PrimeNum  o = new Total_Number_Of_PrimeNum ();
	            o.num();
	            
	           
	    	}

	}


