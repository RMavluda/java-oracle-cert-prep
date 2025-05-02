package org.example.Lesson15;

public class Test9 {

  public static void main(String[] args) {
    int chas = -1;
    OUTER:
    do {
      chas++;
      int minuta = 0;
      INNER:
      while (minuta < 60) {
        if (minuta == 20) {
          break OUTER;
        }
        System.out.println(chas + ":" + minuta);
        minuta++;
      }
    } while (chas < 24);

  }
}
/*
    do {
      int a = 5;
      System.out.println(a);
    }while(a <= 15);

    bu sikl error bo`ladi, chunki a o`zgaruvchini while tanimaydi,
    a do ning ichida yaratilgan, undan tashqarida mavjud emas*/
