//Palindrome.java

public class Palindrome
{
	String palindrome;
	
	public Palindrome(String palindrome)
	{
		this.palindrome = palindrome;
	}
	
	public boolean isPalindrome()
	{
		String temp = palindrome;
		
		while(temp.length() > 1)
		{
			int first = Character.getNumericValue( temp.charAt(0) );
			int last = Character.getNumericValue( temp.charAt(temp.length()-1) );
			
			if(first == last)
				temp = temp.substring(1, temp.length()-1);
			else
				return false;
		}
		return true;
	}
	
	@Override
	public String toString()
	{
		return palindrome;
	}
}