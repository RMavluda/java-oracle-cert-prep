package org.example.Lesson3;

public class Test6 {
  public static void main(String[] args){
    int a = 2;
    int b = 3;
    int c = 5;

    boolean b1 = a > b;
    System.out.println("a>b " + b1);
    boolean b2 = b <= c;
    System.out.println("b<=c " + b2);
    boolean b3 = c == b;
    System.out.println("c==b " + b3);
    System.out.println(c=b);
    boolean b4 = c != b;
    System.out.println("c!=b " + b4);

    System.out.println("Short circuits");

    boolean x = false;
    boolean y = false;
    boolean z = false;

    boolean result1 = x&&y&&z;
    boolean result2 = x||y||z;

    System.out.println(result1);
    System.out.println(result2);
  }
}
