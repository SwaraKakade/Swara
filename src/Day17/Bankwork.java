package Day17;

public class Bankwork 
{

	public static void main (String [] a)
	{
		Staff so = new Staff(321, "Swara"); 
		Bank b = new Bank ("BOI" , "PUNE", so);
		System.out.println(b);
		
	}
}
