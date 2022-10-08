package Day8;

public class Student 
{
  int rollNumber, phy, chem, maths;
  String name;
  float percentage;
  int total;
  
  void displayRecords()
  {
	 System.out.println(" Roll No " +rollNumber + " with Name " + name +  "\n  following marks  :");
	  System.out.println("physics :" +phy);
	 System.out.println("Chemistry :" +chem);
	 System.out.println("mathematics :" +maths);
	 
	 percentage= ((total*100)/300);
	  System.out.println("Sum:"+total);	  
	  System.out.println("Percentage:"+percentage);
     
  }
  
  
  public void acceptStudentDetails(int roll, int p, int c , int m , String n)
  {
	  rollNumber = roll;
	  phy = p;
	  chem = c;
	  maths = m;
	  name = n;
	  total = p+c+m;
	  
  }
 
  public static void main(String []a )
  {
	  Student s1;
	  s1 = new Student();
	  s1.acceptStudentDetails(101,89,90,99,"Swara");
	  s1.displayRecords(); 
	  System.out.println("\n Student Details initialized");
	  
  }
	
}
