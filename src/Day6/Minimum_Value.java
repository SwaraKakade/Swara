package Day6;

import java.util.Scanner;

public class Minimum_Value 
{
	
	public void number()
	{
		
		  
		Scanner scanner = new Scanner(System.in);
		        int min = Integer.MAX_VALUE;

		        for (int i = 0; i < 10; i++) 
		        {
		            System.out.println("Please enter number");
		            int number = scanner.nextInt();

		            if (number < min) 
		            {
		                min = number;
		            }
		        }

		        System.out.println("the min values is " + min);
	 }

	
	public static void main (String[] args)
	{
		Minimum_Value o = new Minimum_Value();
		o.number();
	}

}
