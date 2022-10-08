package Day11;



public class Company 
{

	public void  showEmployeeHighSalary (Empoyee e1 , Empoyee e2 ,Empoyee e3 )
	{
		Empoyee temp;
		temp= e1;
		if (temp.empSalary < e2.empSalary)
		{
			temp=e2;
		}
		if (temp.empSalary < e3.empSalary)
		{
			temp=e3;
		}
			
		// int Max = (e1.empSalary > e2.empSalary) && (e1.empSalary > e3.empSalary) ? e1.empSalary : (e2.empSalary > e1.empSalary)
		//		&& (e2.empSalary > e3.empSalary) ? e2.empSalary : e3.empSalary;

		System.out.println("\n \nHigest SALARY \nName :" +temp.name + "\nEmp ID :" + temp.empId + "\nSalary :" + temp.empSalary);
		
		///System.out.println("\n \nHigest SALARY :" +temp.empSalary);
	}
	public static void main(String []a )
	{
		Empoyee s1 = new Empoyee () ;
		 
		  s1.acceptEmpoyeeDetails(1,10000,"Swara");
		  s1.displayRecords(); 
		  
		  Empoyee s2 = new Empoyee () ;
			 
		  s2.acceptEmpoyeeDetails(2,20000,"Gauri");
		  s2.displayRecords();  
		  
		  Empoyee s3 = new Empoyee () ;
			 
		  s3.acceptEmpoyeeDetails(3,4000,"Pooja");
		  s3.displayRecords(); 
		  
		  Company o = new  Company ();
		 
		 o.showEmployeeHighSalary(s1 , s2 , s3);
		  
   }
}
