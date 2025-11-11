package org.example.Lesson24;

public class Test2 {

  public static void main(String[] args) {

  }
}
class X{

}

abstract class Figura extends X {

  int kolichestvoStoron = 0;

//  abstract metodlar static bo`la olmaydi, chunki ularni perezapisat qilish shart
  abstract void perimeter();

  abstract void ploshad();

  void showInfo() {
    System.out.println("Eto figura");
  }
}
//
//class Kavdrat {
//
//}
//
//class Pryamaugolnik {
//
//}


abstract class Kvadrat extends Figura {

  int kolichestvoStoron = 4;
  int storona1 = 10;

  void perimeter() {
    System.out.println("Perimeter kvadrata: " + 4 * storona1);
  }

  public void ploshad() {
    System.out.println("Ploshad kvadrata " + storona1 * storona1);
  }
}

class XXX extends Kvadrat{

}

class Pryamougolnik extends Figura {

  int kolichestvoStoron = 4;
  int storona1 = 8;
  int storona2 = 5;

  public void perimeter() {
    System.out.println("Perimeter kvadrata = " + 2 * (storona1 + storona2));
  }

  public void ploshad() {
    System.out.println("Ploshad kvadrata = " + storona1 * storona2);
  }
}

class Okrujnost extends Figura {

  int kolichestvoStoron = 0;
  int radius = 3;

  public void perimeter() {
    System.out.println("Perimeter kvadrata = " + 2 * 3.14 * radius);
  }

  public void ploshad() {
    System.out.println("Ploshad kvadrata = " + 3.14 * radius * radius);
  }
}

abstract class Chetirexugolnik extends Figura {

  void def() {
    System.out.println("Eto chetirexugolnik");
  }
}