package Day17;




public class Location 
{
public static void main(String [] a)
{
	Flat so = new Flat(1 , "Swara","Pune");
	Building b = new Building("STAR" , 2 , so);
	System.out.println(b);
	//b.toString();
}
	
}
