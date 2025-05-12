package org.example.Lesson18;

public class Test7 {

  public static void main(String[] args) {
    char[] array = {'p', 'r', 'i', 'v', 'e', 't'};
//    String s = new String(array);
//    System.out.println(s);

    StringBuilder sb = new StringBuilder("Hello World");
    sb.append(array, 2, 3);
    System.out.println(sb);

  }



}
