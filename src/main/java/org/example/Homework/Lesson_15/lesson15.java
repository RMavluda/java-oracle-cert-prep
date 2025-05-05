package org.example.Homework.Lesson_15;

public class lesson15 {

  static void clock() {
    int chas = 0;
    OUTLINE:
    while (chas < 6) {
      int minuta = -1;
      MIDDLE:
      do {
        minuta++;
        if (chas > 1 && minuta % 10 == 0) {
          break OUTLINE;
        }
        int sekunda = 0;
        INNER:
        while (sekunda < 60) {
          if (sekunda * chas > minuta) {
            continue INNER;
          }
          System.out.println(chas + ":" + minuta + ":" + sekunda);
          sekunda++;
        }
      } while (minuta < 59);
      chas++;
    }
  }

  public static void main(String[] args) {
    clock();
  }
}
