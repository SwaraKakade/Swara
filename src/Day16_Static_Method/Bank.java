package Day16_Static_Method;

public class Bank {


 public void accessAccount(FDAccount a)
 {
	 System.out.println("THIS IS FD ACCOUNT DETAILS \n ");
	 a.showAccessStatus();
 }
 public void accessAccount (SavingAccount b)
 {
	 System.out.println("THIS IS SAVING ACCOUNT DETAILS \n ");
	 b.showAccessStatus();
 }
 public void accessAccount( RecurringAccount c)
 {
	 System.out.println("THIS IS RECURRING ACCOUNT DETAILS \n ");
	 c.showAccessStatus();
 }
 public static void main(String [] args)
 {
	 Bank d = new Bank();
	 FDAccount f= new FDAccount( 100, "SWARA");
	 d.accessAccount(f);
	 
	 
	 SavingAccount s= new SavingAccount(200,"Gauri");
	 d.accessAccount(s);
	 
	 RecurringAccount r = new RecurringAccount( 300 ,"PoojA");
	 d.accessAccount(r);
	 
	
 }
 
}
