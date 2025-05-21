import java.io.*;
import java.util.*;
class file3mod
{
	public static void main(String args[])
	{
		try
		{
			FileReader f1=new FileReader("numbers.txt");
			FileWriter f2=new FileWriter("even.txt");
			FileWriter f3=new FileWriter("odd.txt");
	
			int i;
			Scanner sc=new Scanner(f1);
			String s=sc.nextLine();
			StringTokenizer st=new StringTokenizer(s," ");
			while(st.hasMoreTokens())
			{
				String str=st.nextToken();
				i=Integer.parseInt(str);
				if(i%2==0)
				{
					f2.write(str);
					f2.write(" ");
				}
				else
				{
					f3.write(str);
					f3.write(" ");
				}
			}
			f1.close();
			f2.close();
			f3.close();	
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
