package Day2;

import java.util.Scanner;

public class BilDiscount {
	


	   public static void main(String[] args)
	   {
	      int totalCost, costToPaid, discount;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the Total Amount of Shopping: ");
	      totalCost = scan.nextInt();
	      
	      if(totalCost<=2000)
	      {
	         costToPaid = totalCost;
	      }
	      else if(totalCost>2000 && totalCost<=5000)
	      {
	         discount = (totalCost*2)/100;
	         costToPaid = totalCost - discount;
	      }
	      else if(totalCost>5000 && totalCost<=1000)
	      {
	         discount = (totalCost*5)/100;
	         costToPaid = totalCost - discount;
	      }
	      else if(totalCost>10000 && totalCost<=15000)
	      {
	         discount = (totalCost*10)/100;
	         costToPaid = totalCost - discount;
	      }
	      else
	      {
	         discount = (totalCost*30)/100;
	         costToPaid = totalCost - discount;
	      }
	      System.out.println("\nThe cost to be Paid is: " + costToPaid);
	   }
	}


