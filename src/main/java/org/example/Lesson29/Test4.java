package org.example.Lesson29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test4 {

  public static void main(String[] args) {
    LocalDate ld1 = LocalDate.of(2026, 1, 1);
    LocalDate ld2 = LocalDate.of(2026, Month.FEBRUARY, 2);
    System.out.println(ld1.isAfter(ld2));

    LocalTime lt1 = LocalTime.of(18, 1);
    LocalTime lt2 = LocalTime.of(3, 57, 18, 234343);
    System.out.println(lt1.isAfter(lt2));

    LocalDateTime ldt1 = LocalDateTime.of(2020, Month.DECEMBER, 10, 17, 18);
    LocalDateTime ldt2 = LocalDateTime.of(2020, Month.DECEMBER, 10, 17, 18, 32, 43434);
    System.out.println(ldt1.isAfter(ldt2));
    System.out.println(ldt1.isBefore(ldt2));

//    System.out.println(ldt1.isAfter(ld2));
//    Obyekt turi bir xil bo`lmasa solishtirish mumkin emas
  }
}
