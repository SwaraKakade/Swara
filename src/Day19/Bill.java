package Day19;

public class Bill 
{
  private int billNo;
  private float billAmount;
  MyDate billDate;
  
  
  public void setbillNo(int n)
  {
	  billNo=n;
  }
  public void setbillAmount(float b)
  {
	  billAmount=b;
  }
  public void setbillDate(MyDate d)
  {
	  billDate=d;
  }
  public String toString()
  {
	  return "Bill Number : \n"+billNo+ "\n has its Bill Amount : \n"+billAmount+"\n has its Bill Date : \n"+billDate;
  }
}
