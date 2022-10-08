package Day24_Lamda;

interface ReadBooks
{
	void reading(String book);
	static void keepDistanceToRead(int feets , int inches)
	{
		System.out.println("Distance  in feet "+feets+"\n and Distance in inches "+inches);
	}
}

public class ReadBook 
{
	public void reading(String book)
	{
		System.out.println("Reading book"+book);
	}

}
