package org.example.Homework.Lesson_05;

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

  double arithmeticMean(Student student) {
    double arMean = (student.averageGradeInEconomics + student.averageGradeInMath
        + student.averageGradeInForeignLanguage) / 3;
    System.out.println(student.firstName + " " + student.lastName + " " + arMean);
    return arMean;
  }

  public static void main(String[] args) {
    Student s1 = new Student();
    s1.studentCardNumber = 1L;
    s1.firstName = "John";
    s1.lastName = "Smith";
    s1.yearOfStudy = LocalDate.of(1990, 1, 1);
    s1.averageGradeInMath = 3.5;
    s1.averageGradeInEconomics = 5.5;
    s1.averageGradeInForeignLanguage = 6.0;

    Student s2 = new Student();
    s2.studentCardNumber = 2L;
    s2.firstName = "Dali";
    s2.lastName = "Ben";
    s2.yearOfStudy = LocalDate.of(1999, 2, 2);
    s2.averageGradeInMath = 8.6;
    s2.averageGradeInEconomics = 3.0;
    s2.averageGradeInForeignLanguage = 7.0;

    Student s3 = new Student();
    s3.studentCardNumber = 3L;
    s3.firstName = "Natali";
    s3.lastName = "Wit";
    s3.yearOfStudy = LocalDate.of(1945, 4, 12);
    s3.averageGradeInMath = 4.5;
    s3.averageGradeInEconomics = 5.0;
    s3.averageGradeInForeignLanguage = 7.0;

    StudentTest st = new StudentTest();
    st.arithmeticMean(s1);
    st.arithmeticMean(s2);
    st.arithmeticMean(s3);
  }
}
