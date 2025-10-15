package org.example.Lesson23;

public class Test5 {

  public static void main(String[] args) {
    Employee2 emp = new Employee2();
    Teacher2 t = new Teacher2();
//    emp.sleep();
    t.sleep();
    Employee2 e = new Teacher2();
//    emp.sleep();
    e.sleep();

  }

}

class Eda1 {

}

class Frukti1 extends Eda1 {

}


class Employee2 {

  double salary = 100;
  String name = "Kolya";

  public Eda1 eat() {
    System.out.println("Kushatet rabotnik");
    Eda1 e = new Eda1();
    return e;
  }

// sub-class bu methoddan inheritance - meros olib bilmidi, private bo`lganligi uchun
  static void sleep() {
    System.out.println("Spit rabotnik");
  }
}

class Teacher2 extends Employee2 {

//Polymorphism faqat instance (non-static) metodlar uchun ishlaydi
  static void sleep(){
    System.out.println("Spit uchitel");
  }

  public Frukti1 eat() {
    System.out.println("Kushatet uchitel");
    Frukti1 f = new Frukti1();
    return f;
  }

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