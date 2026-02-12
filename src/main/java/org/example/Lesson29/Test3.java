package org.example.Lesson29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test3 {
  public static void main(String[] args) {
    /*--- Date ---*/
    LocalDate ld1 = LocalDate.of(2024, 8, 18);
    System.out.println(ld1);
    ld1 = ld1.plusDays(20);
    System.out.println(ld1);
    ld1 = ld1.minusDays(8);
    System.out.println(ld1);
    ld1 = ld1.plusWeeks(3);
    System.out.println(ld1);
    ld1 = ld1.minusMonths(2);
    System.out.println(ld1);

    /*--- Time ---*/
    LocalTime lt = LocalTime.now();
    System.out.println(lt);
    lt = lt.plusHours(2);
    System.out.println(lt);
    lt = lt.plusMinutes(2);
    System.out.println(lt);
    lt = lt.plusSeconds(2);
    System.out.println(lt);
    lt = lt.minusSeconds(20);
    System.out.println(lt);
// quyidagi holatda o`zgarmidi, chunki immutable
    lt.minusHours(2);
    System.out.println(lt);

    lt = lt.plusHours(2).minusMinutes(24).plusSeconds(38).minusNanos(78);
    System.out.println(lt);

    /*--- DateTime ---*/
    LocalDateTime ldt1 = LocalDateTime.now();
    System.out.println(ldt1);
    ldt1 = ldt1.plusYears(3).minusMonths(5).plusHours(8).minusSeconds(10).plusNanos(489);
    System.out.println(ldt1);



  }

}
