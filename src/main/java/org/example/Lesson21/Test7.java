package org.example.Lesson21;

public class Test7 {

  int t, h = 5, k;
//  k = 11; yozish mumkin emas

  public void abc(int a, int b) {
    System.out.println("privet");
  }

  public void abc(double a, double b) {
    int c;
    c = 10;
    System.out.println("poka");
  }

  public static void main(String[] args) {
    Test7 t = new Test7();
    t.abc(1, 2);
    /*
    bu ko`rinishda int methodga murojat bo`ladi, sababi 1, 2 doubledan ko`ra int ga yaqinroq
    int method kamentga olinsa double methodga murojat qilinadi
    * */
  }
}
