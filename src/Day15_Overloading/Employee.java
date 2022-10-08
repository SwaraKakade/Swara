package Day15_Overloading;

public class Employee 

{
			  int empSalary, empId;
			  String name;
			 
			  
			  void displayRecords()
			  {
				  System.out.println("\n\n Empoyee NAME : " +name);
				 System.out.println("   Empoyee ID :  " +empId  );
				  System.out.println("Empoyee SALARY :" +empSalary); 
			  }
			  
			  
			  public void doTransaction(int id, int salary, String n)
			  {
				  empSalary = salary;
				  empId = id;
				  name = n;	  
			  }
			  public void doTransaction(int id, int salary)
			  {
				  empSalary = salary;
				  empId = id;
			 }
			  public void doTransaction(int salary, String n)
			  {
				  empSalary = salary;
				  name = n;	 
			 }
			  
}







