//Test.java

public class Test
{

	public static void main(String args[])
	{
		Palindrome palindrome = new Palindrome("195");
		
		System.out.println(palindrome);
		palindrome = PalindromeChecker.addAndReverse(palindrome);
		System.out.println(palindrome);
		palindrome = PalindromeChecker.addAndReverse(palindrome);
		System.out.println(palindrome);
		palindrome = PalindromeChecker.addAndReverse(palindrome);
		System.out.println(palindrome);
		palindrome = PalindromeChecker.addAndReverse(palindrome);
		System.out.println(palindrome);
	
		
		System.out.println(palindrome.isPalindrome());
		
		
		//palindrome.isPalindrome()
		//palindrome = PalindromeChecker.addAndReverse(palindrome);
	}
}
					