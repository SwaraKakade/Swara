package Day3;

import java.util.Scanner;

public class Max_Num_From_3_Num 

{
	public static void main(String[] arg)
	{
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		
		
		
		int Max = (num1>num2) && (num1>num3)? num1: (num2>num1) && (num2>num3)? num2:num3;
		System.out.println("Greater Value:" +Max);
	}
	
}
