package Day4;

import java.util.Scanner;

public class CharacterToUpperCase 

{

	    public static void main(String[] args)
	    
	    {
	        
	        Scanner sc=new Scanner(System.in);
	    
	      System.out.println( "Enter Character :" );
	      
	      char a =sc.next().charAt(0);

	      System.out.println( "Converted character :");
	      if(a>='A' && a<= 'Z')
	      {
	    	  System.out.println( (char)(a+32));
	    	  
	      }
	      else if(a>='a' && a<= 'z')
	      {
	    	  System.out.println( (char)(a-32));
	      }
	      
	      
	      
	   }
	}


