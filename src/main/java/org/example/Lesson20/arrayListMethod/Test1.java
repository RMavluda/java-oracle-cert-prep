package org.example.Lesson20.arrayListMethod;

import static java.util.List.copyOf;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

  public static void main(String[] args) {
    ArrayList<String> al1 = new ArrayList<>();
    al1.add("one");
    al1.add("two");
    al1.add("three");
    al1.add("four");
    al1.add("five");
    System.out.println("al1 = " + al1);

//    ArrayList<String> al2 = new ArrayList<>();
//    al2.add("one");
//    al2.add("three");
//    al2.add("four");
//    al2.add("nine");
//    al2.add("ten");

/*    al1.removeAll(al2);
    System.out.println("al1 = " + al1);*/

/*    al1.retainAll(al2);
    System.out.println("al1 = " + al1);*/

/*    boolean result = al1.containsAll(al2);
    *//*
     * contains -->> al1 da al2 ning barcha elementlari bormi?
     * *//*
    System.out.println("result = " + result);*/

//    List<String> sublist = al1.subList(1, 4); // == al1[1,4]
//    System.out.println("sublist = " + sublist);
//    sublist.add("ten");
    /*
    * al1 ga ham "ten" satri qo`shiladi
    * chunki sublist al1 dan farqli bulolmidi
    * sublist al1 ning ko`rinishi holos*/

//    System.out.println("al1 = " + al1);
//    System.out.println("sublist = " + sublist);
//    al1.add("million");
//    System.out.println("al1 = " + al1);
    /*System.out.println("sublist = " + sublist);   --->>>       error bo`ladi
    * chunki nimadir o`zgartirmoqchi bo`lsak faqat view ya`ni sublist orqali o`zgartirishimiz kerak
    * */
//    Object [] array = al1.toArray();
//    String[] array2 = al1.toArray(new String [15]);
//    for(String s : array2){
//      System.out.println(s);
//    }
    List<String> list = List.of("odin", "dva", "tri");
    System.out.println("list = " + list);
  /* list.add("dsmfd");   exception
  * ushbu listga boshqa qo`shimcha elementlar qo`shib bo`lmidi
  * */
    List<String> list2 = copyOf(al1);
    System.out.println("list2 = " + list2);
// ushbu list2 ni ham o`zgartirib bo`lmidi
  }
}
