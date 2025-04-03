import java.util.Scanner; 
 
interface Sports 
{ 
    public void sportsGetData(); 
    public void sportsDispData(); 
} 
 
class Student 
{ 
    String name; 
    int roll_no; 
    int S1,S2; 
 
    Student(String name, int roll_no, int S1, int S2) 
 { 
        this.name = name; 
        this.roll_no = roll_no; 
        this.S1 = S1; 
        this.S2 = S2; 
    } 
} 
 
class Result extends Student implements Sports 
{ 
    int rank; 
    String item; 
    Scanner in = new Scanner(System.in); 
    Result(String name, int roll_no, int S1, int S2) 
    { 
        super(name, roll_no, S1, S2); 
    } 
 
    void acadamic() 
    { 
        int percentage = (S1+S2)*100/200; 
        System.out.print("Percentage:" + percentage); 
    } 
 
    public void sportsGetData() 
    { 
        System.out.print("Enter the sports item name:"); 
        item = in.nextLine(); 
        System.out.print("Enter the rank in sports:"); 
        rank = in.nextInt(); 
    } 
 
    public void sportsDispData() 
    { 
        System.out.println("Sports item :" + item); 
        System.out.print("Rank : "+ rank); 
    } 
 
} 
 
class Studentresult 
{ 
    public static void main(String args[]) 
    { 
        Scanner in = new Scanner(System.in); 
 
        System.out.print("Enter the student name: "); 
        String name = in.nextLine(); 
        System.out.print("Enter Roll no:"); 
        int roll = in.nextInt(); 
        System.out.print("Enter mark in first subject: "); 
        int S1 = in.nextInt(); 
        System.out.print("Enter mark in second subject: "); 
        int S2 = in.nextInt(); 
         
        Result r = new Result(name,roll,S1,S2); 
        r.sportsGetData(); 
         
        r.acadamic(); 
        System.out.println(); 
        r.sportsDispData(); 
 
    } 
} 
