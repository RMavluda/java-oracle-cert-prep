package org.example.Lesson24;

public class Test3 {

}

class Employee {

  double slary = 100;
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

// interface faqatgina abstract classlarni o`zida saqlagani uchun -->
// interface dan implementatsiya olgan class ham abstract bo`lishi kerak.
class Teacher extends Employee implements Help_able {

  int kolichestvoUchenikov;

  void uchit() {
    System.out.println("Uchit");
  }

  //  qaysidir methodni overriding qilishda
//  farzand sinfidagi metod ota sinfidagidan kamida shunchalik ochiq yoki undan ham ochiqroq bo`lishi mumkin
//  bizdagi holat, ota class metodi default accesss modifier bo`lganligi uchun, undanda ochiqroq bo`lgan publicni yozganmiz
  public void pomosh() {
    System.out.println("Uchitel okazivayet pomosh");
  }

  public void tushitPojar() {
    System.out.println("Uchitel tushit pojar");
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

  public void tushitPojar() {
    System.out.println("Voditel tushit pojar");
  }

  public void swim() {
    System.out.println("Voditel mojet plavat");
  }

}

//INTERFACE O`ZIDA FAQAT ABSTRACT CLASSLARNI SAQLAY OLADI

interface Help_able {

  void pomosh();

  void tushitPojar();

//  interface dagi 'int a' kabi qiymatlar compile run bo`lganida
//  'public final static int a = 10' ga aylanadi
//  shu sababli ularni implementatsiya jarayonida qiymatini o`zgartirish mumkin emas

  int a = 10;
}

interface Swim_able {

  void swim();
}