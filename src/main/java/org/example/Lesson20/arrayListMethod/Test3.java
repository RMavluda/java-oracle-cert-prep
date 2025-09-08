package org.example.Lesson20.arrayListMethod;

import java.util.HashMap;
import java.util.Map;

public class Test3 {

  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    map.put(777, "Ivanov Mikhail");
    map.put(778, "Trebulov Zaur");
    map.put(779, "Sidorova Mariya");
    map.put(780, "Petrov Petr");
    map.put(779, "Mavluda Raximquli");
    /*
    * "Sidorova Mariya" o`rniga yozialdi, chunki bitta key da 2 ta bir xil value tarorlanishi mumkin emas
    * */
    map.put(781, "Trebulov Zaur");
    /*
    * Ammo yangi key da mavjud valueni qo`shish mumkin*/
    map.remove(780);
    System.out.println("map: " + map);

  }

}
