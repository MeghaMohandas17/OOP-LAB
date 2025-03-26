Teacher1.java:

import java.util.Scanner;

class Person {

String name;

String gender;

String address;

int age;
Person(){

Scanner sc = new Scanner(System.in);

System.out.println("Enter Name");

name=sc.next();

System.out.println("Enter Gender");

gender sc.next();

System.out.println("Enter Address");

address sc.next();

System.out.println("Enter Age");

age sc.nextint();
}
}
class Employee extends Person (
{
you are empid;

String compname, quali;

float salary;

Employee() [

Scanner x = new Scanner(System.in);

System.out.println("Enter Employee ID");

empidx.nextInt();

System.out.println("Enter Company Name");

compname = x.next();

System.out.println("Enter Qualification");

which x.next();

System.out.println("Enter Salary");

salary = x.nextFloat();
}}

class Teachert extends Employee {
{
String subject, department;

int teacherid;

Teacher() [

Scanner x = new Scanner(System.in);

System.out.println("Enter Subject"); System.out.println("Enter Department");

subject = x.next();

departments.next();

System.out.println("Enter Teacher ID");

teacherid=x.nextInt();
}
void display() {

System.out.println("NAME:" + name);

System.out.println("GENDER:"gender);

System.out.println("ADDRESS:" address); System.out.println("AGE:"age);

System.out.println("EMPLOYEE ID: " + empid);

System.out.printin("COMPANY NAME:" compname); System.out.println("QUALIFICATION:+quali);

System.out.println("SALARY:" + salary);

System.out.println("SUBJECT:" subject);

System.out.println("DEPARTMENT:" department);

System.out.println("TEACHER ID: teacherid + "\n");
}
public static void main(String[] args) {

int n;

Scanner y = new Scanner(System.in);

System.out.println("Enter number of teachers:");

n=y.nextInt()

Teachert[] teachers = new Teacher[n];

for (int i = 0; i < n; i++)
{
teachers[i] = new Teacher();
}
System.out.println("DETAILS:\n");

for (int i = 0; i < n; i++) {

teachers[i].display();
}}}

