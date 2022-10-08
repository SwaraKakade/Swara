package Day13;

import java.util.Scanner;

public class AlphabetIsVowel 
{
	public static void main(String[] args) 
	{
		// Write a Java program to input any alphabet and check whether it is vowel or consonant.
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your alphabet");
		
		char ch = sc.next().charAt(0);
		
		AlphabetIsVowel c = new  AlphabetIsVowel();
		c.acceptChar(ch);
	}
   
	public char acceptChar(char ch)
	{
		switch(ch)
		{
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
				System.out.println("alphabet is vowel - " +ch);
			break;
			default: 
				System.out.println("alphabet is constant - " +ch);
		}
		return ch;
	}
}