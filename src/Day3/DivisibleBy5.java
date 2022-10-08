package Day3;

import java.util.Scanner;

public class DivisibleBy5 


{

    public static void main(String[] args) 
    {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();
       
         
        String msg =  num % 5 == 0 ?  " is Divisible By 5" :  " is NOT Divisible By 5";
           
        System.out.println("Result :" +msg);
      
    }
}
