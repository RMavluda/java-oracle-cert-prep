package org.example.Homework.Lesson_18;

public class Exercise1_my {

  public static int[] descending(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] < array[j]) {
          int temp = array[j];
          array[j] = array[i];
          array[i] = temp;
        }
      }
    }
    return array;
  }

  public static int[] ascending(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] > array[j]) {
          int temp = array[j];
          array[j] = array[i];
          array[i] = temp;
        }
      }
    }
    return array;
  }

  public static void showArray(int[] array) {
    for (int element : array) {
      System.out.print(element + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] array = new int[]{101, -2, 32, -41, 57, 6, -74, 80, 91};
    showArray(array);
    descending(array);
    showArray(array);
    ascending(array);
    showArray(array);
  }
}
