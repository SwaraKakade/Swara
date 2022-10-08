package Day11;

public class Empoyee 
{
			  int empSalary, empId;
			  String name;
			 
			  
			  void displayRecords()
			  {
				  System.out.println("\n\n Empoyee NAME : " +name);
				 System.out.println("   Empoyee ID :  " +empId  );
				  System.out.println("Empoyee SALARY :" +empSalary); 
			  }
			  
			  
			  public void acceptEmpoyeeDetails(int id, int salary, String n)
			  {
				  empSalary = salary;
				  empId = id;
				  name = n;	  
			  }
			 
			
				
			}






