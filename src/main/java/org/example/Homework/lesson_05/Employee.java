package org.example.Homework.lesson_05;

public class Employee {

  Employee(int id1, String surname1, int age1, int salary1, String department1) {
    id = id1;
    surname = surname1;
    age = age1;
    salary = salary1;
    department = department1;
  }

  int id;
  String surname;
  int age;
  int salary;
  String department;

  void salaryIncrease() {
    salary *= 2;
  }
}

class EmployeeTest {

  public static void main(String[] args) {
    Employee employee1 = new Employee(1, "John", 26, 1200, "Tech Support");
    Employee employee2 = new Employee(2, "Maria", 26, 2500, "Management");
    employee1.salaryIncrease();
    employee2.salaryIncrease();
    System.out.println("John`s salary: " + employee1.salary);
    System.out.println("Maria`s salary: " + employee2.salary);
  }
}
