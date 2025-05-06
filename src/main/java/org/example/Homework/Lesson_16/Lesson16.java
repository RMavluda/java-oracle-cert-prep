package org.example.Homework.Lesson_16;

public class Lesson16 {

  public void email(String s) {
    int a = 0; // position symbol @
    int b = 0; // position symbol .
    int c = 0; // position symbol ;
    while (c < s.length() - 1) {
      a = s.indexOf('@', c);
      b = s.indexOf('.', c);
      c = s.indexOf(';', c + 1);
      System.out.println(s.substring(a + 1, b));
    }
  }

  public static void main(String[] args) {
    Lesson16 lesson16 = new Lesson16();
    lesson16.email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
  }
}
