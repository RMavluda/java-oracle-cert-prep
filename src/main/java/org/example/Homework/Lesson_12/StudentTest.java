package org.example.Homework.Lesson_12;

import org.example.Lesson11.Student;

public class StudentTest {

  public static void method1(Student s1, Student s2) {
    if (s1.name.equals(s2.getName()) && s1.course == s2.course && s1.grade == s2.grade) {
      System.out.println("Students are the same");
    } else {
      System.out.println("Students are not the same");
    }
  }

  public static void method2(Student s1, Student s2) {
    if (s1.name.equals(s2.getName())) {
      if (s1.course == s2.course) {
        if (s1.grade == s2.grade) {
          System.out.println("The names of the students, courses and grades are the same");
        } else {
          System.out.println(
              "The students' names and course are the same, but the grades are different");
        }
      } else {
        System.out.println("The students' names are the same, but the courses are different");
      }
    } else {
      System.out.println("The students' names differ");
    }
  }

  public static void main(String[] args) {
    Student student1 = new Student("Malis", 4, 4.9);
    Student student2 = new Student("Malis", 4, 4.9);
    method1(student1, student2);
    method2(student1, student2);
  }
}


