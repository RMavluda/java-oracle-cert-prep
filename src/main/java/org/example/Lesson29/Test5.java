package org.example.Lesson29;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class Test5 {

  static void smenaDejurnogo(LocalDate start, LocalDate finish, Period p) {
    LocalDate date = start;
    while (date.isBefore(finish)) {
      System.out.println("Nastupila data " + date + " Pora menyat dejurnogo");
      date = date.plus(p);
    }
  }

  public static void main(String[] args) {
    LocalTime lt = LocalTime.of(20, 45);
    Period p = Period.ofDays(5);
//    lt.plus(p);
// yuqoridagi qiymat UnsupportedTemporalTypeException qaytaradi
// sabab: period eng kamida 1 kun qiymatni qabul qialdi,
// LocalTime da esa 1 kundan ortiq qiymat mumkin emas.
// ya`ni bir biriga to`g`ri kelmaydigan qiymatlar bo`lganligi uchun

    LocalDate start = LocalDate.of(2025, Month.SEPTEMBER, 1);
    LocalDate finish = LocalDate.of(2036, Month.MAY, 31);

    Period p1 = Period.ofWeeks(5);
    Period p2 = Period.ofMonths(5);
    Period p3 = Period.ofYears(5);
    Period p4 = Period.of(5, 4, 2);

    smenaDejurnogo(start, finish, p4);
  }

}
