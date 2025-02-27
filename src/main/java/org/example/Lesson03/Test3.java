package org.example.Lesson03;

public class Test3 {

  public static void main(String[] args) {
    long a = 100L;

    // int b = a; Error
    int b = 10;

    // short c = b; Error

    short c = 7;

    a = b;

    long d = c;

    float f1 = 3.14F;
    double d1 = 1.23;
    float f2 = a;
    double d2 = a;

    d1 = f1;



  /*int a = 3;
  int b = 50;
  int c = 0;

  a = b = c = 18;


  System.out.println(a);
  System.out.println(b);
  System.out.println(c);*/
  }


}
