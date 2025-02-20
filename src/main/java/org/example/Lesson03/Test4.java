package org.example.Lesson03;

public class Test4 {

  public static void main(String[] args) {

/*
Unary operations
++ prefix
-- postfix
*/
    int x = 5;
    int y = 3;
    int z = x - ++y;
    System.out.println("z = " + z);
    System.out.println("y = " + y);
    int a = 5;
    int b = ++a - --a - a-- + a++;
    System.out.println("b = " + b);
    System.out.println("a = " + a);

/*
    double a = 5.5;
    double b = 3.5;

    double c = a % b;
    System.out.println(c);
*/

/*
    int a = 11;
    int b = 3;

    int wholePart = a / b;
    int remainder = a % b;

    System.out.println(wholePart);
    System.out.println(remainder);
*/
  }
}
