package Day7;

import java.util.Scanner;

public class Pattern_star_program
{
	public static void main (String [] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
			
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("* ");
				
			}
		
			System.out.println();
		}
	}
}
