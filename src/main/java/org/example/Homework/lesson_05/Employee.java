package org.example.Homework.lesson_05;

public class Employee {

  int id;
  String surname;
  int age;
  int salary;
  String department;

  Employee(int id1, String surname1, int age1, int salary1, String department1) {
    id = id1;
    surname = surname1;
    age = age1;
    salary = salary1;
    department = department1;
  }

  double salaryIncrease() {
    salary *= 2;
    return salary;
  }
}

class EmployeeTest {

  public static void main(String[] args) {
    Employee employee1 = new Employee(1, "John", 26, 1200, "Tech Support");
    Employee employee2 = new Employee(2, "Maria", 26, 2500, "Management");
    employee1.salaryIncrease();
    System.out.println(employee1.surname + "`s salary: " + employee1.salary);
    employee2.salaryIncrease();
    System.out.println(employee2.surname + "`s salary: " + employee2.salary);
  }
}
