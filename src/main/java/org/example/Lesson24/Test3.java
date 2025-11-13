package org.example.Lesson24;

public class Test3 {

  public static void main(String[] args) {
    Help_able h = new Driver();
    Swim_able s = new Driver();
    Employee e = new Driver();
    System.out.println(h.a);
//    System.out.println(h.salary);
    h.pomosh();
    h.tushitPojar("voda");
//    h.eat();
//    h.vodit();
    s.swim();

  }
}

class Employee {

  double salary = 100;
  String name = "Kolya";
  int age;
  int experience;

  void eat() {
    System.out.println("Kushat");
  }

  void sleep() {
    System.out.println("Spat");
  }
}


// class hohlagancha interface ni implementatsiya qila oladi
class Driver extends Employee implements Help_able, Swim_able {

  String nazvaniyeMashin;

  void vodit() {
    System.out.println("Vodit");
  }

  public void pomosh() {
    System.out.println("Voditel okazivayet pomosh");
    System.out.println(a);
//    a = 3;
  }

  public void tushitPojar(String s) {
    System.out.println("Voditel tushit pojar");
  }

  public void swim() {
    System.out.println("Voditel mojet plavat");
  }

}

// interface faqatgina abstract classlarni o`zida saqlagani uchun -->
// interface dan implementatsiya olgan class ham abstract bo`lishi kerak.
class Teacher extends Employee implements Help_able {

  int kolichestvoUchenikov;

  void uchit() {
    System.out.println("Uchit");
  }

  //  qaysidir methodni overriding qilishda
//  farzand sinfidagi metod ota sinfidagidan kamida shunchalik ochiq yoki undan ham ochiqroq bo`lishi mumkin
//  bizdagi holat, ota class metodi public accesss modifier bo`lganligi uchun, publicni yozganmiz
//  chunki interface public dan boshqa access modifier qabul qilmidi
  public void pomosh() {
    System.out.println("Uchitel okazivayet pomosh");
  }

  public void tushitPojar(String s) {
    System.out.println("Uchitel tushit pojar");
  }
}

//INTERFACE O`ZIDA FAQAT ABSTRACT CLASSLARNI SAQLAY OLADI

interface Help_able {

  void pomosh();

  void tushitPojar(String predmet);

//  interface dagi 'int a' kabi qiymatlar compile run bo`lganida
//  'public final static int a = 10' ga aylanadi
//  shu sababli ularni implementatsiya jarayonida qiymatini o`zgartirish mumkin emas

  int a = 10;
}

interface Swim_able {

  void swim();
}

abstract class Y implements Swim_able {

}

abstract class Xx extends Y {

}

class Z extends Y {

  public void swim() {

  }
}