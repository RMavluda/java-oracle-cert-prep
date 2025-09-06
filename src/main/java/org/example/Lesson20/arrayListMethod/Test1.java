package org.example.Lesson20.arrayListMethod;

import java.util.ArrayList;

public class Test1 {

  public static void main(String[] args) {
    ArrayList<String> al1 = new ArrayList<>();
    al1.add("one");
    al1.add("two");
    al1.add("three");
    al1.add("four");
    al1.add("five");
    System.out.println("al1 = " + al1);
    ArrayList<String> al2 = new ArrayList<>();
    al2.add("one");
    al2.add("three");
    al2.add("four");
    al2.add("nine");
    al2.add("ten");

/*    al1.removeAll(al2);
    System.out.println("al1 = " + al1);*/

/*    al1.retainAll(al2);
    System.out.println("al1 = " + al1);*/

/*    boolean result = al1.containsAll(al2);
    *//*
     * contains -->> al1 da al2 ning barcha elementlari bormi?
     * *//*
    System.out.println("result = " + result);*/

  }
}
