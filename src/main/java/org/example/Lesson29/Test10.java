package org.example.Lesson29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Test10 {

  public static void main(String[] args) {

    LocalTime lt = LocalTime.of(14, 40);
    LocalDate ld = LocalDate.of(2025, Month.APRIL, 2);
    LocalDateTime ldt = LocalDateTime.of(2025, Month.APRIL, 2, 13, 59);
    DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMMM-dd, yy, hh:mm a");
    System.out.println(ldt);
    System.out.println(ldt.format(f1));

    DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MMM dd yyyy");

    LocalDate date1 = LocalDate.parse("Feb 02 2025", f2);
    System.out.println(date1);
    System.out.println(date1.format(f2));

    LocalDate date2 = LocalDate.parse("2025-11-12");
    System.out.println(date2);
    System.out.println(date2.format(f2));
  }

}
