import java.util.*;
class employee
{
	int emp_id,salary;
	String emp_name,emp_add;
	employee(int emp_id,int salary,String emp_name,String emp_add)
	{
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.emp_add=emp_add;
		this.salary=salary;
	}
}
class teacher extends employee
{
	String dept,sub;
	teacher(int emp_id,int salary,String emp_name,String emp_add,String dept,String sub)
	{
		super(emp_id,salary,emp_name,emp_add);
		this.dept=dept;
		this.sub=sub;
	}
	void display()
	{
		System.out.println("Employee id:"+emp_id);
		System.out.println("Employee name:"+emp_name);
		System.out.println("Employee address:"+emp_add);
		System.out.println("Employee salary:"+salary);
		System.out.println("Employee department:"+dept);
		System.out.println("Employee subject:"+sub);
	}
}
class simpleinherit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		int emp_id,salary;
		String emp_name,emp_add;	
		String dept,sub;
		System.out.println("Enter the number of employees:");
		int n=sc.nextInt();
		teacher arr[]=new teacher[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the employee details");
			System.out.println("--------------------------");
			System.out.println("Enter the employee id:");
			emp_id=sc.nextInt();
			System.out.println("Enter the employee name:");
			emp_name=sc1.nextLine();
			System.out.println("Enter the employee address:");
			emp_add=sc1.nextLine();
			System.out.println("Enter the employee salary:");
			salary=sc.nextInt();
			System.out.println("Enter the employee department:");
			dept=sc1.nextLine();
			System.out.println("Enter the employee subject:");
			sub=sc1.nextLine();
			arr[i]=new teacher(emp_id,salary,emp_name,emp_add,dept,sub);
		}
		boolean flag=false;
		System.out.println("Enter the id of the employee to search:");
		int empid=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if (arr[i].emp_id==empid)
			{
				System.out.println("Employee id found"); 
				arr[i].display();
				flag=true;
			}
		}
		if (flag==false)
		{
			System.out.println("Employee Id not found");
		}
	}
}
