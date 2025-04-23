package org.example.Homework.Lesson_11;

public class Car {

  String color;
  String engine;
  public static int doorsCount;

  Car(String color, String engine) {
    this.color = color;
    this.engine = engine;
  }
}

class CarTest {
  void changeDoorsCount(int count){
    Car.doorsCount = count;
  }

  void swap(Car c1, Car c2){
     String temp = c1.color;
    c1.color = c2.color;
    c2.color = temp;
  }

  public static void main(String[] args) {
    Car c1 = new Car("White", "Ford");
    Car c2 = new Car("Black", "Mercedes-Benz");
    
  }
}