package org.example.Homework.Lesson_08;

public class Pi {
  public static final double pi = 3.14;

  public double area(double radius) {
    return pi * radius * radius;
  }

  public static double circumference(double radius) {
    return 2 * pi * radius;
  }

  public void allInformation(double radius) {
    System.out.println("Radius: " + radius);
    System.out.println("Area " + area(radius));
    System.out.println("Circumference " + circumference(radius));
  }

}
class PiTest{
  public static void main(String[] args) {
    Pi pi = new Pi();
    pi.allInformation(5);
  }
}