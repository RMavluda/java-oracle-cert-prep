package org.example.Lesson11;

public class Employee {
  public String name;
  public double salary;

  Employee(String name, double salary){
    this.name = name;
    this.salary = salary;
  }

  public double increase(double a){
    a = a * 2;
    return a;
  }

  public double salaryX2(){
    salary = salary * 2;
    return salary;
  }
}

class EmployeeTest{
  public static void main(String[] args) {
    Employee e1 = new Employee("Ivan", 100.55);
    double d = e1.increase(e1.salary);
    System.out.println(d);
    System.out.println(e1.salary);
    e1.salaryX2();
    System.out.println(e1.salary);
  }
}

//metod argumentlari primitive data types (int, double,....) va reference data types bo`lishi mumkin