import java.util.*;
class innerclass
{
	public static void main(String args[])
	{
	    System.out.println("Enter the CPU price : ");
		Scanner s2=new Scanner(System.in);
		int p=s2.nextInt();
		Cpu obj=new Cpu(p);
		obj.cpudetails();
		/*Ram r=new Ram();
	r.get();
	r.display();*/
	}
}
class Cpu
{
	double price;
	
	Cpu(double p)
	{
		price=p;
		
	}
	
	void cpudetails()
	{
		Processor p=new Processor();
		p.read();
		System.out.println("Price : "+p);
		Ram r=new Ram();
		r.get();
		p.display();
		r.display1();
	} 
	class Processor
	{
		int cores;
		String mft;
		void read()
		{
			System.out.println("...Enter the Procoessor Details...");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of cores : ");
			cores=sc.nextInt();
			System.out.println("Enter the manufacturer : ");
			mft=sc.next();
		}
		void display()
		{
			System.out.println("...Processor Details...");
			System.out.println("Number of cores : "+cores);
			System.out.println("Manufacturer : "+mft);
		}
	}
	static class Ram
	{
		String mem,man;
		void get()
		{
			System.out.println("...Enter the RAM Details...");
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the memory : ");
			mem=s.next();
			System.out.println("Enter the manufacturer : ");
			man=s.next();
		}
		void display1()
		{
			System.out.println("...RAM Details...");
			System.out.println("Memory : "+mem);
			System.out.println("Manufacturer : "+man);
		}
	}
}	
	
	
	
