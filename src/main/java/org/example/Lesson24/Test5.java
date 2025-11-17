package org.example.Lesson24;

public class Test5 {

}

interface I1 {

  void abc();

  default void def() {
    System.out.println("def");
  }
}

class Z2 implements I1 {

  public void abc() {
    System.out.println("eto metod abc");
  }
}
