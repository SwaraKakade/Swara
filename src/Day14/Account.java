package Day14;

public class Account 
{
  String Account_Name;
  int Balance;
  int Account_Holder_ID;
  
  public String  getAccount_Name ()
  {
 	 return Account_Name;
  }
 
  public int getBalance()
  {
	  return Balance;
  }
  public int getAccount_Holder_ID()
  {
	  return Account_Holder_ID;
  }
  
 public void setAccount_Name(String Account_Name)
 {
	 this.Account_Name = Account_Name;
	
 }
 public void setBalance(int Balance)
 {
	 this.Balance = Balance;
 }
 public void setAccount_Holder_ID(int Account_Holder_ID)
 {
	 this.Account_Holder_ID = Account_Holder_ID;
 }
}
