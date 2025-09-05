package org.example.Lesson20;

import java.util.ArrayList;

public class Test2 {

  public static void main(String[] args) {

    ArrayList<StringBuilder> list = new ArrayList<>();
//      ArrayList <int> list = new ArrayList<>();
//  ko`rinishida yozolmimiz, chunki int primitiv tip, ArrayListda esa obyektlar saqlanadi masalan String, Integer...
    list.add(new StringBuilder("poka"));
    list.add(new StringBuilder("privet"));
    list.add(new StringBuilder("ok"));
    list.add(1, new StringBuilder("hello"));
//     list.add(5, "ok");
//   IndexOutOfBoundsException: Index: 5, Size: 4 ---> o`lchami 4 bo`lgan ArrayListga 5-elementni index orqali qo`shishga ruhsat bermidi
    for (StringBuilder s : list) {
      System.out.print(s + " ");
    }
    System.out.println();
    ArrayList<StringBuilder> list2 = new ArrayList<>();
    list2.add(new StringBuilder("Petrov"));
    list2.add(new StringBuilder("Sidorov"));
    list.addAll(list2);
    for (StringBuilder s : list) {
      System.out.print(s + " ");
    }
    System.out.println();
    list2.set(1, new StringBuilder("Ivanov"));
    for (StringBuilder s : list) {
      System.out.print(s + " ");
    }
  }
}
