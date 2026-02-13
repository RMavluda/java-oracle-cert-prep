package org.example.Homework.Lesson_29;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Test1 {

  static DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
  static DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

  void shift(LocalDateTime ldt1, LocalDateTime ldt2, Period p, Duration d) {

    while (ldt1.isBefore(ldt2) || ldt2.isEqual(ldt1)) {
      System.out.println("Working from: " + ldt1.format(f1));
      ldt1 = ldt1.plus(p);
      System.out.println("TO: " + ldt1.format(f1));
      System.out.println("Resting from: " + ldt1.format(f2));
      ldt1 = ldt1.plus(d);
      System.out.println("TO: " + ldt1.format(f2));
    }

  }

  public static void main(String[] args) {
    Test1 t = new Test1();
    LocalDateTime ldt1 = LocalDateTime.of(2025, 1, 15, 10, 0, 1, 256);
    LocalDateTime ldt2 = LocalDateTime.of(2035, 1, 15, 10, 0, 1, 256);
    Period p = Period.ofMonths(2);
    Duration d = Duration.ofDays(3);
    t.shift(ldt1, ldt2, p, d);
  }
}
