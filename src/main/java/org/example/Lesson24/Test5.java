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

class R implements I1, I2{

  public static void main(String[] args) {
    I1.def();
    I2.def();
  }
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
