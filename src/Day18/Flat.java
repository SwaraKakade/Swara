package Day18;

public class Flat 
{
	  int flatNo;
	  String owner;
	  String area;
	  
	  public String getowner()
	  {
		  return owner;
	  }
	  public int getflatNo()
	  {
		  return flatNo;
	  }
	  public String getarea()
	  {
		  return area;
	  }
	  public void setflatNo(int flatNo)
	  {
		  this.flatNo= flatNo;
	  }
	  public void setowner(String owner)
	  {
		  this.owner= owner;
	  }
	  public void setarea(String area)
	  {
		  this.area= area;
	  }
	  public String toString()
	  {
		return "\n\n FLAT NUMBER : "+flatNo+ "\n OWNER Name : "+owner +"\n Area : "+area;
		  
	  }
}
