import  java.util.*;
class publisher
{
	String pub_name,agency_name;
	publisher(String pub_name,String agency_name)
	{
		this.pub_name=pub_name;
		this.agency_name=agency_name;
	}
}
class book extends publisher
{
	String book_name,author,type;
	int price;
	book(String pub_name,String agency_name,String book_name,String author,String type,int price)
	{
		super(pub_name,agency_name);
		this.book_name=book_name;
		this.author=author;
		this.type=type;
		this.price=price;
	}
}
class literature extends book
{
	literature(String pub_name,String agency_name,String book_name,String author,String type,int price)
	{
		super(pub_name,agency_name,book_name,author,type,price);
	}
	void display_lit()
	{
		
		System.out.println("Book name :"+book_name);
		System.out.println("Author name : "+author);
		System.out.println("Publisher name : "+pub_name);
		System.out.println("Agent name : "+agency_name);
		System.out.println("Price of book :"+price);
	}
}
class fiction extends book
{
	fiction(String pub_name,String agency_name,String book_name,String author,String type,int price)
	{
		super(pub_name,agency_name,book_name,author,type,price);
	}
	void display_fict()
	{
		System.out.println("Book name :"+book_name);
		System.out.println("Author name : "+author);
		System.out.println("Publisher name :"+pub_name);
		System.out.println("Agent name : "+agency_name);
		System.out.println("Price of book : "+price);
	}
}
class category
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		int i,n,n1;
		System.out.println("Enter the number of literature books ");
		n=sc.nextInt();
		literature ar[]=new literature[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter Book name ");
			String book_name=sc1.nextLine();
			System.out.println("Enter Author name ");
			String author=sc1.nextLine();
			System.out.println("Enter Publisher name ");
			String pub_name=sc1.nextLine();
			System.out.println("Enter Agency name ");
			String agency_name=sc1.nextLine();
			System.out.println("Enter Type of book ");
			String type=sc1.nextLine();
			System.out.println("Enter Price of book");
			int price=sc.nextInt();
			ar[i]=new literature(pub_name,agency_name,book_name,author,type,price);
			System.out.println("\n");
		}
		System.out.println("Enter the number of fiction books ");
		n1=sc.nextInt();
		fiction arr[]=new fiction[n1];
		for(i=0;i<n1;i++)
		{
			System.out.println("Enter Book name ");
			String book_name=sc1.nextLine();
			System.out.println("Enter Author name ");
			String author=sc1.nextLine();
			System.out.println("Enter Publisher name ");
			String pub_name=sc1.nextLine();
			System.out.println("Enter Agency name ");
			String agency_name=sc1.nextLine();
			System.out.println("Enter Type of book ");
			String type=sc1.nextLine();
			System.out.println("Enter Price of book");
			int price=sc.nextInt();
			arr[i]=new fiction(pub_name,agency_name,book_name,author,type,price);
			System.out.println("\n");
		}
		System.out.println("DETAILS OF LITERATURE BOOKS");
		System.out.println("---------------------------");
		for(i=0;i<n;i++)
		{
			ar[i].display_lit();
			System.out.println("\n");
		}
		System.out.println("DETAILS OF FICTION BOOKS");
		System.out.println("------------------------");
		for(i=0;i<n1;i++)
		{
			arr[i].display_fict();
			System.out.println("\n");
		}
	}
}
