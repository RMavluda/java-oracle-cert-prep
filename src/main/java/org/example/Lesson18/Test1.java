package org.example.Lesson18;

public class Test1 {

  public static void main(String[] args) {
    // declaration
    int[] array1;
    String[] array2;
    double[][] array3;
    int[][] array10;
    double[] array5;
    double[] array7;

    // location
//    array1 = new int[8];
//    array1[8] = new int; kabi yozish mumkin emas, massiv olchami doim ong tomonda elon qilinishi kerak
//    array1 = new int[-4]; kabi ham mumkin emas => NegativeSizeArrayException
    array2 = new String[3];
    array3 = new double[4][2];

    array10 = new int[3][];

    System.out.println(array2.length);

    // static initialization
    array2[0] = "privet";
    array2[1] = "poka";
    array2[2] = "ok";

    array3[0][0] = 3.14;
    array3[2][1] = 3.14;

    array5 = new double[2];
    array5[0] = 2.5;
    array5[1] = 3.5;
    array7 = array5;
    array3[1] = array5;

    System.out.println(array3[1][0]);
  }

}
