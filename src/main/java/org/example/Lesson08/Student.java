package org.example.Lesson08;

public class Student {

  String name;
  int course;
  static int count; //class variable default 0
  int a; // object variable default 0

  public Student(String name2, int course2) {
    count++;
    name = name2;
    course = course2;
    System.out.println("Student " + count + " sozdano");
  }

  public static void showCount() {
    System.out.println("Vsego sozdano studentov " + count);
  }

  public void showInfo() {
    System.out.println("Welcome to the class");
  }

  void abc() {
    a++;
    count++;
  }

  static void abcd() {
    count++;
    //a++;
    // non-static variable ni static method ichida foydalanish mumkin emas
    // chunki non static variable object variable, static method esa class ga teshishli method

    Student s2 = new Student("Ana", 1);
    s2.a++;
  }

  public static void main(String[] args) {
abcd(); // hech qanday object yaratmasdan chaqirishimiz mumkin, chunki u class variabe
    //abc(); ni esa object yaratmasdan chaqira olmaymiz
  }

}