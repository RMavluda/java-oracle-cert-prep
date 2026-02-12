package org.example.Lesson29;

import java.time.*;

public class Test1 {

  public static void main(String[] args) {
    System.out.println(LocalDate.now());
    System.out.println(LocalTime.now());
    System.out.println(LocalDateTime.now());


    /*LocalDate localDate = new LocalDate(2015,05,13);
     *bu korinishda yaratish mumkin emas, chunki LocalDate private constructorga ega
     * */

    LocalDate ld = LocalDate.of(2025, 05, 15);
    System.out.println(ld);
  }

}
