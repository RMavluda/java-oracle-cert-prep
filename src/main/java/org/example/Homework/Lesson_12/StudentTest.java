package org.example.Homework.Lesson_12;

import org.example.Lesson11.Student;

public class StudentTest {

  void checkStudent(Student s1, Student s2) {
    if(s1.getName().equals(s2.getName())){
      System.out.println("student1 name equals student2 name : " + s2.getName());
    }
    if(s1.getCourse() == s2.getCourse()){
      System.out.println("student1 course == student2 course : " + s2.getCourse());
    }
    if(s1.getGrade() == s2.getGrade()){
      System.out.println("student1 grade == student2 grade : " + s2.getGrade());
    }
  }

  public static void main(String[] args) {
    StudentTest st = new StudentTest();
    Student student1 = new Student("Malis", 4, 4.9);
    Student student2 = new Student("Kate", 2, 4.9);
    st.checkStudent(student1, student2);
  }
}


