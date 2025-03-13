package org.example.Lesson05;

public class Car2 {

  String color;
  String engine;
  int speed;

  void gas(int s){
    speed += s;
  }

  void brake(int b){
    speed -= b;
  }

  void showInfo(){
    System.out.println("Color: " + color);
    System.out.println("Engine: " + engine);
    System.out.println("Speed: " + speed);
  }

}

class Car2Test{
  public static void main(String[] args){
    Car2 c1 = new Car2();
    c1.color = "White";
    c1.engine = "VG";
    c1.speed = 60;

    c1.showInfo();
    c1.gas(20);
    c1.showInfo();
    c1.brake(80);
    c1.showInfo();
  }
    }
