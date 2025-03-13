package org.example.Homework.lesson_05;

public class Human1 {

  String name;
  Car3 car;
  BankAccount bA;

  void info() {
    System.out.println("Human name: " + name);
    System.out.println("Cars color is: " + car.color);
    System.out.println("Bank account balance is: " + bA.balance);
  }
}

class Human1Test {

  public static void main(String[] args) {
    Human1 h = new Human1();
    h.name = "David";
    h.car = new Car3("red", "V8");
    h.bA = new BankAccount(18, 200.5);
    h.info();
  }
}

class Car3 {

  Car3(String c, String e) {
    color = c;
    engine = e;
  }

  String color;
  String engine;
}

class BankAccount {

  BankAccount(int id2, double balance2) {
    id = id2;
    balance = balance2;
  }

  void popolneniyeScheta(){
    balance++;
  }

  void snyatiyeSoScheta(){
    balance--;
  }

  int id;
  double balance;
}