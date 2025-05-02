package org.example.Homework.Lesson_14;

public class lesson14 {

  static void clock() {
    OUTLINE:
    for (int i = 0; i < 6; i++) {
      MIDDLE:
      for (int j = 0; j < 60; j++) {
        if (i > 1 && j % 10 == 0) {
          break OUTLINE;
        }
        INNER:
        for (int k = 0; k < 60; k++) {

          if (k * i > j) {
            continue INNER;
          }
          System.out.println(i + ":" + j + ":" + k);
        }
      }
    }
  }

  public static void main(String[] args) {
    clock();
  }
}
