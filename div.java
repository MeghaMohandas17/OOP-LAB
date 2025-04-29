package arithmetic;

public class div implements operations
{
	private double num1;
	private double num2;
	public div(double num1,double num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public double oprns()
	{
		return num1/num2;
	}
}
