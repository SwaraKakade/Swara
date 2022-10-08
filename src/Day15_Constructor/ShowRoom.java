package Day15_Constructor;

public class ShowRoom 
{
 public static void main (String [] args)
 {
	 Laptop L = new Laptop("Windows" , "AA");
	 L.showDetails();
	 
	 Laptop L1 = new Laptop();
	 System.out.println("LAPTOP Details : \n ");
	 L1.showDetails();
	 
 }
}
