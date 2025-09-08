package org.example.Lesson21;

public class Test1 {

  public static void main(String[] args) {
//    int a = 4;
//    System.out.println(a < 4 ? 7 : "privet");
    /*
     * ternary operator da exception lar bir xil type da bo`lishi shart emas
     * */
    /*
     * int b = (a < 7) ? 7 : "privet";
     * lekin bu ko`rinishda yozishningi loji yo`q
     * chunki String ni int type ga joylashga urunilyapti
     *  */
    int a = 5;
    int b = 5;
    int c = (a < 6) ? a++ : b++;
    System.out.println("a = " + a);
    System.out.println("b = " + b);


  }

}

/*
 * 1)
 * import p1.A;
 * import p2.A; // ERROR
 * ikkala package da ham bir xil nomdagi 'A' class yaratilsa
 * va mana shu ikkala class ham boshqa 'B' classda import qilinsa error bo`ladi
 * chunki kompilyator qaysi 'A' class ni tanlashni bilmidi
 *
 * 2)
 * import p1.*;
 * import p2.*;
 * public class C {
 *     public static void main(String[] args) {
 *       A obj = new A(); // ERROR: Reference to A is ambiguous
 *   }
 * }
 * agar ikkala package da ham bir xil class bo`lsayu
 * biz uchinchi 'C' classda qolgan ikkala paskage ning barcha class larini chaqirib olishga ruhsat beriladi
 * ammo to`g`ridan to`g`ri 'A' class class dan yangi obyekt yarata olmimiz
 * pascage ni ko`rsatgan holdagina qilish mumkin
 *
 * 3)
 * import p1.A;
 * import p2.*;
 * public class C {
 *     public static void main(String[] args) {
 *       A obj = new A();
 *   }
 * }
 * default bo`lib to`g`ridan to`g`ri A class import qilingan paskage ni tanlidi
 *
 * 4)
 * import p1.*;
 * import p2.*;
 * public class C {
 *     public static void main(String[] args) {
 *         p1.A obj1 = new p1.A();
 *         p2.A obj2 = new p2.A()
 * }
 * }
 *  pascage ni ko`rsatgan holda qilish mumkin
 * */