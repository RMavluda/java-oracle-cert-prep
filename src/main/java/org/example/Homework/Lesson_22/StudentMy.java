package org.example.Homework.Lesson_22;

public class StudentMy {

  StringBuilder name;
  int course;
  int grade;

  StudentMy(StringBuilder name, int course, int grade) {
    this.name = name;
    this.course = course;
    this.grade = grade;
  }

  public boolean checkName(StringBuilder name) {
    return (name.length() < 3) ? false : true;
  }

  public boolean checkCourse(int course) {
    return (course < 1 || course > 4) ? false : true;
  }

  public boolean checkGrade(int grade) {
    return (grade < 1 || grade > 10) ? false : true;
  }

  public void showInfo(StudentMy student) {
    System.out.println(student.name);
    System.out.println(student.course);
    System.out.println(student.grade);
  }
}

class TestStudentMy {

  public static void main(String[] args) {
    StudentMy student = new StudentMy(new StringBuilder("Maksim"), 5, 8);
//    student.checkName(student.name);
//    student.checkCourse(student.course);
//    student.checkGrade(student.grade);

    if ((student.checkName(student.name) &
        student.checkCourse(student.course) &
        student.checkGrade(student.grade))) {
      student.showInfo(student);
    } else {
      System.out.println("Ma`lumot xato kiritilgan! Qaytadan kiriting");
    }
  }
}
