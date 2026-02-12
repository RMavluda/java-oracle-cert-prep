package org.example.Lesson29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test8 {

  public static void main(String[] args) {

    System.out.println("----------Date---------");
    LocalDate ldt1 = LocalDate.of(2025, Month.APRIL, 2);
    System.out.println(ldt1.getDayOfWeek());
    System.out.println(ldt1.getDayOfMonth());
    System.out.println(ldt1.getDayOfYear());
    System.out.println(ldt1.getMonth());
    System.out.println(ldt1.getMonthValue());

    System.out.println("----------DateTime---------");

    LocalDateTime ldt2 = LocalDateTime.of(2025, Month.APRIL, 2, 13, 59);
    System.out.println(ldt2.getDayOfWeek());
    System.out.println(ldt2.getDayOfMonth());
    System.out.println(ldt2.getDayOfYear());
    System.out.println(ldt2.getMonth());
    System.out.println(ldt2.getMonthValue());


    System.out.println("----------Time---------");
    LocalTime lt = LocalTime.of(14, 40, 56, 234231);
    System.out.println(lt.getNano());
    System.out.println(lt.getSecond());
    System.out.println(lt.getMinute());
    System.out.println(lt.getHour());
    System.out.println(lt.getClass());

  }


}
