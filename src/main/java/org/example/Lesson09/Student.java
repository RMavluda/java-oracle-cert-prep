package org.example.Lesson09;

public class Student {

  int a = 10;
  int b = this.a;
  public static int c = 5;
  public int z = this.c;
  static int f = c;
}

class StudentTest {

  public static void main(String[] args) {
    Student st1 = new Student();
    Student st2 = new Student();
    Student st3; // st3 hech qanday konstruktorga murojaat qilmagan, yani u obyekt hisoblanmidi
    st1 = null; // st1 adresini o`chirgan hisoblanamiz
    st1 = new Student(); // st1 avvalgi emas, yangi adresga o`zgardi

    String s = "Student"; // String class obyekti yaratildi, String yagona konstruktorga murojat qilmasdan obyekt yaratish mumkin bolgan class

    ///// GARBAGE COLLECTOR /////
    /*
     * biz xotirani faqatgina to`ldirmasdan, uni bo`shatishimiz ham kerak
     * GARBAGE collector obyketlarni qancha muddatda ochirishi nomalum, aynan mana shuni o`chiradi deb aytolmaymiz.
     * faqatgina "mana shu garbage collector tomonidan o`chirilishi mumkin" (qachonligi nomalum bo`lganligi uchun) deya olamiz
     * */
  }
}