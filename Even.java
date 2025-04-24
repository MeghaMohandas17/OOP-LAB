class Evennum extends Thread
{
	public void run()
	{
		System.out.println("Even numbers are:");
		for(int i=0;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
public class Even
{
	public static void main(String args[])
	{
		Evennum even=new Evennum();
		even.start();
	}
}

