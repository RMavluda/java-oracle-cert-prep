package org.example.Homework;

public class Lesson_17 {

  public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2){
    return sb1.equals(sb2);
  }

  public static void main(String[] args) {
    StringBuilder sb1 = new StringBuilder("Hb12");
    StringBuilder sb2 = new StringBuilder("Hb12");
    System.out.print(ravenstvo(sb1, sb2));
  }
}
