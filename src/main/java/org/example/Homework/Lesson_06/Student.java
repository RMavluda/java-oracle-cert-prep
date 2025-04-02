package org.example.Homework.Lesson_06;

public class Student {


  Student(int studentId1, String firstName1, String lastName1, int course1,
      Double averageGradeInMath1, Double averageGradeInEconomics1,
      Double averageGradeInForeignLanguage1) {
    studentId = studentId1;
    firstName = firstName1;
    lastName = lastName1;
    course = course1;
    averageGradeInMath = averageGradeInMath1;
    averageGradeInEconomics = averageGradeInEconomics1;
    averageGradeInForeignLanguage = averageGradeInForeignLanguage1;
  }

  Student(int studentId1, String firsName1, String lastName1, int course1) {
    this(studentId1, firsName1, lastName1, course1, 0.0, 0.0, 0.0);
  }

  Student() {
  }

  int studentId;
  String firstName;
  String lastName;
  int course;
  Double averageGradeInMath;
  Double averageGradeInEconomics;
  Double averageGradeInForeignLanguage;
}

class StudentTest {

  double arithmeticMean(Student student) {
    double arMean = (student.averageGradeInEconomics + student.averageGradeInMath
        + student.averageGradeInForeignLanguage) / 3;
    System.out.println(student.firstName + " " + student.lastName + " " + arMean);
    return arMean;
  }

  public static void main(String[] args) {
    Student s1 = new Student(1, "John", "Smith", 2, 3.5, 5.5, 6.0);

    Student s2 = new Student(2, "Dali", "Ben", 3);
    s2.averageGradeInMath = 4.0;
    s2.averageGradeInEconomics = 5.0;
    s2.averageGradeInForeignLanguage = 6.0;

    Student s3 = new Student();
    s3.studentId = 3;
    s3.firstName = "Natali";
    s3.lastName = "Wit";
    s3.course = 4;
    s3.averageGradeInMath = 4.5;
    s3.averageGradeInEconomics = 5.0;
    s3.averageGradeInForeignLanguage = 7.0;

    StudentTest sTest = new StudentTest();
    sTest.arithmeticMean(s1);
    sTest.arithmeticMean(s2);
    sTest.arithmeticMean(s3);
  }
}
