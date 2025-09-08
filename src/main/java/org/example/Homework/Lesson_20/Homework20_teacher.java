package org.example.Homework.Lesson_20;

import java.util.ArrayList;
import java.util.Collections;

public class Homework20_teacher {
  public ArrayList<String> abc(String ... s){
    ArrayList<String> aL= new ArrayList<>();
    for(String s1 : s){
      if(!aL.contains(s1)){
        aL.add(s1);
      }
    }
    Collections.sort(aL);
    System.out.println(aL);
    return aL;
  }

  public static void main(String[] args) {
    Homework20_teacher o120 = new Homework20_teacher();
    o120.abc("privet", "poka", "ok", "privet", "kak dela?", "ok", "hello");
  }
}
