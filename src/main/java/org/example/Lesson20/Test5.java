package org.example.Lesson20;

import java.util.ArrayList;

public class Test5 {

  public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<>();
    list.add(new String("hello"));
    list.add(new String("privet"));
    list.add(new String("poka"));
    list.add(new String("ok"));
    list.add(new String("poka"));
    for(String s : list){
      System.out.print(s + " ");
    }
    System.out.println();
    System.out.println();
    System.out.println("list.indexOf(new String(\"poka\")): " + list.indexOf(new String("poka")));
    System.out.println("list.lastIndexOf(new String(\"poka\")): " + list.lastIndexOf(new String("poka")));
    System.out.println("list.indexOf(new String(\"poka!\")): " + list.indexOf(new String("poka!")));

    System.out.println("list.size(): " + list.size());
    System.out.println();
    list.clear();
    System.out.println("list.isEmpty(): " + list.isEmpty());
  }
}
