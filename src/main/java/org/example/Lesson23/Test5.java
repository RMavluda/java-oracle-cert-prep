package org.example.Lesson23;

public class Test5 {

  Test5(){}
  public static void main(String[] args) {
    Employee2 emp = new Employee2();
    Teacher2 t = new Teacher2();
//    emp.sleep();
    t.sleep();
    Employee2 e = new Teacher2();
//    emp.sleep();
    e.sleep();

    System.out.println(e.salary);

  }

}

class Eda1 {

}

class Frukti1 extends Eda1 {

}


class Employee2 {

  double salary = 100;
  String name = "Kolya";

  //qaysidir sub-class ushbu metodni perezapisat qilmasligi uchun final qilish kerak bo`ladi
  final public Eda1 eat() {
    System.out.println("Kushatet rabotnik");
    Eda1 e = new Eda1();
    return e;
  }

  // sub-class bu methoddan inheritance - meros olib bilmidi, private bo`lganligi uchun
  final static void sleep() {
    System.out.println("Spit rabotnik");
  }
}

class Teacher2 extends Employee2 {

// final medotlarni perezapisat qilish mumkin emas
//  public Eda1 eat() {
//    return new Eda1();
//  }

  //agar super class final static bulsa, hiding qilish uchun ham perezapisat qilib bumidi
//  static void sleep() {
//    System.out.println("Spit uchitel");
//  }

  double salar = 200;

//Polymorphism faqat instance (non-static) metodlar uchun ishlaydi
//  static void sleep() {
//    System.out.println("Spit uchitel");
//  }

//  public Frukti1 eat() {
//    System.out.println("Kushatet uchitel");
//    Frukti1 f = new Frukti1();
//    return f;
//  }

  int kolvoUchenikov;

  void uchit() {
    System.out.println("Uchit");
  }

/*  public static void main(String[] args) {
    Teacher2 t = new Teacher2();
//    Teacher2 class da sleep method yo`q bo`lsa, ya`ni super-classda private bo`lganida bu chaqiruv ishlamidi
//    t.sleep();
  }*/
}

/*
final class T{}
//final class larni perezapisat qilish yani me`ros olish mumkin emas
class P extends T{}*/
