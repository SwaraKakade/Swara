package Day2;

import java.util.Scanner;

public class Factor 
{
	public static void main(String[] args)
	{
	
	Scanner sc = new Scanner(System.in);
	
	
	System.out.print("Enter the Number");	
	int r=sc.nextInt();
	
	
	System.out.print("Enter the Number");
	int p=sc.nextInt();
	
	sc.close();
	
	if(p %r==0)
	
		System.out.println(p+" is factor of "+r);
	else
		System.out.println(r+" is  not factor of "+p);
	}

}
