package Day5;

import java.util.Scanner;

public class DisplayEvenNumbers 
{
public void num()
{
	 
	int number, i , sum=0;  
	Scanner sc=new Scanner(System.in);  
	System.out.print("Enter the limit: ");  
	number = sc.nextInt();
	i = sc.nextInt();
	 
	System.out.print("Lit of even numbers: ");  
	
	while(i>number)  
	{  
	  if(number%2==0)
	  {
	     System.out.println(number );  
	  }
	  number++;
	
	}  
    sum += i; 
    
   }  
  

	public static void main(String[] args) 
	{ 
		DisplayEvenNumbers o = new DisplayEvenNumbers ();
		o.num();
		 System.out.println("Sum of all even numbers ");  
    }  
		
	} 
















































