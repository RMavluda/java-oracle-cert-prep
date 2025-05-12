package org.example.Lesson18;

public class Test2 {

  public static void main(String[] args) {
    //declaration
    String[] array1;
    int[][] array2;
    int[] array6[]; // => int[][] array6; || int array6[][];
    int[][] array7[]; // => int[][][] array7; || int array7[][][]; || int[] array7[][];
    int[] array, a; // array ham a ham massiv sifatida e`lon qilgan bo`lamiz
    int b [], c; // b massiv, c o`zgaruvchi sifatida e`lon qilgan bo`lamiz, ya`ni c massiv emas
    int[] d, e[][]; // d birlik massiv, e uchlik masssiv sifatida e`lon qilgan bo`lamiz, chunki int[] ikkalasiga ham tasir qiladi


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

    int[] array5 = new int[]{1, 2, 3};
    // mumkin emas !!!
    // int[] array5 = new int[3]{1, 2, 3};
  }

}
