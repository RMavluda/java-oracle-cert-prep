package org.example.Homework.Lesson_08;

public class Operations{

  static double multiply(double a, double b, double c){
    return a * b * c;
  }

  static void division(int a, int b){
    System.out.println("whole quotient: " + a / b + ", remainder: " + a % b);
  }
}
class OperationsTest{
  public static void main(String[] args){
    System.out.println(Operations.multiply(2, 3, 4));
    Operations.division(9, 2);
    System.out.println(Operations.multiply(2.5, 3.5, 4.5));
    Operations.division(23, 5);
  }
}
