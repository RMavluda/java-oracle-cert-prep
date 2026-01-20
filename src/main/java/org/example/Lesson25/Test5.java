package org.example.Lesson25;

public class Test5 {


}
class Test10{
  int a = 5;
  void abc(){
    System.out.println("ok1");
  }
}

class Test20 extends Test10{
  int a = 10;
  void abc(){
    System.out.println("ok2");
  }
}

class Test30 extends Test20{
//  int a = 15;
  void abc(){
//    super.super.abc();
    super.abc();  // ok2
    System.out.println("ok3"); // ok3
  }

  public static void main(String[] args) {
    Test30 t = new Test30();
    System.out.println(((Test10)t).a);
    ((Test10)t).abc();
  }
}