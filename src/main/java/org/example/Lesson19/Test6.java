package org.example.Lesson19;

public class Test6 {

  public static void main(String[] args) {
    int[][] array = {{1, 2, 3}, {4, 5, 6, 4, 6, 5}, {7, 8, 9, 1, -11}};
//    for (int i = 0; i < array.length; i++) {
//      for (int j = 0; j < array[i].length; j++) {
//        System.out.print(array[i][j] + " ");
//      }
//      System.out.println();
//    }

    for(int [] array2 : array){
      for(int a : array2){
        System.out.print(a + " ");
      }
      System.out.println();
    }
  }
}
