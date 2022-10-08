package Day19;

public class MyDate 
{
  private String mm;
  private int yy;
  private int dd;
  
  public  MyDate()  {}
  
  public  MyDate(String m, int y, int d)
  {
	  mm=m;
	  yy=y;
	  dd=d;
	  
  }
  public void setMM(String month)
  {
	  mm=month;
  }
  public void setYY(int year)
  {
	  yy=year;
  }
  public void setDD(int Date)
  {
	  dd=Date;
  }
  public String toString()
  {
	  return dd+" "+mm+" "+yy;
	  
  }
  
}
