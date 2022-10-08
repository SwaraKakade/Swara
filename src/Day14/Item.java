package Day14;

public class Item 
{

	 int ItemId;
     String ProductName;
     int ItemCost;
     
     public int getItemID ()
     {
    	 return ItemId;
     }
     public String getProductName ()
     {
    	 return ProductName;
    	 
     }
     public int getItemCost()
     {
    	 return ItemCost;
     }
     
     public void setItemId(int ItemId)
     {
      this.ItemId= ItemId;
     }
     public void setProductName(String ProductName)
     {
    	 this.ProductName = ProductName;
     }
     public void setItemCost(int ItemCost)
     {
    	 this.ItemCost = ItemCost;
     }
	
}
