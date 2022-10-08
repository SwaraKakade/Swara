package Day10;

public class Semester 
{

	  int rollNumber;
	  int phy;
	  int chem;
	  int maths;
	  String name;
	 
	  public Semester ()
	  {
		  int rollNumber = 1;
		  int phy = 50;
		  int chem = 70;
		  int ma = 70;
		  String na = "Nisha";
		  
	  }
	 
	  public Semester(int roll, int p, int c , int m , String n)
	  {
		  rollNumber = roll;
		  phy = p;
		  chem = c;
		  maths = m;
		  name = n;	  
	  }
	 
	  void displayRecords()
	  {
		 System.out.println(" \n Roll No " +rollNumber + " with Name " + name +  "\n  following marks  :");
		  System.out.println("physics :" +phy);
		 System.out.println("Chemistry :" +chem);
		 System.out.println("mathematics :" +maths); 
	  }
		
	}


