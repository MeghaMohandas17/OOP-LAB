package mcajava;
import arithmetic.*;
import java.util.*;
class aopackage
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); 
		Scanner in = new Scanner(System.in); 
        	int ch; 
 
        	do
        	 { 
			System.out.println("\nARITHMETIC OPERATIONS"); 
			System.out.println("1.Addition \n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
			System.out.println("Enter your choice:");
			ch = in.nextInt();  
			switch (ch) 
          	     	{ 
                			case 1: 
		           	 	System.out.println("Enter the first number :"); 
		            		double num1 = sc.nextDouble(); 
		             		System.out.println("Enter the second number :"); 
		            		double num2 = sc.nextDouble(); 
		            		add a=new add(num1,num2);
		             		System.out.println("Sum of given two numbers:"+a.oprns()); 
                   			break; 
                			case 2: 
                    			System.out.println("Enter the first number :"); 
                   	 		double num3 = sc.nextDouble(); 
                     			System.out.println("Enter the second number :"); 
                    			double num4= sc.nextDouble(); 
                    			sub s=new sub(num3,num4);
                    			System.out.println("Difference of given two numbers :"+s.oprns()); 
                    			break;
                  		case 3:
                   			System.out.println("Enter the first number :"); 
                    			double num5 = sc.nextDouble(); 
                     			System.out.println("Enter the second number :"); 
                    			double num6= sc.nextDouble(); 
                     			multi m=new multi(num5,num6);
                    			System.out.println("Product of given two numbers :"+m.oprns()); 
                  	  		break; 
                    		case 4:
                   			System.out.println("Enter the first number :"); 
                    			double num7 = sc.nextDouble(); 
                    	 		System.out.println("Enter the second number :"); 
                    			double num8= sc.nextDouble(); 
                    			div d=new div(num7,num8);
                    			System.out.println("Quotient of given two numbers :"+d.oprns()); 
                    			break; 
                			case 5: 
                   	 		System.out.println("Exiting..."); 
                    			break; 
                			default: 
                    			System.out.println("Invalid choice"); 
                    			break; 
           		 } 
        	} 
        	while (ch != 5); 
	}
}
