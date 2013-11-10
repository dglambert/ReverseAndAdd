//Main.java

import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		PalindromeChecker[] cases = new PalindromeChecker[in.nextInt()];
		in.nextLine();

		for(int i=0; i < cases.length; i++)
		{
			Palindrome palindrome = new Palindrome(in.nextLine());
			for(int j=0; true; j++)
			{
				if(palindrome.isPalindrome())
				{
					cases[i] = new PalindromeChecker(palindrome, j);
					break;
				}
				else
					palindrome = PalindromeChecker.addAndReverse(palindrome);
			}
		}
		
		for(int i=0; i<cases.length; i++)
		{
			System.out.println(cases[i].attempts + " " + cases[i].palindrome);
		}
	}
	
	
}