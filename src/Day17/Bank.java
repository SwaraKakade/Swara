package Day17;

public class Bank
{
	String bName, location;
	Staff s1;
	
	 Bank()  {}
	
	Bank(String bn , String lo, Staff s)
	{
		bName = bn;
		location = lo;
		s1= s;
		
	}
	public String toString()

	{
		return "Bank Name :"+bName + "\n Located at : " +location + "\n has following \n "+s1;
	}
}
