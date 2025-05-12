package org.example.Lesson18;

public class Test2 {

  public static void main(String[] args) {
    //declaration
    String[] array1;
    int[][] array2;
    // location
    array1 = new String[3];
    array2 = new int[3][0];

    for (int i = 0; i < array1.length; i++) {
      //initialization
      array1[i] = "privet" + i;
      System.out.println(array1[i]);
    }

    array2[0] = new int[5];
    array2[1] = new int[2];
    array2[2] = new int[7];

    for (int i = 0; i < array2.length; i++) {
      for (int j = 0; j < array2[i].length; j++) {
        array2[i][j] = i + j;
        System.out.println(array2[i][j]);
      }
    }
    // declaration & location & initialization
    int[] array3 = {1, 2, 3};

    //declaration
    int[] array4;

    //location & initialization
    array4 = new int[]{1, 2, 3};

    // tak nelzya!!!! massiv o`lchami e`lon qilinmasdan unga ma`lumot kiritixh mumkin emas
    // array4 = {1, 2, 3};
  }

}
