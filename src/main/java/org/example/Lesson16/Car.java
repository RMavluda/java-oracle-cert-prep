package org.example.Lesson16;

public class Car {

  String color;
  String engine;

  Car(String color, String engine) {
    this.color = color;
    this.engine = engine;
  }

  final static int a = 5;

  public Car abc(String svet){
    Car c10 = new Car(svet, "V4");
    return c10;
  }

}
class TestCar{
final static Car car = new Car("red", "V9");
  public static void main(String[] args) {
    Car c = new Car("red", "V8");
    Car c2 = c.abc("black");
    System.out.println(c.color + " " + c.engine);
    System.out.println(c2.color + " " + c2.engine);
  }
}