package org.example.Lesson04;

public class Car {

  Car(String svet, String motor) {
    color = svet;
    engine = motor;

    System.out.println("Cars color is: " + color);
    System.out.println("Cars engine is: " + engine);
  }

//  Car() {
//    color = "blue";
//    engine = "V12";
//  }

/*  Car() {
    System.out.println("Object is created");
  }*/

  /*
  Car(String svet, String motor) {
    color = svet;
    engine = motor;
  }
*/
  String color;
  String engine;
}

class carTest {

  public static void main(String[] args) {

    Car car1 = new Car("White", "V10");
    Car car2 = new Car("Black", "V20");
//    System.out.println("Color car2: " + car2.color);
//    System.out.println("Engine car2: " + car2.engine);

//    Car car1 = new Car("yellow", "V4");

//    Car car2 = new Car();
//    Car car2 = car1;
//    Car car3;

//    System.out.println(car1.color);
//    System.out.println(car1.engine);

//    car1.color = "black";
//    car1.engine = "V8";
//
//    System.out.println("Color car1: " + car1.color);
//    System.out.println("Engine car1: " + car1.engine);

//    System.out.println(car2.engine);
//    System.out.println(new Car().color); // boshqa bu obyektga murojat qilib bo`lmaydi
  }
}