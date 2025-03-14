package org.example.Lesson06;

public class Employee {

  Employee(int id2, String surname2, int age2) {
    this(surname2, age2);
    age = age2;
  }

  Employee(String surname2, int id2) {
    surname = surname2;
    id = id2;
  }

  Employee(int id2, String surname2, int age2, double salary2, String department2) {
    this(id2, surname2, age2);
 /*
 !!overloaded constructorni chaqirib olish uchun this birinchi qatorda yozilishi ekrak
 this(surname2, age2);
 * */
    salary = salary2;
    department = department2;
  }

  int id;
  String surname;
  int age;
  double salary;
  String department;
}

class EmployeeTest {

  public static void main(String[] args) {
    Employee emp = new Employee(1, "Ivanov", 25);
    System.out.println(emp.surname);
    Employee emp2 = new Employee("Petrov", 29);
    System.out.println(emp2.id);
    Employee emp3 = new Employee(12, "Petrov", 40, 100.35, "Italy");
    System.out.println(emp3.salary);

  }

}

/*

    Employee(int id2, String surname2, int age2) {
    Employee(surname2, age2);
    age = age2;
  }

  Employee(String surname2, int id2) {
    surname = surname2;
    id = id2;

    !!constructor ichida unga overloading bo`lgan boshqaconstructorni chaqirib olib ishlatish mumkin emas
    !!kompilyator bunga ruhsat bermidi
    Uni o`rniga this.(...) bilan ishaltish to`hg`ri bo`ladi
  }*/


  /*
  public   Employee(int id2, String surname2, int age2) {
    id = id2;
    surname = surname2;
    age = age2;
  }

  protected Employee(int id2, String surname2, int age2) {
    System.out.println("Hellooo");
  }

  !!huddi metodlardagi kabi, ushbu ko`rinishda constructor ham yaratib bo`midi.
  !!constructorlar nomi yoki parametrlari bilan farqli bo`lishi shart
    */