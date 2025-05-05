package org.example.Lesson16;

public class Test10 {

  public static void main(String[] args) {
    String x = "hello";
    /*
     * x -> String pool dagi "hello" obyektini ko`rsatadi
     * Literal — avtomatik pool’da
     * */
    String y = " hello".trim().intern();
    /*
     * bu ifoda metod natijasi bo`lganligi uchun, String pool ga qo`shilmaydi
     * y -> Heapdagi "hello" qiymatli yangi obyekt
     * .trim() natijasi — yangi obyekt
     * */

    System.out.println(x == y);
    /*
     * == -> bu obyektlarni manzillarini solishtiradi
     * x -> pool dagi obyekt
     * y -> heapdagi obyekt
     * manzillar har xil shuning uchun javob false
     * */
  }
}

/*
 * Stringpool "hello" qiymatli obyekt bor yoki yo`qligini tekshiradi
 * agar bor bo`lsa yangisini yaratmidi, adresini bor bo`lgan obyektnikiga o`zgartiradi holos
 * */
