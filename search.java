import java.util.*;
class search
{
	public static void main(String args[])
	{
		int a[]=new int[20];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int l=sc.nextInt();
		System.out.println("Enter the elements of array:");
		for(int i=0;i<l;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to search:");
		int s=sc.nextInt();
		int pos=-1;
		for(int i=0;i<l;i++)
		{
			if(a[i]==s)
			{
				pos=i;
				break;
			}
		}
		if(pos==-1)
		{
			System.out.println("Entered element is not in the array;");
		}
		else
		{
			System.out.println("Entered element is found at the index position:"+pos);
		}
	}
}
