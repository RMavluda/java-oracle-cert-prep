package org.example.Lesson29;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class Test7 {

  public static void main(String[] args) {
    LocalDate start = LocalDate.of(2025, Month.DECEMBER, 1);
    Duration d = Duration.ofHours(3);
/*
    System.out.println(start.plus(d));
    error chunki duration bu vaqt haqidagi ma`lumotlarni saqlid
    LocalDate esa hech qanday vaqt haqidagi ma`lumot emas, faqat vaqt sanani saqlaganligi uchun
*/

    LocalTime lt = LocalTime.of(23, 59, 59);
    System.out.println(lt.plus(d));


    Period p = Period.ofMonths(3);
    d = Duration.ofHours(3);
    LocalDateTime ldt = LocalDateTime.of(2025, Month.APRIL, 2, 13, 59);
    System.out.println(ldt.plus(d).plus(p));
  }

}
