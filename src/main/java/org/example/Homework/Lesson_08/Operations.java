package org.example.Homework.Lesson_08;

public class Operations{

  int multiply(int a, int b, int c){
    return a * b * c;
  }

  void division(int a, int b){
    System.out.println("butun qism: " + a / b);
    System.out.println("qoldiq qism: " + a % b);
  }
}
class OperationsTest{
  public static void main(String[] args){
    Operations ob = new Operations();
    ob.multiply(3, 4, 5);
    ob.division(3, 4);
    ob.multiply(6, 7, 8);
    ob.division(6, 7);
  }
}
