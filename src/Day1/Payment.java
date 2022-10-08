package Day1;



public class Payment 
{

	public void  showEmployeeHighSalary (Shopping e1 , Shopping e2 ,Shopping e3 )
	{
		Shopping temp;
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
		Shopping s1 = new Shopping () ;
		 
		  s1.doTransaction(1,10000,"Swara");
		  s1.displayRecords(); 
		 
		  Shopping s2 = new Shopping () ;
		  
			 
		  s2.doTransaction(2,60000);
		  s2.displayRecords();  
		  
		  Shopping s3 = new Shopping () ;
			 
		  s3.doTransaction(40000,"Pooja");
		  s3.displayRecords(); 
		  
		  Payment o = new  Payment ();
		 
		 o.showEmployeeHighSalary(s1 , s2 , s3);
		  
   }
}

