package Day15_Overloading;

public class RecurringAccount
{
	
	      int accountNo;
	      float balance;
	      String accountHolder;
	      
	      public RecurringAccount () {}
	      public RecurringAccount (int accountNo ,float balance ,String accountHolder )
	      {
	      
	      	this.accountNo = accountNo;
	      	this.balance = balance;
	      	this.accountHolder= accountHolder;
	      }
	      public void showAccessStatus()
	      {
	    	   System.out.println("ACCOUNT NUMBER : "+this.accountNo);
	      	System.out.println("ACCOUNT BALANCE : "+this.balance);
	      	System.out.println("ACCOUNT HOLDER NAME : "+this.accountHolder);
	      }
		
}
