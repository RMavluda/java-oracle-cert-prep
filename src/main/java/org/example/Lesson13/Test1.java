package org.example.Lesson13;

public class Test1 {
  //switch
  //case
  //break
  //default

}

class Student {

  int gradle;

  Student(int gradle) {
    this.gradle = gradle;
  }

  public static void main(String[] args) {
    Student st1 = new Student(1);
    /*if (st1.gradle == 2) {
      System.out.println("Student dvoichnik");
    } else if (st1.gradle == 3) {
      System.out.println("Student troichnik");
    } else if (st1.gradle == 4) {
      System.out.println("Student xoroshist");
    } else if (st1.gradle == 5) {
      System.out.println("Student otlichnik");
    } else {
      System.out.println("Ocenka neverna");
    }*/
    switch (st1.gradle) {
      case 2:
        System.out.println("Student dvoichnik");
        break;
      default:
        System.out.println("Ocenka neverna");
        break;
      case 3:
        System.out.println("Student troichnik");
        break;
      case 4:
        System.out.println("Student xoroshist");
        break;
      case 5:
        System.out.println("Student otlichnik");
        break;
    }
    /*
     * default:
     * hohlagan qatorda yozish mumkin
     * faqat uni oxirga yozilmasa break yozilishi kerak
     * break bolmasa, keyingi case ishga tuhsishi mumkin
     * qolaversa switchda faqat 1 ta default yozish mumkin
     *
     * case:
     * bir nechta case ga bir xil znacheniya yozish mumkin emas
     * m-n, case(5) va case(2+3) ham bir xil hisoblanadi
     * */

  }
}