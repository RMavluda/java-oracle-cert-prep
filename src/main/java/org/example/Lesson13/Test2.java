package org.example.Lesson13;

public class Test2 {

  public static void main(String[] args) {
    short denNedeli = 3;
    final int a;
    final int b;

    switch (denNedeli) {
      case 1:
      case 2:
      case 3:
//case 200: kabi yozish mumkin emas, chunki case da yozilgan type switch parametridagi type bn bir xil bo`lishi shart
      case 4:
      case 5:
        System.out.println("Rabota do 18:00");
        break;
      case 6:
        System.out.println("Rabota do 14:00");
        break;
      case 7:
        System.out.println("Raboti net");
        break;
      default:
        System.out.println("Takogo dnya ne sushestvuyet");
    }
    switch ("privet") {
      case "asadsd":
        System.out.println("wrong");
// case null: kabi yozish mumkin emas, null bu yo`qlikdir. ya`ni string hech qanday adresga murojat qilmayapti degani
      default:
        System.out.println("not found");
    }
/*    long l1 = 5L;
    switch (l1){
      case 4L:
        System.out.println(4);
      default:
        System.out.println("xato");
    }*/
  }

}

/*
 * switch(expression)
 * expression bo`lishi mumkin:
 * -byte
 * -short
 * -int
 * -char
 * -String
 *
 * boshqa typelarni qabul qilmidi*/

/*
 * compile time constants ga kiradi:
 * 1, -3.14, "privet*, 5*10 kabilar
 *
 * !!! compile time constants ga kirmaydi:
 * a = 5, b = 10, a * b kabilar
 *
 * final a = 5, final b = 10, a * b qilish orqali buni to`g`irlash mumkin
 *
 * !!! lekin
 * final a, final b, a = 5, b = 10, a*b compile time constants hisoblanmidi
 * */