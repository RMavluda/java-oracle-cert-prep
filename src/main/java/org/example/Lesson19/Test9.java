package org.example.Lesson19;

public class Test9 {

  public static void main(String[] args) {

    int[] array1 = {2, 4, 5, 6};
    int[] array2 = {-6, -3, 5, 7};

    for (int i = 0; i < array1.length && i < array2.length; i++) {
      array1[i] += 3;
      array2[i] += 4;
    }
    for (int a : array1) {
      a += 2;
    }
  }
}
