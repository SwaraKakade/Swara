package Day15_Constructor;

public class Laptop 
{
    private String operting_System;
    private String brand;
    private int cost;
    public Laptop()
    {
    }
    public Laptop (String operting_System , String brand , int cost )
    {
    	this ("LINUX" , "HP" );
    	this.operting_System = operting_System;
    	this.brand = brand;
    	this.cost=cost;
    }
    public Laptop (String os , String Br )
    {
    	
    	this();
    	this.operting_System=os;
    	this.brand=Br;
    	
    	
    }
    void showDetails()
    {
    	System.out.println("Laptop Operting System : "+this.operting_System);
    	System.out.println("BRAND : "+this.brand);
    	System.out.println("COST : "+this.cost);
    }
}
