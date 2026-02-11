package org.example.Lesson28;

public class Test11 {

  void abc() {
    System.out.println("method abc");
    throw new StackOverflowError();
  }

  void def() {
    try {
      abc();
      return;
    } finally {
      System.out.println("This is finally block");
    }
  }

  public static void main(String[] args) {
    Test11 t = new Test11();
    t.def();
  }
}
