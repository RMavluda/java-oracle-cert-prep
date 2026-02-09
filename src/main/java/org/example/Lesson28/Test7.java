package org.example.Lesson28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test7 {

  static FileInputStream fis1, fis2;

  public static void main(String[] args) {
    try {
      fis1 = new FileInputStream("test9.txt");
      System.out.println("Fayl test9 sushestvuyet v sisteme i nayden");
      try {
        fis2.close();
      } catch (IOException e) {
        System.out.println("Vishli problemi so stream-om");
      }
    } catch (FileNotFoundException e) {
      System.out.println("File test9 ne nayden");
    } catch (NullPointerException e) {
      System.out.println("Srabotal NPE");
    }
  }

}
