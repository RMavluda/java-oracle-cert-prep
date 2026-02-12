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


    /*---Date---*/
    LocalDate ld = LocalDate.of(2025, 05, 15);
    System.out.println(ld);
    LocalDate ld1 = LocalDate.of(2025, Month.MAY, 15);
    System.out.println(ld1);
    /*---Time---*/
    LocalTime lt1 = LocalTime.of(12, 34);
    System.out.println(lt1);
    LocalTime lt2 = LocalTime.of(12, 34, 56);
    System.out.println(lt2);
    LocalTime lt3 = LocalTime.of(12, 34, 56, 999999999);
    System.out.println(lt3);
    /*---Date Time---*/
    LocalDateTime ldt1 = LocalDateTime.of(2025,Month.AUGUST, 11, 12, 34);
    System.out.println(ldt1);
    LocalDateTime ldt2 = LocalDateTime.of(2025,Month.OCTOBER, 11, 12, 34, 56);
    System.out.println(ldt2);
    LocalDateTime ldt3 = LocalDateTime.of(2025,Month.MAY, 11, 12, 34, 56, 999999999 );
    System.out.println(ldt3);

    /*---LocalDate, LocalTime, LocalDateTime obyektlari immutable ---> ya`ni agar obyekt qiymati o`zgartirilsa bu yangi obyekt sifatida qabul qilinadi*/
    LocalDateTime old = ldt3;
    ldt3 = ldt3.plusDays(1);
    System.out.println(ldt3);

    System.out.println(ldt3.equals(old));
    System.out.println(ldt3 == old);
  }

}
