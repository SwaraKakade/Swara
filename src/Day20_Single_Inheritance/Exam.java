package Day20_Single_Inheritance;

public class Exam 
{
     private String type;
     private String subjectName;
     
   public  Exam () {
	   type="Inheritance";
	   subjectName = "JAVA";
   }
     
   
   public  Exam (String t , String s )
   {
   type =t;
   subjectName =s;
   }
   public void ShoeCaseExamDetails()
   {
	   System.out.println("EXAM TYPE :  "+type);
	   System.out.println("SUBJECT NAME :  "+subjectName);
   }
}
