package Day3;

import java.util.Scanner;

public class Hotel_Menu 

{public static void main(String[] args) {
	// TODO Auto-generated method stub 
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("___* MENU CARD * ___");
	System.out.println("1.Pav Bhaji ................250 Rs\n2.Pizza ....................350 Rs\n3.Dosa .....................90 Rs\n4.Utappa ...................50 Rs\n5.Misal ....................100 Rs");
	System.out.println(" \nWhat You Want To Order ?? ");
	int option=sc.nextInt();
	

	switch(option){
	case 1: {
		System.out.println("Enter the Quantity you Want : ");
		int quantity=sc.nextInt();
		int price = 250;
		System.out.println("Your Total Bill is : "+price*quantity);
		break;
	}
	case 2: {
		System.out.println("Enter the Quantity you Want : ");
		int quantity=sc.nextInt();
		int price = 350;
		System.out.println("Your Total Bill is : "+price*quantity);
		break;
	}
	case 3: {
		System.out.println("Enter the Quantity you Want : ");
		int quantity=sc.nextInt();
		int price = 90;
		System.out.println("Your Total Bill is : "+price*quantity);
		break;
	}
	case 4: {
		System.out.println("Enter the Quantity you Want : ");
		int quantity=sc.nextInt();
		int price = 50;
		System.out.println("Your Total Bill is : "+price*quantity);
		break;
	}
	case 5: {
		System.out.println("Enter the Quantity you Want : ");
		int quantity=sc.nextInt();
		int price = 100;
		System.out.println("Your Total Bill is : "+price*quantity);
		break;
	}
	default:{
		System.out.println("Enter the valid option ");
	}
	
	}
	
	System.out.println("\nThank you Visit us again !!! ");
	sc.close();
}

}
