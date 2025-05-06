package org.example.Lesson17;

public class Test11 {

  public static void main(String[] args) {
    String s1 = "hello";
    System.out.println(s1.isBlank());

    String s2 = "    ";
    System.out.println(s2.isBlank());

//    String s3 = null; ==>> exception
    String s3 = " ";
    System.out.println(s3.isEmpty());

    String s4 = "     hello    ";
    System.out.println(s4.strip()); // satr boshidagi va oxiridagi bo`sh belgilar o`chriladi

    String s5 = "hello    ";
    System.out.println(s5.stripLeading()); // satr boshidagi bo`sh belgilarni o`chiradi, oxirdagilar o`chmidi

    String s6 = "     hello    ";
    System.out.println(s6.stripTrailing()); // satr oxiridagi bo`sh belgilarni o`chiradi, boshidagilar o`chmidi

    String s7 = "bye  ";
    String s8 = s5.strip();
    System.out.println(s7 == s8);
    /*
     * -agar strip qilinganda satr o`zgarmasa uning adresi ham o`zgarmaydi
     * -agar satr o`zgarsa demak metod orqali yaratilgan yangi obyekt sifatida heap da joylashadi
     * va adreslari har xilligi hisobiga javob false bo`ladi
     * */

  }

}
