package org.example.Homework.Lesson_06;

import java.time.LocalDate;

public class Student {

  Long studentCardNumber;
  String firstName;
  String lastName;
  LocalDate yearOfStudy;
  Double averageGradeInMath;
  Double averageGradeInEconomics;
  Double averageGradeInForeignLanguage;

  Student(Long studentCardNumber1, String firstName1, String lastName1, LocalDate yearOfStudy1,
      Double averageGradeInMath1, Double averageGradeInEconomics1,
      Double averageGradeInForeignLanguage1) {
    studentCardNumber = studentCardNumber1;
    firstName = firstName1;
    lastName = lastName1;
    yearOfStudy = yearOfStudy1;
    averageGradeInMath = averageGradeInMath1;
    averageGradeInEconomics = averageGradeInEconomics1;
    averageGradeInForeignLanguage = averageGradeInForeignLanguage1;
  }

  Student(Long studentCardNumber1, String firsName1, String lastName1, LocalDate yearOfStudy1){
    studentCardNumber = studentCardNumber1;
    firstName = firsName1;
    lastName = lastName1;
    yearOfStudy = yearOfStudy1;
  }

  Student(){
  }
}

class StudentTest {

  public static void main(String[] args) {
    Student s1 = new Student(1L, "John", "Smith", LocalDate.of(1990, 1, 1), 3.5, 5.5, 6.0);

    Student s2 = new Student(2L, "Dali", "Ben", LocalDate.of(1999, 2, 2));

    Student s3 = new Student();
    s3.studentCardNumber = 3L;
    s3.firstName = "Natali";
    s3.lastName = "Wit";
    s3.yearOfStudy = LocalDate.of(1945, 4, 12);
    s3.averageGradeInMath = 4.5;
    s3.averageGradeInEconomics = 5.0;
    s3.averageGradeInForeignLanguage = 7.0;

  }
}
