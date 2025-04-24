import java.util.*;
class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
		super(s);
	}
}
class Test
{
	static void Age(int n) throws InvalidAgeException
	{
		if(n<18)
		{
			throw new InvalidAgeException("Age Invalid");
		}
	}
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int n=sc.nextInt();
		try
		{
			Age(n);
		}		
		catch(InvalidAgeException e)
		{
			System.out.println(e);
		}
	}
}
