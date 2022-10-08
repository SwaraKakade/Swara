package Day14;

public class Bank 
{
public static void main(String []args)
{
	Account a = new Account();
	a.setAccount_Name ("SWARA");
	a.setBalance(5000);
	a.setAccount_Holder_ID (07);
	
	System.out.println("NAME OF THE ACCOUNT HOLDER : " +a.getAccount_Name());
	System.out.println("BALANCE AMOUNT : " +a.getBalance());
	System.out.println("ID OF THE ACCOUNT HOLDER : " +a.getAccount_Holder_ID());
	
}
}
