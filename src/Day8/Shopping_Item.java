package Day8;

public class Shopping_Item 
{
     int itemId;
     String productName;
     int itemCost;
     int quantity;
     int totalPrice;
    
 
     void ShowItemDetails()
     
     {
    	 System.out.println("  WELCOME TO MY SHOP   \n");
    	 System.out.println(" Item_ID ----   : " +itemId );
    	 System.out.println(" Product Name---- :  " + productName); 
    	 System.out.println(" Product Cost---- :  " + itemCost ); 
    	 System.out.println( "Product Quantity------ : " + quantity );
    	 System.out.println("\n\n Total Billing Of Item---- : " +totalPrice);
    	 
     }
     public void acceptItemDetails(int ID, String name, int cost , int qua )
     {
    	 itemId = ID;
    	 productName = name;
    	 itemCost = cost;
    	 quantity = qua;
   	  
    	  totalPrice = qua*cost;
   	  
     }
     public static void main(String []a )
     {
   	
      Shopping_Item s1;
   	  s1 = new Shopping_Item();
   	  s1.acceptItemDetails(1, "salt" ,100,5 );
   	  s1.ShowItemDetails(); 
   	  System.out.println("\n THANK YOU");
   	 
     }
}
