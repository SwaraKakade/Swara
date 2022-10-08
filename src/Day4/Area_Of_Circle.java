package Day4;


import java.util.Scanner;

public class Area_Of_Circle 

{
	Scanner sc = new Scanner(System.in);
	
	public void makeArea()
	{
		int radius;
		float area;
		
		
		System.out.println("Enter Radius of Circle : ");
		radius = sc.nextInt();
		area = (float)(3.14*radius*radius);
		
		System.out.println("Area  of Circle : "+area);
	}

	
	public void rectangle()
	{
		int length;
		int breath;
		int area;
		
		System.out.println("Enter the value of Rectangle");
		System.out.println("Enter the length :");
		length=sc.nextInt();
		
		System.out.println("Enter the breath:");
		breath= sc.nextInt();
		
		area=length*breath;
		
		System.out.println("Area  of rectangle:"+area);
	}
	
	public static void main(String []args)
	{
		System.out.println("Main is starated ");
		Area_Of_Circle  o= new Area_Of_Circle ();
		
		o.makeArea ();
		o.rectangle ();
	}
	

}
