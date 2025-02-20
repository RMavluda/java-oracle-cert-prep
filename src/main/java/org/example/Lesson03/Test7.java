package org.example.Lesson03;

public class Test7 {

  public static void main(String[] args) {
    /*
    * true^true^true=false
    * false^false^false=false
    * true^false^true=false
    * false^false^true=true
    */
    boolean b1 = true;
    boolean b2 = false;
    boolean b3 = false;
    boolean b4 = false;

    System.out.println(b1^b2^b3^b4);
/*
    boolean x = true;
    boolean y = false;

    System.out.println(!x);
    System.out.println(!y);

    System.out.println();

    int a = 10;
    int b = 50;
    boolean z = a > b;
    System.out.println(!z);

    System.out.println();

    int c = 0;
    int d = 100;

    boolean b1 = a < b && c++ == d; // true && false = false
    // AND operatorida: avval c va d ni solishtiradi, keyin c ning qiymatini 2 ga oshiradi. bu holatdanatijaga hech qanday tasir ko`rsatmaydi
    System.out.println(b1);
    //  b1 = a > b && c++ == d; --> qilganimizda avval a < b ni tekshiradi, javob false bo`lgani uchun 2-shartni tekshirmidi. chunki AND da bitta false kifoya, javob false bo`ladi.

    System.out.println();

    a = 60;
    c = 99;
    boolean b2 = a > b || ++c == d;
    System.out.println(b2);
    //OR operatorida: a > b tekshrilganda javob true, shu joyda to`htatiladi. chunki OR uchun 1 ta true bo`lsa kifoya, javob ham true


    System.out.println("Bitwise &, bitwise | operations:");
    boolean b3 = a<b & ++c==d;
    System.out.println(b3);
    System.out.println(c);
    //agar har qanday holatda ham shartlarni barchasi tekshriilishi kerak bo`lsa, bitwise operatorlars dan foydalaniladi.
    //masalan yuqoridagi shartda c ning qiymati 1 ga oshadi


    System.out.println();
    int l = 10;
    int k = 5;
    System.out.println(l|k);*/

  }
}
