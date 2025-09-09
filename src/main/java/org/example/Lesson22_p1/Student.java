package org.example.Lesson22_p1;

import org.example.Lesson22.Human;

public class Student extends Human {

  public static void main(String[] args) {
    Student s = new Student();
    System.out.println(s.name);
    System.out.println(Student.salary);
    s.work();
    Student.rest();

  }
}