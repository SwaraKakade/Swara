package Day18;


public class Building 
{
	 String bName;
	    int floor;
	    Flat s1;
	  
	    public String getbName()
		  {
			  return bName;
		  }
	    public int getfloor()
		  {
			  return floor;
		  }
	    public void setbName(String bName)
		  {
			  this.bName= bName;
		  }
	    public void setfloor(int floor)
		  {
			  this.floor= floor;
		  }
	    public void setFlat(Flat f)
	    {
	    	this.Flat=f;
	    }
	    public String toString()
	    {
	    	return "Building Name :"+bName+ "\n Floor Number :  "+floor+" \n Flat Details----------------------"+s1;
	    }
}
