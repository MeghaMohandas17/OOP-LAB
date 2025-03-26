import java.util.*;
class shape
{
	int l,b;
	float r;
	double a;
	void area(int l,int b)
	{
		this.l=l;
		this.b=b;
		int a1=l*b;
		System.out.println("Area of rectangle:"+a1);
	}
	void area(float r)
	{
		//this.r=r;
		//float a2=3.14*r*r;
		System.out.println("Area of circle:"+3.14*r*r);
	}
	void area(double a)
	{
		this.a=a;
		double a3=a*a;
		System.out.println("Area of square:"+a3);
	}
}
class shapes
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		shape sh=new shape();
		System.out.println("Enter length of the rectangle:");
		int l=sc.nextInt();
		System.out.println("Enter the breadth of the rectangle:");
		int b=sc.nextInt();
		sh.area(l,b);
		System.out.println("Enter the radius of the circle:");
		float r=sc.nextFloat();
		sh.area(r);
		System.out.println("Enter the side of the square:");
		double a=sc.nextDouble();
		sh.area(a);
	}
}
