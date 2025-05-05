package org.example.Lesson16;

public class Test2 {

  public static void main(String[] args) {
    String s1 = new String("abcdefghijklmn");
    System.out.println("s1 = " + s1);

    String s10 = s1.substring(3);
    System.out.println(s10);
    System.out.println(s1); // s1 ne izmenyayetsa

    String s11 = s1.substring(3, 7); // 7-simvol hisobga kirmidi
    System.out.println(s11);

    String s12 = s1.trim(); // satr boshidagi bo`sh joylarni o`chiradi
    System.out.println(s12);

    String s13 = s1.substring(7, 13);
    /*
    satr uzunligi 14 bo`lganligi uchun 14 gacha son yozish mumkin
    ammo 13, 14 ikkalasida ham javob bir xil chiqadi
    14 => bu satr uzunligiga teng, lekin bu index da simvol mavjud emas
    13 => ohirgi simvol indexi, shu sababli satr ohirigacha chiqariladi
     */
    System.out.println(s13);
    System.out.println();

    String s2 = "hello";
    System.out.println("s2 = " + s2);

    String s14 = s2.replace('l', 'Z');
    /*
     * satrdagi 'a' simvolalrni 'b' simvolga o`zgartirish
     * */
    System.out.println(s14);

    String s15 = s2.replace("llo", "110");
    System.out.println(s15);

    String s3 = "Bye";
    System.out.println("s3 = " + s3);

    String s16 = s3.replace("y", "y");
    System.out.println(s3 == s16);
  }
}
