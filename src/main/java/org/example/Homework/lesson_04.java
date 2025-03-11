package org.example.Homework;

import java.time.LocalDate;

public class lesson_04 {

}

class Student {

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
    Student s2 = new Student();
    Student s3 = new Student();

    System.out.println(arithmeticMean(s1.averageGradeInMath, s1.averageGradeInEconomics,
        s1.averageGradeInForeignLanguage));
    System.out.println(arithmeticMean(s2.averageGradeInMath, s2.averageGradeInEconomics,
        s2.averageGradeInForeignLanguage));
    System.out.println(arithmeticMean(s3.averageGradeInMath, s3.averageGradeInEconomics,
        s3.averageGradeInForeignLanguage));
  }

  static Double arithmeticMean(Double math, Double economics, Double foreignLanguage) {
    return (math + economics + foreignLanguage) / 3;
  }
}