package Day17;

 class Building 
 {
    String bName;
    int floor;
    Flat s1;
    
   // Building() {}
    
     Building(String n, int h,Flat f)
    {
    	bName =n;
    	floor=h;
    	s1=f;
    	
    
    	
    }
    public String toString()
    {
    	return "Building Name :"+bName+ "\n Floor Number :  "+floor+" \n Flat Details----------------------"+s1;
    }
}
