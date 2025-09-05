package org.example.Lesson20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test8 {

  public static void main(String[] args) {
    String s1 = "A";
    String s2 = "B";
    String s3 = "C";
    String s4 = "D";
    ArrayList<String> list1 = new ArrayList<>();
    list1.add(s3);
    list1.add(s1);
    list1.add(s4);
    list1.add(s2);

    Iterator<String> it1 = list1.iterator();
    while (it1.hasNext()) { // keyingi element borligini tekshiradi
      System.out.print(it1.next() + " "); // shu elementni ekranga chiqaradi
    }

    ListIterator<String> it2 = list1.listIterator();
    while (it2.hasNext()) {
      it2.next(); // ushbu elementni tanlab olamiz
      it2.remove(); // ushbu elementni o`chiramiz
    }
  /*
    foreach va iteratorni farqi iteratir orqali elementni o`chirish mumkin
  */
  }

}
