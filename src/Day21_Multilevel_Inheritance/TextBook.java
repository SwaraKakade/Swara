package Day21_Multilevel_Inheritance;

public class TextBook extends Book
{
	 private int numberOfPages;
	 private String subject;


TextBook()
{
	numberOfPages=100;
	subject="JAVA";	
}
TextBook(int s, String f)
{
	numberOfPages=s;
	subject=f;	
}
public void redBook(String s)
{
	super.redBook("JAVA");
	 System.out.println("I AM  NOT READING BOOK : "+s); 
	 
}
public void ShoeCaseTextBookDetails()
{
	   System.out.println("NUMBER OF PAGES :  "+numberOfPages);
	   System.out.println("SUBJECT NAME :  "+subject);
}
}