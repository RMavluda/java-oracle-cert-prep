package org.example.Lesson16;

public class Test4 {


}

class Employee {

  double salary;
  boolean isManager;

  Employee(double salary, boolean isManager) {
    this.salary = salary;
    this.isManager = isManager;
  }
}

class TestEmployee{

  public static void main(String[] args) {
    Employee emp = new Employee(1000.5, true);
    //System.out.println(emp.isManager + emp.salary);
    /*
    * 1-type: boolean
    * 2-type: double
    * ularni qo`shish mumkin emas*/
    System.out.println("On manager: " + emp.isManager + " Salary: " + emp.salary);
  }
}
