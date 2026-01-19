package org.example.Lesson25;

public class NewClass {

}

class Car{
  static int a = 5;

  public static void main(String[] args) {

    Car c = new Car();
    System.out.println(c.a);
    c = null;
//    agar int static bo`lmaganida NPE chiqardi
//    bu yerda c nimaga havola ko`rsatayotgani emas Car classidagi static field ko`rsatiladi.
    System.out.println(c.a);
  }
}




/*
* Polimorphism bu obyektning bir nechta ko`rinishda aks etishini anglatadi
* Obyekt polimorf hisobnlanadi qachonki birdan ortiq IS-A ega bo`lsa
* Bir obyekt bir nechta tur sifatda ishlatilishi --> POLIMORPHISM
* */


/*
* Operator instanceOf qachonki obyekt va class orasida IS-A bog`liqlik mavjud bo`lganida tekshiradi.
* Agar IS-A bo`gliqlik mavjud bo`lmasa, kompilyaot xatolik qaytaradi
* */