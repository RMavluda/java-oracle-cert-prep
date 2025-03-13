package org.example.Homework.lesson4;

import java.time.LocalDate;

public class Student {

  Long studentCardNumber;
  String firstName;
  String lastName;
  LocalDate yearOfStudy;
  Double averageGradeInMath;
  Double averageGradeInEconomics;
  Double averageGradeInForeignLanguage;
}

class StudentTest {

  public static void main(String[] args) {
    Student s1 = new Student();
    s1.studentCardNumber = 1L;
    s1.firstName = "John";
    s1.lastName = "Smith";
    s1.yearOfStudy = LocalDate.of(1990, 1, 1);
    s1.averageGradeInMath = 3.5;
    s1.averageGradeInEconomics = 5.5;
    s1.averageGradeInForeignLanguage = 6.0;
//    System.out.println(s1.studentCardNumber);
//    System.out.println(s1.firstName);
//    System.out.println(s1.lastName);
//    System.out.println(s1.yearOfStudy);
//    System.out.println(s1.averageGradeInMath);
//    System.out.println(s1.averageGradeInEconomics);
//    System.out.println(s1.averageGradeInForeignLanguage);

    Student s2 = new Student();
    s2.studentCardNumber = 2L;
    s2.firstName = "Dali";
    s2.lastName = "Ben";
    s2.yearOfStudy = LocalDate.of(1999, 2, 2);
    s2.averageGradeInMath = 8.6;
    s2.averageGradeInEconomics = 3.0;
    s2.averageGradeInForeignLanguage = 7.0;
//    System.out.println(s2.studentCardNumber);
//    System.out.println(s2.firstName);
//    System.out.println(s2.lastName);
//    System.out.println(s2.yearOfStudy);
//    System.out.println(s2.averageGradeInMath);
//    System.out.println(s2.averageGradeInEconomics);
//    System.out.println(s2.averageGradeInForeignLanguage);

    Student s3 = new Student();
    s3.studentCardNumber = 3L;
    s3.firstName = "Natali";
    s3.lastName = "Wit";
    s3.yearOfStudy = LocalDate.of(1945, 4, 12);
    s3.averageGradeInMath = 4.5;
    s3.averageGradeInEconomics = 5.0;
    s3.averageGradeInForeignLanguage = 7.0;
//    System.out.println(s3.studentCardNumber);
//    System.out.println(s3.firstName);
//    System.out.println(s3.lastName);
//    System.out.println(s3.yearOfStudy);
//    System.out.println(s3.averageGradeInMath);
//    System.out.println(s3.averageGradeInEconomics);
//    System.out.println(s3.averageGradeInForeignLanguage);

    System.out.println("Arithmetic mean of student " + s1.firstName + " " + s1.lastName + ": "
        + (s1.averageGradeInMath + s1.averageGradeInEconomics + s1.averageGradeInForeignLanguage)
        / 3);
    System.out.println("Arithmetic mean of student " + s2.firstName + " " + s2.lastName + ": "
        + (s2.averageGradeInMath + s2.averageGradeInEconomics + s2.averageGradeInForeignLanguage)
        / 3);
    System.out.println("Arithmetic mean of student " + s3.firstName + " " + s3.lastName + ": "
        + (s3.averageGradeInMath + s3.averageGradeInEconomics + s3.averageGradeInForeignLanguage)
        / 3);
  }
}