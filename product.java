import java.util.*;
class product1
{
	int pcode,price;
	String pname;
}
public class product
{
	public static void main(String args[])
	{
		product1 p1=new product1();
		product1 p2=new product1();
		product1 p3=new product1();
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("Enter the code of the first product:");
		p1.pcode=sc.nextInt();
		System.out.println("Enter the name of the first product:");
		p1.pname=sc1.nextLine();
		System.out.println("Enter the price of the first product ");
		p1.price=sc.nextInt();
		
		System.out.println("Enter the code of the second product:");
		p2.pcode=sc.nextInt();
		System.out.println("Enter the name of the second product:");
		p2.pname=sc1.nextLine();
		System.out.println("Enter the price of the second product ");
		p2.price=sc.nextInt();
		
		System.out.println("Enter the code of the third product:");
		p3.pcode=sc.nextInt();
		System.out.println("Enter the name of the third product:");
		p3.pname=sc1.nextLine();
		System.out.println("Enter the price of the third product ");
		p3.price=sc.nextInt();
		
		if(p1.price<p2.price&&p1.price<p3.price)
		{
			System.out.println(p1.pname+" has the lowest price with code "+p1.pcode+" and price "+p1.price);
		}
		else if(p2.price<p3.price)
		{
			System.out.println(p2.pname+" has the lowest price with code "+p2.pcode+" and price "+p2.price);
		}
		else
		{
			System.out.println(p3.pname+" has the lowest price with code "+p3.pcode+" and price "+p3.price);
		}
	}
}
