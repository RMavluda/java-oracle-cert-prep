package org.example.Lesson12;


public class Test10 {

  public static void main(String[] args) {

    int a = 30;
    if(a < 20)
      System.out.println("1: a < 20");
      System.out.println("ajdshdshds");
      a++;
    //agar figurali qavs yozilmasa if faqat amalni hisobga oladi
    //ammo undan keyingi amallar ham bajarialdi


   if(a < 20)
     System.out.println("2: a < 20");
   else
     System.out.println("a > 20");
     System.out.println("Hello everyone!");

    //else da ham huddi shunday
    //figurali qavs qoyilmasa, faqat bittagina amal else ga kiradi

    int salary = 500;
    if (salary >= 500) {
      System.out.println(":)");
    } else {
      System.out.println(":(");
    }

    if (salary >= 500);
    System.out.println("abrakadabra netu");
//sout if ichida hisoblanmidi. if shunchaki tekshirib o`tadi holos, shu bilan tugidi.

    if (salary > 500)
    System.out.println("abrakadabra 100");
    //sout if ichida hisoblanadi

/*    if (salary >= 500)
    System.out.println(":)))");
    System.out.println("!!!!!!!");
    else
      System.out.println(":(");

      ERROR chunki figurali qavs ishaltilmagan va else 2-virajeniyadan keyin yozilyapti'
      ya`ni bu ko`rinishda kompilyator else uchun if yozilmagan deb hisoblaydi
      */
  }
}
