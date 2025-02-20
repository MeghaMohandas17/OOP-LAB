import java.util.*;
class complex
{
	int r,i;
	complex(int r,int i )
	{
		this.r=r;
		this.i=i;
	}
	static void sum(complex c1,complex c2)
	{
		int fp=c1.r+c2.r;
		int sp=c1.i+c2.i;
		System.out.println("Sum is " +fp+ "+" +sp+ "i");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the real part and imaginary part of the first complex number:");
		int r1=sc.nextInt();
		int i1=sc.nextInt();
		complex s1=new complex(r1,i1);
		
		System.out.println("Enter the real part and imaginary part of the second complex number:");
		int r2=sc.nextInt();
		int i2=sc.nextInt();
		complex s2=new complex(r2,i2);
		complex s3=new complex(0,0);
		s3.sum(s1,s2);
	}
}
