package org.example.Homework.Lesson_18;

public class Exercise1_teachers {

  //Selection sort (classic)
  public static int[] sortirovka(int[] array) {
    int a;
    for (int i = 0; i < array.length - 1; i++) {
      int min = array[i];
      int index = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < min) {
          min = array[j];
          index = j;
        }
      }
      if (i != index) {
        a = array[i];
        array[i] = min;
        array[index] = a;
      }
    }
    return array;
  }
  /*
  * har bir iteratsiyada eng kichik elementni aniqlidi va iteratsiya boshlangan element bilan o`rnini almashtirib boradi
  * masalan: {0, 5, -3, 2}
  * i = 0: iteratsiya 0-elementdan boshlidi, [0:3] oraliqdagi min element indexi 2, 2- va 1- elementlar alamashtiriladi --> {-3, 5, 0, 2}
  * i = 1: iteratsiya 1-elementdan boshlidi, [1:3] oraliqdagi min element indexi 2, 2- va 1- elementlar alamashtiriladi --> {-3, 0, 5, 2}
  * i = 2: iteratsiya 2-elementdan boshlidi, [2:3] oraliqdagi min element indexi 3, 3- va 2- elementlar alamashtiriladi --> {-3, 0, 2, 5}
  * */

  public static void main(String[] args) {
    int[] array = new int[]{5, 8, 1, -3, 0, 8, 2, 2};
    sortirovka(array);
    for(int i = 0; i < array.length; i++){
      System.out.println(array[i]);
    }
  }
}
