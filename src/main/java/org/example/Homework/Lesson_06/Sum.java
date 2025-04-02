package org.example.Homework.Lesson_06;

public class Sum {

  int sum() {
    int result = 0;
    System.out.println("Sum of all numbers: " + result);
    return result;
  }

  int sum(int a) {
    int result = a;
    System.out.println("Sum of all numbers: " + result);
    return result;
  }

  int sum(int a, int b) {
    int result = a + b;
    System.out.println("Sum of all numbers: " + result);
    return result;
  }

  int sum(int a, int b, int c) {
    int result = a + b + c;
    System.out.println("Sum of all numbers: " + result);
    return result;
  }

  int sum(int a, int b, int c, int d) {
    int result = a + b + c + d;
    System.out.println("Sum of all numbers: " + result);
    return result;
  }
}

class SumTest {

  public static void main(String[] args) {
    Sum obj = new Sum();
    obj.sum();
    obj.sum(1);
    obj.sum(1, 2);
    obj.sum(1, 2, 3);
    obj.sum(1, 2, 3, 4);

  }
}