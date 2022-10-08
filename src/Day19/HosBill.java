package Day19;

public class HosBill 
{
  public static void main (String [] a)
  {
	  MyDate d1 = new MyDate();
	  d1.setDD(7);
	  d1.setMM("OCT");
	  d1.setYY(1997);
	  
	  Bill b = new Bill();
	  b.setbillAmount(700.0f);
	  b.setbillDate(d1);
	  b.setbillNo(6);	
	  
	  System.out.println(b);
  }
}
