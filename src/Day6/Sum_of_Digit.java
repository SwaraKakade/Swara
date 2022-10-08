package Day6;

import java.util.Scanner;

public class Sum_of_Digit {
	

   public void num()
   {
    
        int x, i = 1 ;
        int sum = 0;
        System.out.println("Enter Number  :");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        while(i <= x)
        {
            sum = sum +i;
            i++;
        }
        System.out.println("Sum of "+x+" numbers is :"+sum);
    } 

public static void main(String args[])
{

Sum_of_Digit o = new Sum_of_Digit();
o.num();
}
}
