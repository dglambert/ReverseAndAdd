//PalindromeChecker.java

public class PalindromeChecker
{
	public int attempts;
	public Palindrome palindrome;
	
	public PalindromeChecker(Palindrome palindrome, int attempts)
	{
		this.palindrome = palindrome;
		this.attempts = attempts;
	}
	
	public static Palindrome addAndReverse(Palindrome palindrome)
	{
		int top = Integer.parseInt( palindrome.toString() );
		int bottom = Integer.parseInt( new StringBuffer(palindrome.toString()).reverse().toString() );
		return new Palindrome( Integer.toString(top + bottom) );
	}
}