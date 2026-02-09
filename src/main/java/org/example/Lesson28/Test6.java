package org.example.Lesson28;

public class Test6 {

  static String abc() {
    String s1 = "";
    String s2 = null;
    try {
      try {
        s1 += '1';
        s2.charAt(3);
        s1 += '2';
      } catch (NullPointerException e) {
        s1 += '3';
        throw new RuntimeException();
      } finally {
        s1 += '4';
      }
    } catch (Exception e) {
      s1 += '5';
    }
    return s1;
  }

  public static void main(String[] args) {
    Test6 test6 = new Test6();
    test6.abc();
  }
}
