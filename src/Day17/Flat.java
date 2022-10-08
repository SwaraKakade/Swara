package Day17;

 class Flat 
{
  int flatNo;
  String owner;
  String area;
  
  Flat() {}
   Flat(int n, String o, String a)
  {
	  flatNo =n;
	  owner =o;
	  area = a;
  }
  public String toString()
  {
	return "\n\n FLAT NUMBER : "+flatNo+ "\n OWNER Name : "+owner +"\n Area : "+area;
	  
  }
}
