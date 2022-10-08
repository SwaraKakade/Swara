package Day16_Static_Method;


	public class RecurringAccount
	{
		
		      int accountNo;
		      float balance;
		      String accountHolder;
		      
		      public RecurringAccount () 
		      {
		    	  accountNo = 99;
				   balance = 78000;
				  accountHolder = "ABCDE";
		      }
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


