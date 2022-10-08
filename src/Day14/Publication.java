package Day14;

public class Publication 
{

	public static void main(String [] args)
	{
		Book b = new Book();
	    b.setID(1234);
	    b.setName("100_Days");
	    b.setPrice(60);
	    b.setAuther ("SWARA");
	    
	    System.out.println("NAME OF BOOK_ID : "+b.getID());
	    System.out.println("NAME OF BOOK : "+b.getName());
	    System.out.println("BOOK PRICE : "+b.getPrice());
	    System.out.println("NAME OF AUTHER : "+b.getAuther());
	    
	
	
}

	
}
