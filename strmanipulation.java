import java.util.*;
class strmanipulation
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		System.out.println("String in lowercase:"+str.toLowerCase());
		System.out.println("String in uppercase:"+str.toUpperCase());
		System.out.println("Substring of the string:"+str.substring(1,9));
		System.out.println("Length of the string:"+str.length());
		System.out.println("Character at the given position:"+str.charAt(7));
	} 
}
