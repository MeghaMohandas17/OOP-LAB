import java.util.*;
class Person
{
	String name;
	String gender;
	String address;
	int age;
	Person(String name,String gender,String address,int age)
	{
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.age=age;
	}
}
class Employee extends Person
{
	int empid;
	String compname;
	String qualifn;
	int salary;
	Employee(String name,String gender,String address,int age,int empid,String compname,String qualifn,int salary)
	{
		super(name,gender,address,age);
		this.empid=empid;
		this.compname=compname;
		this.qualifn=qualifn;
		this.salary=salary;
	}
}
class Teacher extends Employee
{
		String subject;
		String dept;
		int teacherid;
		Teacher(String name,String gender,String address,int age,int empid,String compname,String qualifn,int salary,String subject,String dept,int teacherid)
		{
			super(name,gender,address,age,empid,compname,qualifn,salary);
			this.subject=subject;
			this.dept=dept;
			this.teacherid=teacherid;
		}
		void display()
		{
			System.out.println("Details");
			System.out.println("-------");
			System.out.println("Name : "+name);
			System.out.println("Gender : "+this.gender);
			System.out.println("Address : "+this.address);
			System.out.println("Age : "+this.age);		
			System.out.println("Employee ID : "+this.empid);
			System.out.println("Company Name : "+this.compname);
			System.out.println("Qualification : "+this.qualifn);
			System.out.println("Salary : "+this.salary);
			System.out.println("Subject : "+this.subject);
			System.out.println("Department : "+this.dept);
			System.out.println("Teacher ID : "+this.teacherid);
			System.out.println("..........");
	}
}
class multilevel
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of teachers : ");
		int n=in.nextInt();
		Teacher[] arr=new Teacher[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of teacher " + (i + 1) + ":");
			Scanner sc=new Scanner(System.in);
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the name : ");
			String name=sc.nextLine();
			System.out.println("Enter the gender : ");
			String gender=sc.nextLine();
			System.out.println("Enter the address : ");
			String address=sc.nextLine();
			System.out.println("Enter the age : ");
			int age=s.nextInt();
			System.out.println("Enter the Employee ID : ");
			int empid=s.nextInt();
			System.out.println("Enter the Company name : ");
			String compname=sc.nextLine();
			System.out.println("Enter the Qualification : ");
			String qualifn=sc.nextLine();
			System.out.println("Enter the Salary : ");
			int salary=s.nextInt();
			System.out.println("Enter the Subject : ");
			String subject=sc.nextLine();
			System.out.println("Enter the Department : ");
			String dept=sc.nextLine();
			System.out.println("Enter the Teacher ID : ");
			int teacherid=s.nextInt();
			arr[i]=new Teacher(name,gender,address,age,empid,compname,qualifn,salary,subject,dept,teacherid);
			arr[i].display();
		}
	}
}
