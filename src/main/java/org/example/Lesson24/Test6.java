package org.example.Lesson24;

public class Test6 {

}

interface In1{
  private static void method3(){
    System.out.println("In1 method3");
  }

  private void method4()
  {
    System.out.println("non-static method");
  }

//  private abstract void acc();

  default void method5(){
    method4();
    method3();
  }

  static void method6(){
//    method4();
    method3();
  }
}