package Day17;

public class Staff 
{
  int eid;
  String name;
  Staff()  {}
  
  Staff(int id , String n)
  {
	  eid =id;
	  name=n;
  }
  public String toString()
  {
	  return "Staff id :"+eid+"name : "+name;
  }
}
