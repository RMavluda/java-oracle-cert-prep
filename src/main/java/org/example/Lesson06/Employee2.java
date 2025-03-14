package org.example.Lesson06;

public class Employee2 {

  Employee2(int id2, String surname2, int age2) {
    this(id2, surname2, age2, 0.0, null);
  }

  Employee2(String surname3, int age3) {
    this(0, surname3, age3, 0.0, null);
  }

  Employee2(int id1, String surname1, int age1, double salary1, String department1) {
    id = id1;
    surname = surname1;
    age = age1;
    salary = salary1;
    department = department1;
  }

  int id;
  String surname;
  int age;
  double salary;
  String department;
}

class Employee2Test {

  public static void main(String[] args) {
    Employee2 emp = new Employee2(1, "Ivanov", 25);
    System.out.println(emp.surname);
    Employee2 emp2 = new Employee2("Petrov", 29);
    System.out.println(emp2.age);
    Employee2 emp3 = new Employee2(12, "Petrov", 40, 100.35, "Italy");
    System.out.println(emp3.salary);

  }

}