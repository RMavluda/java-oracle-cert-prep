package org.example.Lesson08;

public class Car {

  String color = "blue";
  String engine = "V6";
}

class Human {

  String name = "Ivan";
  final Car c = new Car();

  public static void main(String[] args) {
    Human h1 = new Human();
/*    h1.c = new Car();
    h1.c = new Car();
    obyekt Car final bo`lganligi uchun murojaat qila olmaymiz
    */
    h1.c.engine = "V8";

  }
}
