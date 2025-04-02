package org.example.Homework.Lesson_07;

public class Employee {

  int id;
  public String surname;
  int age;
  private double salary;
  String department;

  public Employee(int id1) {
    this.id = id1;
  }

  Employee(String surname1) {
    this.surname = surname1;
  }

  private Employee(double salary1) {
    this.salary = salary1;
  }

  double udvoyeniyeZarplati(double salary){
    salary *= 2;
    return salary;
  }

  public void getId() {
    System.out.println("id: " + id);
  }

  public void getSurname() {
    System.out.println("surname: " + surname);
  }

  public void getSalary() {
    System.out.println("salary: " + salary);
  }

}
