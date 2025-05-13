package org.example.Homework.Lesson_18;

public class Exercise2 {

  public static void showArray(String[][] array) {
    System.out.print("{  ");
    for (int i = 0; i < array.length; i++) {
      System.out.print("(");
      for (int j = 0; j < array[i].length; j++) {
        if (j != array[i].length - 1) {
          System.out.print(array[i][j] + ", ");
        } else {
          System.out.print(array[i][j]);
        }
      }
      if (i != array.length - 1) {
        System.out.print("), ");
      } else {
        System.out.print("}");
      }
    }
    System.out.println("  }");

    /*
     * array[i].length --> i-chi qator (sub-massiv) dagi ustunlar soni (ichki massiv uzunligi)
     * array.length --> qatorlar soni ( ya`ni, tashqi massiv uzunligi)
     * */
  }

  public static void main(String[] args) {
    /*
     * Jagged Arrays:
     * Javada massivlar to`g`ri to`rtburchak bo`lishi shart emas.
     * Har bir qatorda ustunlar soni har xil bo`lishi mumkin.
     * Bunday massivlar "jagged arrays" deb ataladi.
     * */
    String array[][] = {{"apple", "orange"}, {"hello", "bye", "ok"}, {"car"}};
    showArray(array);
    showArray(new String[][]{{"man", "woman"}, {"male", "female"}});
  }
}
