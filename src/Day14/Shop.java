package Day14;

public class Shop 
{
public static void main(String []args)
{
	Item o = new Item();
	o.setItemId(11);
	o.setProductName("Salt");
	o.setItemCost(100);
	
	System.out.println("ITEM ID : "+ o.getItemID());
	System.out.println("NAME OF ITEM : "+o.getProductName());
	System.out.println("COST OF ITEM : "+o.getItemCost());
	
}
}
