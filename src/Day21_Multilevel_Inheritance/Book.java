package Day21_Multilevel_Inheritance;

public class Book 
{ 
     private int bookId;
     private int publicationId;
     
     public Book()
     {
    	 bookId =1;
    	 publicationId=22;
    	 
     }
     public Book(int a, int b)
     {
    	 bookId =a;
    	 publicationId=b;
    	 
     }
     public void redBook(String a)
     {
    	 System.out.println("I AM READING BOOK : "+a); 
     }
   
     public void ShoeCaseBookDetails()
     {
  	   System.out.println("BOOK ID :  "+bookId);
  	   System.out.println("BOOK PUBLICATION ID :  "+publicationId);
     }
}
