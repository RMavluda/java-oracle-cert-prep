package org.example.Lesson29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Test9 {

  public static void main(String[] args) {

    LocalTime lt = LocalTime.of(14, 40);
    LocalDate ld = LocalDate.of(2025, Month.APRIL, 2);
    LocalDateTime ldt = LocalDateTime.of(2025, Month.APRIL, 2, 13, 59);

    DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_TIME;
    System.out.println(lt);
    System.out.println(lt.format(d1));
    DateTimeFormatter d2 = DateTimeFormatter.ISO_LOCAL_DATE;
    System.out.println(ld);
    System.out.println(ld.format(d2));
//    System.out.println(lt.format(d2));
//    yuqoridagi yozuv error qaytaradi, chunki time va date teng bololmidi
    DateTimeFormatter d3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
    System.out.println(ldt);
    System.out.println(ldt.format(d3));
    System.out.println(ldt.format(d2));
    System.out.println(ldt.format(DateTimeFormatter.ISO_LOCAL_TIME));

    DateTimeFormatter d4 = DateTimeFormatter.ISO_WEEK_DATE;
    System.out.println(ld.format(d4) + " ---> yilning nechanchi haftasi va ushbu haftaning nechanchi kuni ekanligi ko`rsatiladi");
  }
}
