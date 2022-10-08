package Day21_Multilevel_Inheritance;

public class Author extends TextBook
{
	private int cost;
	 private String Language;

	 Author()
	 {
		 cost=900;
		 Language="English";
		 
	 }
	 Author(int c, String l)
	 {
		 cost=c;
		 Language=l;
	 }
	 
	
	 public void ShoeCaseAuthorDetails()
	 {
	 	   System.out.println("COST OF BOOK :  "+cost);
	 	   System.out.println("LANGUAGE OF BOOK IS :  "+Language);
	 }
}
