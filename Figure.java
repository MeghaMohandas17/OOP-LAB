package graphics;

public interface Figure {

double area();

}

class Rectangle implements Figure {

private double length;

private double breadth;

public Rectangle(double length, double breadth) { 

this.length = length;

this.breadth = breadth;
}
public double area() {

return length * breadth; }


}

class Triangle implements Figure 
{

  private double base;

  private double height;

public Triangle(double base, double height) 
{ 
  this.base = base; this.height = height;
}

public double area() 
{ 
  return 0.5* base * height;
}
}

class Square implements Figure
{ 
  private double side;

  public Square(double side) 
  { 
    this.side = side; 
  }

public double area() 
{ 
  return side * side; 
}
}

class Circle implements Figure
{ 
  private double radius;

  public Circle(double radius) 
  { 
    this.radius = radius; 
  }

public double area()
{ 
    return Math.PI* radius * radius; 
}

}

TestGraphics.java

import graphics.*;

import java.util.Scanner;

public class TestGraphics 
{ 
  public static void main(String[] args) 
  { 
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter length and breadth of the rectangle: ");

    double length = scanner.nextDouble(); double breadth = scanner.nextDouble(); 
    Rectangle rectangle = new Rectangle(length, breadth);

    System.out.println("Area of Rectangle: " + rectangle.area());

    System.out.print("Enter base and height of the triangle: ");

    double base = scanner.nextDouble(); 
    double height = scanner.nextDouble(); 
    Triangle triangle = new Triangle(base, height); 
    System.out.println("Area of Triangle: " + triangle.area());

    System.out.print("Enter side of the square: ");

    double side = scanner.nextDouble();

    Square square = new Square(side);

    System.out.println("Area of Square: " + square.area());

    System.out.print("Enter radius of the circle: ");

    double radius = scanner.nextDouble();

    Circle circle = new Circle(radius);

    System.out.println("Area of Circle: " + circle.area());

    scanner.close();

}

}
