package org.example.Lesson16;

public class Test9 {

  public static void main(String[] args) {
    String s1 = new String("ok");
    String s2 = new String("ok");
    System.out.println(s1 == s2); // false
    System.out.println(s1.equals(s2)); // true
    String s3 = "hello";
    String s4 = "hello";
    System.out.println(s3 == s4); // true
    System.out.println(s3.equals(s4)); //true
    System.out.println(s1 != s4);

    String s10 = "How are You?";
    String s11 = "how are you?";
    System.out.println(s10.equals(s11)); // false
    System.out.println(s10.equalsIgnoreCase(s11)); // true


  }
}
