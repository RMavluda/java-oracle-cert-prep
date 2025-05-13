package org.example.Homework.Lesson_18;

public class Exercise1_teachers {

  public static int[] sortirovka(int[] array) {
    int a;
    for(int i = 0; i < array.length - 1; i++) {
      int min = array[i];
      int index = i;
      for(int j = i + 1; j < array.length; j++){
        if(array[j] < min){
          min = array[j];
          index = j;
        }
      }
      if(i != index){
        a = array[i];
        array[i] = min;
        array[index] = a;
      }
    }
    return array;
  }

  public static void main(String[] args) {
    int[] array = new int[]{5, 8, 1, -3, 0, 8, 2, 2};
    sortirovka(array);
    for(int i = 0; i < array.length; i++){
      System.out.println(array[i]);
    }
  }
}
