package org.example.Homework.Lesson_07_1;

public class EmployeeTest {

  public static void main(String[] args) {
    org.example.Homework.Lesson_07.Employee emp1 = new org.example.Homework.Lesson_07.Employee(2);
//    org.example.Homework.Lesson_07.Employee emp2 = new org.example.Homework.Lesson_07.Employee("Maria");
//    org.example.Homework.Lesson_07.Employee emp3 = new org.example.Homework.Lesson_07.Employee(500.0);

//    System.out.println(emp1.id);
    System.out.println(emp1.surname);
//    System.out.println(emp1.salary);

    emp1.getId();
    emp1.getSurname();
    emp1.getSalary();
  }
}
