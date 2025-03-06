import java.util.Scanner;
import java.util.Arrays;

public class sort 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of strings:");
        int n = sc.nextInt();  
	sc.nextLine();       
        String[] strings = new String[n];
        System.out.println("Enter the strings:");
        for(int i=0;i<n;i++) 
        {
            strings[i]=sc.nextLine();
        }

        // Sort strings using compareTo() method
        for (int i=0;i<n-1;i++) 
        {
            for (int j=i+1;j<n;j++) 
            {
                if (strings[i].compareTo(strings[j]) > 0) 
                {
                    // Swap strings[i] and strings[j]
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }

         // Display sorted strings
        System.out.println("\nSorted Strings:");
        for (String str : strings) 
        {
            System.out.println(str);
        }
    }
}
