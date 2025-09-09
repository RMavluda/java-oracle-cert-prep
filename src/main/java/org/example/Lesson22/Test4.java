package org.example.Lesson22;

public class Test4 {

}

class Human2 {

  Human2() {
  }
//  Human2(String n) {
//    this(n, null);
//  }
//
//  Human2(String n, String s) {
//    this.name = n;
//    this.surname = s;
//  }

  String name = "Kolya";
  String surname = "Kolya";

}

class Student2 extends Human2 {

  Student2() {
    super();
  }

  public static void main(String[] args) {
    Student2 s = new Student2();
  }
}