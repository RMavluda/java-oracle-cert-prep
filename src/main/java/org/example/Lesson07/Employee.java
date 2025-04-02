package org.example.Lesson07;

public class Employee {

  public double salary;

  public void dvoynayaZP() {
    System.out.println("Novaya Z/p: " + salary * 2);
  }

  public Employee(double salary2) {
    salary = salary2;
  }

}

class EmployeeTest {

  public static void main(String[] args) {
    Employee emp = new Employee(500);
    System.out.println(emp.salary);
    emp.dvoynayaZP();
  }
}

/*
* private double salary;

  private void dvoynayaZP() {
    System.out.println("Novaya Z/p: " + salary * 2);
  }

  private Employee(double salary2) {
    salary = salary2;
  }
  *
  * private ga o`zgartirishimiz bilan hattoki shu fayl ichidagi EmployeeTest class uchun ham dostup yopiladi. Ya`ni private har qanday class uchun dostup yo`qligini anglatadi*/