package Day14;

public class ShowRoom 
{

	public static void main(String [] args)
	{
		Laptop L = new Laptop();
		L.setOperting_System("LINUX");
		L.setBrand("HP");
		L.setCost(45);
		
		System.out.println("NAME OF THE OPERTING SYSTEM : " +L.getOperting_System());
		System.out.println("NAME OF THE BRAND : " +L.getBrand());
		System.out.println("COST OF LAPTOP : " +L.getCost());
	}
}
