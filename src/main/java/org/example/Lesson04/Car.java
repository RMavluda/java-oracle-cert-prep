package org.example.Lesson04;

public class Car {

  String color = "red";
  String engine = "v6";
}

class carTest {

  public static void main(String[] args) {
    int a;
    Car car1 = new Car();
//    Car car2 = new Car();
//    Car car2 = car1;
//    Car car3;

    car1.color = "black";
    car1.engine = "V8";
    System.out.println("Color: " + car1.color);
    System.out.println("Engine: " + car1.engine);

//    System.out.println(car2.engine);
//    System.out.println(new Car().color); // boshqa bu obyektga murojat qilib bo`lmaydi
  }
}