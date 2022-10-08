package Day7;
import java.util.Scanner;

public class Skip_Number_In_Table 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		for(int i=1; i<=10; i++)
		{
		
			if(i==7)
				continue;
			System.out.println(a*i);
			
		}
	}
}
