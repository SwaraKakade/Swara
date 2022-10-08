package Day6;

import java.util.Scanner;

public class Check_Num_Is_Present_in_List {
	
	public boolean number()
	{
		
		boolean flag= false;
		
		while(num!=0)
		{
			int rem= num%10;
			if(rem==i)
			{
				flag=true;
				break;
			}
			num=num/10;
		}
		if(flag==true)
			return true;
		else
			return false;
		
	}
	
	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=scanner.nextInt();
		System.out.println("Find the number :");
		int i=scanner.nextInt();		
		Check_Num_Is_Present_in_List o = new Check_Num_Is_Present_in_List();
		o.number();
		
	}

}
