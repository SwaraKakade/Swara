package Day10;

public class ExamResult 

{
public void calculateResult(Semester s1 ,Semester s2 ) 
{

	
	int ptotal= (s1.phy +s2.phy);
	 System.out.println("Total Marks of physics:"+ptotal);
	 
	 int ctotal= (s1.chem +s2.chem);
	 System.out.println("Total Marks of chemistory:"+ctotal);
	 
	 int mtotal= (s1.maths +s2.maths);
	 System.out.println("Total Marks of mathematics:"+mtotal);
	
	float percentage= (((ptotal+ctotal+mtotal)*100)/600);
	   
	  System.out.println("Percentage:"+percentage);
    
	
}
public static void main(String []a )
{
	Semester sem1 = new Semester ();
	 sem1.displayRecords();
	  
	  Semester sem2 = new Semester (1,89,90,99,"Swara");
	  sem2.displayRecords(); 
	 
	  
	  ExamResult o;
	  o = new ExamResult();
	 o.calculateResult(sem1,sem2);
	 
	 
}
}
