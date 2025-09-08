package org.example.Homework.Lesson_20;

import java.util.HashSet;
import java.util.Set;

public class Homework20_my {
  static Set<String> abc(String ... str){
    Set<String> set = new HashSet<>();
    for(String s : str){
      set.add(s);
    }
    return set;
  }

  public static void main(String[] args) {
    String [] str = new String[]{"one", "two", "one", "two", "two", "three", "three", "four", "zero"};

    System.out.println(abc(str));
  }
}
