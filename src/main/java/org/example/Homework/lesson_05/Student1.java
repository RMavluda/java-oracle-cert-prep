package org.example.Homework.lesson_05;

import java.time.LocalDate;

public class Student1 {

  Long studentCardNumber;
  String firstName;
  String lastName;
  LocalDate yearOfStudy;
  Double averageGradeInMath;
  Double averageGradeInEconomics;
  Double averageGradeInForeignLanguage;

}

class Student1Test {

  public static void main(String[] args) {
    Student1 s1 = new Student1();
    s1.studentCardNumber = 1L;
    s1.firstName = "John";
    s1.lastName = "Smith";
    s1.yearOfStudy = LocalDate.of(1990, 1, 1);
    s1.averageGradeInMath = 3.5;
    s1.averageGradeInEconomics = 5.5;
    s1.averageGradeInForeignLanguage = 6.0;

    Student1 s2 = new Student1();
    s2.studentCardNumber = 2L;
    s2.firstName = "Dali";
    s2.lastName = "Ben";
    s2.yearOfStudy = LocalDate.of(1999, 2, 2);
    s2.averageGradeInMath = 8.6;
    s2.averageGradeInEconomics = 3.0;
    s2.averageGradeInForeignLanguage = 7.0;

    Student1 s3 = new Student1();
    s3.studentCardNumber = 3L;
    s3.firstName = "Natali";
    s3.lastName = "Wit";
    s3.yearOfStudy = LocalDate.of(1945, 4, 12);
    s3.averageGradeInMath = 4.5;
    s3.averageGradeInEconomics = 5.0;
    s3.averageGradeInForeignLanguage = 7.0;

    System.out.println("Arithmetic mean of student " + s1.firstName + " " + s1.lastName + ": "
        + arithmeticMean(s1));
    System.out.println("Arithmetic mean of student " + s2.firstName + " " + s2.lastName + ": "
        + arithmeticMean(s2));
    System.out.println("Arithmetic mean of student " + s3.firstName + " " + s3.lastName + ": "
        + arithmeticMean(s3));
  }

  static double arithmeticMean(Student1 student1) {
    return (student1.averageGradeInEconomics + student1.averageGradeInMath
        + student1.averageGradeInForeignLanguage) / 3;
  }
}
