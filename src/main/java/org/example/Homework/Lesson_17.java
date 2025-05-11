package org.example.Homework;

public class Lesson_17 {

  public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
    boolean result = true;
    if (sb1.length() == sb2.length()) {
      for (int i = 0; i < sb1.length(); i++) {
        if (sb1.charAt(i) != sb2.charAt(i)) {
          result = false;
          break;
        }
      }
    } else {
      result = false;
    }
    return result;
  }

  public static void main(String[] args) {
    StringBuilder sb1 = new StringBuilder("hello");
    StringBuilder sb2 = new StringBuilder("hello");
    StringBuilder sb3 = new StringBuilder("Hello");
    boolean a = Lesson_17.ravenstvo(sb1, sb2);
    System.out.println(a);
    System.out.println(Lesson_17.ravenstvo(sb2, sb3));
    System.out.println(Lesson_17.ravenstvo(new StringBuilder(""), new StringBuilder("")));
    System.out.println(Lesson_17.ravenstvo(new StringBuilder(), new StringBuilder()));
  }
}
