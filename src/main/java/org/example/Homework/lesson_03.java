package org.example.Homework;

public class lesson_03 {

  public static void main(String[] args) {
    System.out.println("task 1:");
    int i1 = 5;
    int i2 = 11;
    double d1 = 5.5;
    double d2 = 1.3;
    long l = 20l;
    double result = 0;
    result = i2 / d1 + d2 % i1 - l;
    System.out.println(i2 / d1);
    System.out.println(d2 % i1);
    System.out.println(result);
    System.out.println("task 2a:");
    int a = 5;
    a = a-- - --a + ++a + a++ + a;
    System.out.println(a);
    int b = 8;
    b = ++b - b++ + ++b - --b;
    System.out.println(b);
  }
}
