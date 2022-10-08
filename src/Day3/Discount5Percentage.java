package Day3;

import java.util.Scanner;

public class Discount5Percentage {
	


	   public static void main(String[] args)
	   {
	      int totalCost, costToPaid, discount;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the Total Amount of Shopping: ");
	      totalCost = scan.nextInt();
	      
	      
	      int costToPaid = (totalCost<=5000)? costToPaid = totalCost: (totalCost>5000 && totalCost<=10000)?
	    		           discount = (totalCost*5)/100 :(totalCost>10000 && totalCost<=15000)?  
	    		           discount = (totalCost*10)/100:discount = (totalCost*30)/100;
	//      
	      if(totalCost<=5000)
	      {
	         costToPaid = totalCost;
	      }
	      
	     
	      else if(totalCost>5000 && totalCost<=10000)
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


