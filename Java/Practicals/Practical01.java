package Java.Practicals;
/*
a)Write a Java program that takes a number as input and prints its multiplication table up to 10. 
b)Write a Java program to print the area and perimeter of a circle (use of constants). 
*/

import java.util.Scanner;

class Table {
  public int num;

  public void printTable() {
    for (int i = 1; i < 11; i++) {
      System.out.println(num + "x" + i + " = " + (i * num));
    }
  }
}

class Circle {
  final float pie = 3.14f;
  public double radii;

  public double perimeter() {
    return (2 * pie * radii);
  }

  public double area() {
    return (pie * radii * radii);
  }
}

class Practical01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    Table table = new Table();
    table.num = num;
    table.printTable();

    System.out.print("Enter radii: ");
    int radii = sc.nextInt();
    Circle circle = new Circle();
    circle.radii = radii;
    System.out.println("Perimeter: " + (circle.perimeter()));
    System.out.println("Area: " + (circle.area()));
  }

}