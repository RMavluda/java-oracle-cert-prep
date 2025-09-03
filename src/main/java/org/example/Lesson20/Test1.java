package org.example.Lesson20;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add("hello");
    Car c = new Car();
    list.add(c);
    Student s = new Student();
    list.add(s);
    list.add(new StringBuilder("ok"));

    // yuqoridagi holatda deyarli ummuman ishlatilmidi, chunki hamma ArrayListda faqat bitta type buyicha saqlashni afzal ko`radi

    ArrayList<String> list2 = new ArrayList<String>();
    list2.add("poka");
//    list2.add(s);
//    xato chunki biz list2 ArrayListda faqat String type dagi ma`lumotlarni saqlay olamiz

    ArrayList<StringBuilder> list3 = new ArrayList<>();
//    List<StringBuilder> list4 = new ArrayList<>();
//    ushbu ko`rinishda ham yozish mumkin

    list3.add(new StringBuilder("ok"));
  }

}

class Car {

}

class Student {

}