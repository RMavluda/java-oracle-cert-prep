package org.example.Lesson14;

public class Test2 {

  public static void main(String[] args) {
//    for (int i = 5, j = 10; i < 11 && i > 2 && i > -4; i++, j = j + 20, abc(10)) {
//      System.out.println(i);
//    }
//    System.out.println("\nloop 2:\n");
//    for (int i = 5; i < 11; i++, abc(10)) {
//      System.out.println(i);
//    }
//    System.out.println("\nloop 3:\n");
    for (int i = 5; i < 11; i++) {
      System.out.println(i);
      abc(10);
    }
  }

  static void abc(int n) {
    System.out.println(n);
  }
}
