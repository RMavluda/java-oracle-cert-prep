package org.example.Lesson19;

public class Test7 {

  public static void main(String[] args) {
    StringBuilder sb1 = new StringBuilder("Hello");
    StringBuilder sb2 = new StringBuilder("bye");
    StringBuilder sb3 = new StringBuilder("ok");
    StringBuilder sb4 = new StringBuilder("none");
    StringBuilder[] array = {sb1, sb2, sb3, sb4};
//    for (int i = 0; i < array.length; i++) {
//      array[i] = 3;
//    }
    for (StringBuilder a : array) {
      a.append(" Java");
    }
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i] + " ");
    }
  }

}
