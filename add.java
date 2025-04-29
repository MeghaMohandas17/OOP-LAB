package arithmetic;

public class add implements operations
{
	private double num1;
	private double num2;
	public add(double num1,double num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public double oprns()
	{
		return num1+num2;
	}
}
