package org.example.Lesson29;

import java.time.*;

public class Test6 {

  public static void main(String[] args) {
    LocalDate start = LocalDate.of(2025, Month.DECEMBER, 1);
//    Period p = Period.ofDays(10);
//    Period p = Period.ofMonths(2).ofDays(10);
//    yuqoridagi qiymat nbilan start faqatgina 10 kunga suriladi, 2 oyu 10 kun emas
//    sababi: ofdays bu static method
//    shu sababli avvaliga Period 2-oyga teng bo`ladi
//    keyingi safar uni 2 kunga o`zgartiriladi, ya`ni chain qilinmidi - ustiga yangisi yoziladi(qo`shilmidi)

    Period p = Period.ofMonths(2);
    p = Period.ofDays(20);
    System.out.println(start.plus(p));
  }

}
