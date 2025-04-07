package org.example.Lesson08;

public class Test1 {

  public final int a;
// a - instance variable
//  public final int b; error *** final element yaratish jarayonida aniq qiymatga ega bo`lishi kerak

  Test1() {
    a = 10;
  }

  Test1(boolean b) {
    a = 10;
  }
// constanta yaratlganda qiymat berilmasa, har bir constructor ichida qiymat berilishi kerak bo`ladi

  public void abc(final short s) {
    final byte b;
    b = 10;
    //b - local variable
    //b o`zgaruvchisi abc metoddan atshqarida ko`rinmidi
    //s++; constanta variable bo`lganligi uchun qiymatini o`zgartirish mumkin emas
    System.out.println(s + b);
  }

  public static void main(String[] args) {
    Test1 t = new Test1();
//  t.a = t.a * 2; qiymatini o`zgartirish mumkin emas
    System.out.println(t.a);
  }
}
