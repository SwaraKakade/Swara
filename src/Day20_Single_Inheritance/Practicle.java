package Day20_Single_Inheritance;

public class Practicle  extends Exam
{
   private String topic;
   private int outOfMarks;
 
   
   public Practicle()  {
	   topic ="Inheritance";
	   outOfMarks=98;
   }
   
   public Practicle(String n, int o)
   {
	  
	   
	   topic = n;
	   outOfMarks = o;
	   
   }
   public void PracticleExamDetails()
   
   {
	   ShoeCaseExamDetails();
	   System.out.println("EXAM TOPIC :  "+topic);
	   System.out.println("OUT OF MARKS :  "+outOfMarks);
   }
   
}


