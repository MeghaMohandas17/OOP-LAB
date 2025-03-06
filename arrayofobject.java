import java.util.*;
class Employee
{
	int eNo;
	String eName;
	double Salary;
	
	Employee(int eNo,String eName,double Salary)
	{
		this.eNo=eNo;
		this.eName=eName;
		this.Salary=Salary;
	}
}
class arrayofobject
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
	int flag=0;
	System.out.println("Enter the total number of employees:");
	int n=sc.nextInt();
	Employee[] obj=new Employee[n];
	
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter the employee number:"+(i+1));
		int eNo=sc.nextInt();
		System.out.println("Enter the employee name:");
		String eName=sc1.nextLine();
		System.out.println("Enter the salary of employee:");
		double Salary=sc.nextDouble();
		obj[i]=new Employee(eNo,eName,Salary);
	}
	System.out.println("Enter the employee number to be searched:");
	int temp=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		if(obj[i].eNo==temp)
		{
			System.out.println("Result found" +obj[i].eName);
			flag=1;
			break;
		}
	}
	if(flag==0)
	{
		System.out.println("Not found");
	}
}
}
