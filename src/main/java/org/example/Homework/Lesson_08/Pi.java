package org.example.Homework.Lesson_08;

public class Pi {
  static final double pi = 3.14;

  double area(double radius) {
    return pi * radius * radius;
  }

  static double circumference(double radius) {
    return 2 * pi * radius;
  }

  void allInformation(double radius) {
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