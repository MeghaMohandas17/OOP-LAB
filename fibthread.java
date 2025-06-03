import java.util.*;
class fibonacci implements Runnable
{
    int n;
    public fibonacci(int n)
    {
        this.n=n;
    }
    public void run()
    {
        int a=0,b=1;
        System.out.println("Fibonacci numbers are:");
        for(int i=0;i<n;i++)
        {
            System.out.println(a);
            int next=a+b;
            a=b;
            b=next;
        }
    }
}
class even implements Runnable 
{
    int n;
    public even(int n)
    {
        this.n=n;
    }
    public void run()
    {
        System.out.println("Even numbers are:");
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}
public class fibthread
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        int n=sc.nextInt();
        fibonacci obj1=new fibonacci(n);
        Thread t1=new Thread(obj1);
        t1.start();
        try 
        {
            t1.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        even obj2=new even(n);
        Thread t2=new Thread(obj2);
        t2.start();
    }
}
