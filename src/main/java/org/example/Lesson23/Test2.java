package org.example.Lesson23;

public class Test2 {

  public Object abc() {
    return new Doctor();
  }

  public Object abc2() {
    return new int[]{1, 2, 3};
  }

  public static void main(String[] args) {
    Doctor d = new Doctor();
    Teacher t = new Teacher();
    Driver dr = new Driver();
    Employee e = new Employee();

    Employee emp1 = new Doctor();
    System.out.println(emp1.salary);
    System.out.println(emp1.name);
    System.out.println(emp1.age);
    System.out.println(emp1.experience);
    emp1.eat();
    emp1.sleep();
//    emp1.lechit();

    Employee emp2 = new Teacher();
    Employee emp3 = new Driver();
    Xirurg x = new Xirurg();
    Doctor d2 = new Xirurg();
    System.out.println(d2.experience);
    d2.eat();
    d2.sleep();
    d2.lechit();
//    d2.operatsiya();
    Employee emp4 = new Teacher();
    emp4.eat();
    emp4.sleep();
//    System.out.println(emp4.skalpel);
//  emp4.operatsiya();
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

class Doctor extends Employee {

  void lechit() {
    System.out.println("Lechit");
  }
}

class Teacher extends Employee {

  int kolichestvoUchenikov;

  void uchit() {
    System.out.println("Uchit");
  }
}

class Driver extends Employee {

  String nazvaniyeMashin;

  void vodit() {
    System.out.println("Vodit");
  }
}

class Xirurg extends Doctor {

  String skalpel;

  void operatsiya() {
  }
}