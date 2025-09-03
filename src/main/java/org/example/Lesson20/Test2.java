package org.example.Lesson20;

import java.util.ArrayList;

public class Test2 {

  public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<>();
//      ArrayList <int> list = new ArrayList<>();
//  ko`rinishida yozolmimiz, chunki int primitiv tip, ArrayListda esa obyektlar saqlanadi masalan String, Integer...
    list.add("poka");
    list.add("privet");
    list.add("ok");
    list.add(1, "hello");
//     list.add(5, "ok");
//   IndexOutOfBoundsException: Index: 5, Size: 4 ---> o`lchami 4 bo`lgan ArrayListga 5-elementni index orqali qo`shishga ruhsat bermidi
    for (String s : list) {
      System.out.println(s + " ");
    }
    System.out.println();
    System.out.println(list.get(3));
  }
}
