package org.example.Homework.Lesson_23.p2;

import org.example.Homework.Lesson_23.p1.X2;

public class Y2 extends X2 {

  public void abc() {
    System.out.println('Y');
  }

  public void def() {
    Y2 y = new Y2();
    y.abc();
  }

  public void ghi() {
//    Y klassdan obyekt yaratdim, lekin uni X (ota klass) sifatida saqlayman
//    obyekt → Y turida (farzand klass)
//    o‘zgaruvchi → X turida (ota klass)
    X2 x = new Y2();
//    Java avtomatik tarzda obyektning turiga qarab metodni tanlaydi - bu dynamic method dispatch deyiladi
//    abc protected bo`lganligi uchun unga faqat o`zining packagedan yoki subclass orqaligina murojaat qilish mumkin
//    x.abc();
  }

  public static void main(String[] args) {
    Y2 a = new Y2();
    a.abc();
    a.def();
    a.ghi();
  }
}
