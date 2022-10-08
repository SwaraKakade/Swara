package Day24_Lamda;

public class MainofFunctionInterface 
{
	public static void main(String [] args)
	{
	ReadBook rd =(String b)->
	{
		System.out.println("reading a book is \n "+b);
	};
	rd.reading("Ramayan");
	ReadBook.keepDistanceToRead(5,4);
	}

}
