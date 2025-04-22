package org.example.Lesson11;

public class Student {
  String name;
  int course;
  double grade;

  Student(String name, int course, double grade) {
    this.name = name;
    this.course = course;
    this.grade = grade;
  }

  public static void swap(Student st1, Student st2){
    Student s3 = st1;
    st1 = st2;
    st2 = s3;
    System.out.println("student1 in method: " + st1.name + " " + st1.course + " " + st1.grade);
    System.out.println("student2 in method: " + st2.name + " " + st2.course + " " + st2.grade);
  }

  public static void main(String[] args) {
    Student s1 = new Student("Ivan", 3, 9.5);
    Student s2 = new Student("Petr", 1, 5.3);
    System.out.println("student1: " + s1.name + " " + s1.course + " " + s1.grade);
    System.out.println("student2: " + s2.name + " " + s2.course + " " + s2.grade);
    swap(s1, s2);
    System.out.println("student1: " + s1.name + " " + s1.course + " " + s1.grade);
    System.out.println("student2: " + s2.name + " " + s2.course + " " + s2.grade);
    // !!swap bo`lmidi!! chunki argumentda obyekt yozilsada, kopiyasi boradi. aynan o`zi emas
  }

}
