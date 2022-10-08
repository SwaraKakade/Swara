package Day15_Overloading;



public class Company 
{

	public void  showEmployeeHighSalary (Employee e1 , Employee e2 ,Employee e3 )
	{
		Employee temp;
		temp= e1;
		if (temp.empSalary < e2.empSalary)
		{
			temp=e2;
		}
		if (temp.empSalary < e3.empSalary)
		{
			temp=e3;
		}

		System.out.println("\n \nHigest SALARY \nName :" +temp.name + "\nEmp ID :" + temp.empId + "\nSalary :" + temp.empSalary);
	
	}
	public static void main(String []a )
	{
		Employee s1 = new Employee () ;
		 
		  s1.doTransaction(1,10000,"Swara");
		  s1.displayRecords(); 
		  
		  Employee s2 = new Employee () ;
		  
			 
		  s2.doTransaction(2,60000);
		  s2.displayRecords();  
		  
		  Employee s3 = new Employee () ;
			 
		  s3.doTransaction(40000,"Pooja");
		  s3.displayRecords(); 
		  
		  Company o = new  Company ();
		 
		 o.showEmployeeHighSalary(s1 , s2 , s3);
		  
   }
}


