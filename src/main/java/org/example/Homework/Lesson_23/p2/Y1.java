package org.example.Homework.Lesson_23.p2;

import org.example.Homework.Lesson_23.p1.*;

public class Y1 extends X1 {

  // X class boshqa pachage da bo`lganligi uchun,
  // ya`ni constructori default modifier ligi uchun xatolik yuz beradi.
  // xatolik tog`ilanishi uchun super-class constructorini protected qilish kerak
  Y1() {
  }

  public void abc() {
    System.out.println('Y');
  }

  public static void main(String[] args) {
    Y1 y = new Y1();
    y.abc();
  }
}
