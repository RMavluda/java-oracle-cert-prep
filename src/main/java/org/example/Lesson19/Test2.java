package org.example.Lesson19;

public class Test2 {
  static void summa(String s, int ... a){
    int summa = 0;
    for(int i = 0; i < a.length; i++) {
      summa += a[i];
    }
    System.out.println(s + " " + summa);
  }

  public static void main(String[] args) {
    summa("ok",1,2,3,4,5,6,7,8,9);
    summa("done", new int []{3, 5});
//    summa("exception", null);
  }
}
/*
* varargs parametr dan keyin boshqa parametr berilishi mumkin emas
* faqat undan oldin kiritish mumkin bo`ladi
* faqat int emas, String kabi type larda ham varargs qilish mumkin
* varargs o`rniga massiv yozish ham mumkin
* */