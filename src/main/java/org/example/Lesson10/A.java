package org.example.Lesson10;

import org.example.Lesson09.*;
import java.lang.*; //String,System...... ushbu class auto import qilinadi
//import org.example.Lesson09.Car;
//import org.example.Lesson09.Student;
//import org.example.Lesson08.*;
// agar ikkala(Lesson09 va Lesson08) package da ham bir xil class bo`lsa, bu holatda error bo`ladi.
// chunki kompilyator qaysi package dagi class ni tanlashni bilmidi
// yechim classs nomini ham obyekt yaratish jarayonida yozish kerak

public class A {

  public static void main(String[] args) {
//    org.example.Lesson09.Car c1 = new org.example.Lesson09.Car("red", "V9");
//    Car c2 = new Car("black", "V4");
//    org.example.Lesson09.Student st1 = new org.example.Lesson09.Student();
    String st1 = new String("hello");
    Student st2 = new Student();
    System.out.println(st2.z);
    System.out.println(Student.c);
  }

}

class B {
  Student st3 = new Student();
}

