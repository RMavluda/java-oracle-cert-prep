package org.example.Homework.Lesson_11;

public class Car {

  String color;
  String engine;
  int doorsCount;

  Car(String color, String engine) {
    this.color = color;
    this.engine = engine;
  }
}

class CarTest {
  void changeDoorsCount(Car c, int count){
    c.doorsCount = count;
  }

  void changeColor(Car c1, Car c2){
     String temp = c1.color;
    c1.color = c2.color;
    c2.color = temp;
  }

  public static void main(String[] args) {
    CarTest ct = new CarTest();
    Car c1 = new Car("White", "Ford");
    Car c2 = new Car("Black", "Mercedes-Benz");
    ct.changeDoorsCount(c1, 3);
    ct.changeColor(c1, c2);
    System.out.println("Car1: color: " + c1.color + ", engine: " + c1.engine + ", doorsCount: " + c1.doorsCount);
    System.out.println("Car2: color: " + c2.color + ", engine: " + c2.engine + ", doorsCount: " + c2.doorsCount);
  }
}