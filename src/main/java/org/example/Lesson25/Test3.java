package org.example.Lesson25;

public class Test3 {

  public static void main(String[] args) {

    Employee3 emp1 = new Doctor4();
    Employee3 emp2 = new Teacher3();
    Employee3 emp3 = new Driver();
    Doctor4 d1 = (Doctor4)emp1;

    System.out.println(d1.specializatsiya);
    System.out.println(((Doctor4) emp1).specializatsiya);

/**
 * "compile menga ishon emp1 tye i Doctor4" degan manoni bildiradi )))
 * qachonki Employee Doctor4 bo`la olganidagina ruhsat beriladi. xar doim emas, ammo bo`lishi mumkin
 * ammo:
 * System.out.println(((Test3) emp1).specializatsiya);
 * kabi holatalr uchun ruhsat berilmidi.
 * chunki Test3 va Employee orasida hech qanday IS-A(implementatsiya) bog`liqligi bo`lishi mumkin emas
 */
    d1.lechit();

/**
* quyida "kompilyator menga ishon emp2 bu Doctor4" kabi holat
 * !!! compile error paytida bu xatolik ko`rsatmidi, faqatgina run time vaqtidagina ClassCastException xatoligi bo`ladi
 *
 * compilyatorni aldash mumkin, ammo runTime ni aldab bo`lmidi )
* */
    ((Doctor4) emp2).lechit();
  }
}

class Employee3 extends java.lang.Object { // auto extends olingan bo`ladi

  double salary;
  String name;
  int age;
  int experience;

  void eat() {
    System.out.println("Kushat");
  }

  void sleep() {
    System.out.println("Spat");
  }
}

class Doctor4 extends Employee3 {

  String specializatsiya = "xirurg";

  void lechit() {
    System.out.println("lechit");
  }
}

class Teacher3 extends Employee3 {

  int kolvoUchenikov;

  void uchit() {
    System.out.println("uchit");
  }

}

class Dentist extends Doctor4 {

}

