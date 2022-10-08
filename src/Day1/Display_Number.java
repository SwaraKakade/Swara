package Day1;
import java.util.Scanner;

public class Display_Number 
{
	public void number()
	{
		        int sequence=1;
		        
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the length of sequence: ");      

		        
		        int n = sc.nextInt();
		        while(n!=0)
		        {
		           System.out.print(sequence);
		           System.out.print(" ");
		           sequence*=2;
		           n-=1;
		        }
		    }
		

public static void main(String[] args)
{
	Display_Number e = new Display_Number();
	e.number();
}

}

