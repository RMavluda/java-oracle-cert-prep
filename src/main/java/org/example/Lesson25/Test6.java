package org.example.Lesson25;

// Primitive data types casting
public class Test6 {

  public static void main(String[] args) {
///*
//* casting orqali katta type larni kichik typelarga yozish mumkin
//* */
//    byte b = 10;
//    int a = b;
//    System.out.println(7);
//
//    /*
//     * int --> byte short char bilan casting bo`la oladi, qachonki:
//     * int constanta bo`lganida
//     * int qiyamti berilgan qiymat oralig`iga mos bo`lganida
//     * */
//    int i1 = 3;
////    final int i1 = 3;
//    short s2 = (short) i1;
//    byte b2 = 127;
//    short s1 = -6;
//    char c1 = 100;
//
//    long l1 = 1;
//    int i2 = (int) l1;
//
//
//    int i10 = 111111;
//    short s10 = (short) i10;
//    System.out.println(s10); // bu holatda int typedagi qiymat short type ga sig`maganligi uchun. chegaraning aylanib minus qiymatga o`tib ketadi
//
//    char ch10 = (char)-8; // bu yerda ham castingda char manfiy qiyamt qabul qilamsdan, qandaydir musbat qiymatga o`zgartirib yuboradi
//    System.out.println(ch10);
//
//    boolean b10 = true;
////    int i11 = (int)b10;
//    int i12 = (int)3.1415926535;
//    System.out.println(i12);
//
//    double d = 59845945.2323;
//    byte b12 = (byte)d;
//    System.out.println(b12);

//    int i = 2147483647;
//    System.out.println(i + 1);

//    NUMERIC PROMOTION

    int i = 5;
    long l = 10;
    System.out.println(i + 1); // avvaliga i long tipiga konvertatsiya bo`ladi va + 1 orqali long tipidagi javob ko`rsatialdi
//    i = i * l;   bu yerda: i * l, avvaliga i long typega o`tadi va long ga ko`paytiriladi. ya`ni long * long. long * long ni castingsiz int i o`zgaruvchisiga tenglolmimiz
//    i = (int)i * l;
    i *= l; // bu yerda: i * l, i longga konvertatsiya bo`ladi. l shundog`am long. long * long = long. keyin bu long int bn casting(JAVADA BU KABI AMALLAR UCHUN YASHIRIN CAST MAVJUD) bo`ladi.

    float f = 3.14f;
    int i2 = 10;
    System.out.println(f + i2); //float

    byte b = 3;
    short s = 4;
    char c = 5;
    System.out.println(b + s + c); // int
    System.out.println(b++); // byte


    byte b2 = 10;
    float f2 = 7;
    double d2 = 2.0;
    System.out.println(b2 + f2 - d2); // double

    double d10 = 3.14;
    float f10 = 6.28f;
    System.out.println(d10 + f10); // double

    float f11 = 0*1.5f;
//    or
    float f12 = 0 * (float)1.5;
  }

}


/*
*       QOIDA 1:         *=, +=, -= kabi compound assignment operatorlar o‘z ichida yashirin cast qiladi.
*       QOIDA 2:         agar ikkita butun va vergulli sonalr casting qilinsa, java avtomatik vergulli songa kenvertatsiya qiladi.
*       QOIDA 3:         agar short, byte, char lar casting bolganida, hatto int qanashmayotgan bo`lsa ham int ga konvertatsiya bo`ladi. faqat unar operator ++ da bu ishlamaydi
 * */