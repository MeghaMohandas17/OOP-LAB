import java.util.*;
public class symmetric
{
	public static void main(String args[])
	{
		int i,j,r,c;
		int a[][]=new int[10][10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		r=sc.nextInt();
		System.out.println("Enter the number of columns");
		c=sc.nextInt();
		System.out.println("Enter the matrix");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Transpose matrix is");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println(" ");
		}
		boolean isSym=true;
		{
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					if(a[i][j]!=a[j][i])
					{
						isSym=false;
						break;
					}
				}
				if(!isSym)
				{
					break;
				}
			}
			if(!isSym)
			{
				System.out.println("It is not a symmetric matrix");
			}
			else
			{
				System.out.println("It is a symmetric matrix");
			}
		}
	}
}
