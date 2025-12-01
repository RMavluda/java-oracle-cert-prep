package org.example.Lesson24;

public class Test5 {

}

interface I1 {

  default void abc() {
    System.out.println("eto metod abc");
  }

  static void def() {
    System.out.println("static metod");
  }

//  void abc();
  // interface dagi method oldida yozilgan default bu access modifier ni anglatmidi
  // ushbu default shuni anglatadiki -> ushbu methodda default realizatsiya mavjud deganidir

//  default void ghi() {
//    System.out.println("eto method ghi");
//  }

//  default void def() {
//    System.out.println("def");
//  }
}

interface I2 {

  static void def() {
    System.out.println("static metod 2");
  }

//  void abc();
}

abstract class O {

}

class R extends O implements I1 {

  static I2 method1(I2 i) {
    return new D2();
  }

  O method2() {
    return new R();
  }

  public static void main(String[] args) {
    I2 i = new D2();
    method1(i);
  }
}

class D2 implements I2 {

}

//class Z2 implements I1 {
//
//  public void abc() {
//    System.out.println("eto metod abc");
//  }
//
//  public static void main(String[] args) {
//    Z2 z = new Z2();
//    z.abc();
//    z.def();
//    z.ghi();
//  }
//
//  // interface dagi barcha methodlar access modifieri public hisoblanadi
//  public void ght() {
//    System.out.println("Eto metod ghi");
//  }
//}
