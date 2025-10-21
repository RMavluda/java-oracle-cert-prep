package org.example.Homework.Lesson_23;

class X5{
  String s1 = "privet";
}

class Y5 extends X5{
  boolean bool = false;
}
public class Test5 {

  public static void main(String[] args) {
    X5 x = new Y5();
//    bool field faqat y ga tegishli bo`lganligi uchun uni chqirish mumkin emas
//    System.out.println(x.s1 + " " x.bool);
  }
}
