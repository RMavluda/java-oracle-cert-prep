package org.example.Homework.Lesson_24;

public class Lesson24 {

  public static void main(String[] args) {
    Mechenosec m = new Mechenosec("Karl");
    System.out.println(m.name);
    m.eat();
    m.sleep();
    m.swim();
    Speakable s1 = new Penguin("Kovalski");
    s1.speak();
    Animal a = new Lion("Leva1");
    System.out.println(a.name);
    a.eat();
    a.sleep();
    Mammal mam = new Lion("Leva2");
    System.out.println(mam.name);
    mam.eat();
    mam.sleep();
    mam.run();
    mam.speak();
  }
}

abstract class Animal {

  Animal(String name) {
    this.name = name;
  }

  String name;

  abstract void eat();

  abstract void sleep();
}

abstract class Fish extends Animal {

  Fish(String name) {
    super(name);
  }

  public void sleep() {
    System.out.println("Vsegda interecno nablyudat, akk spyat ribi");
  }

  abstract void swim();

}

abstract class Bird extends Animal implements Speakable {

  Bird(String name) {
    super(name); // bu orqali super class constructoriga qiymat yuboriladi
  }

  abstract void fly();

  public void speak() {
    System.out.println(name + "sings");
  }
}

abstract class Mammal extends Animal implements Speakable {

  Mammal(String name) {
    super(name);
  }

  abstract void run();
}

interface Speakable {

  default void speak() {
    System.out.println("Somebody speaks");
  }
}

class Mechenosec extends Fish {

  Mechenosec(String name) {
    super(name);
  }

  public void swim() {
    System.out.println("Mehcenosec krasivaya riba, kotoraya bistro plavayet!");
  }

  public void eat() {
    System.out.println("Mehcenosec ne xishnaya riba, i ona est obishniy ribiy krom!");
  }
}

class Penguin extends Bird {

  Penguin(String name) {
    super(name);
  }

  public void eat() {
    System.out.println("Penguin lyubit yest ribu");
  }

  public void sleep() {
    System.out.println("Penguins spyat prijavshiy drug k drugu");
  }

  public void fly() {
    System.out.println("Penguins ne umeyut letat");
  }

  public void speak() {
    System.out.println("Penguins ne umeyut pet tak solovyi");
  }
}

class Lion extends Mammal {

  Lion(String name) {
    super(name);
  }

  public void eat() {
    System.out.println("Lev kak lyuvboy xishnik, lyubit myaso");
  }

  public void sleep() {
    System.out.println("Bolshuyu chast dnya lev spit");
  }

  public void run() {
    System.out.println("Lev-eto ne samaya bistraya koshka!");
  }

}


