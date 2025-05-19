import java.util.*;
class multiplication extends Thread
{
	public void run()
    	{
    		int n=5;
        	System.out.println("Multiplication table of 5:");
        	for(int i =0;i<10;i++)
        	{
            		System.out.println(n+" * "+i+" = "+n*i);
        	}
    	}
}

class primeno extends Thread
{
	private int num1;
    	public primeno(int num1)
    	{
        	this.num1=num1;
    	}
	public void run()
    	{
    		Prime(num1);
    	}
    	static void Prime(int num1)
    	{
        	System.out.println("All prime numbers within 1 and " +num1+ " are:");
        	for(int i=2;i<=num1;i++)
        	{
        		int count =0;
        		for(int j=2;j<=i/2;j++)
        		{
        			if(i%j==0)
        			{
        				count++;
        				break;
        			}
               		}
               		if(count==0)
               		{
               			System.out.println(i);
               		}
        	}
   	}
}
public class Threadclass
{
    	public static void main(String args[]) 
    	{
    		Scanner sc = new Scanner(System.in);
        	System.out.println("Enter the limit:");
        	int num1 = sc.nextInt();
        	primeno obj2= new primeno(num1);
        	obj2.start();
        	
        	try
        	{
        		obj2.sleep(1000);
        	}
        	catch(InterruptedException e)
        	{
        		System.out.println(e);
        	}
        	multiplication obj1 = new multiplication();
        	obj1.start();
    	}
}
