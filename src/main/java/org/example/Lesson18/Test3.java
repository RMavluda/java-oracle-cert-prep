package org.example.Lesson18;

public class Test3 {

  static String s;

  public static void main(String[] args) {
//    int[] array = new int[-3]; => NegativeArraySizeException
    int[] array = new int[3];
    array[0] = 1;
    array[1] = 2;
    array[2] = 3;
//    array[3] = 3; => ArrayIndexOutOfBoundsException

    int[][] array2 = new int[3][];
//    System.out.println(array2[0][1]); => NullPointerException

//    System.out.println(s.length()); => NullPointerException

  }

}
