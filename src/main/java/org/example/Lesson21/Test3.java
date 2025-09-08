package org.example.Lesson21;

public class Test3 {

  Test3() {
    System.out.println("Eto constructor");
  }

  void Test3() { // eto uje ne construktor
    System.out.println("Eto metod Test3");
  }

//  int Test3 = 5;
  Test3 Test3;
  /*
   * o`zgaruvchi nomi class nomi bilan bir xil bo`lishi mumkin
   * */
}

class A {

  public static void main(String[] args) {
    Test3 t = new Test3();
  }
}