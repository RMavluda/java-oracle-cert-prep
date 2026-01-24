package org.example.Homework.Lesson_25;

public class Lesson25 {
  public static void main(String[] args) {
    Animal a1 = new Mechenosec("Karl1");
    Animal a2 = new Penguin("Kovalski1");
    Animal a3 = new Lion("Leva1");

    Fish f1 = new Mechenosec("Karl2");
    Bird b1 = new Penguin("Kovalski2");
    Mammal m1 = new Lion("Leva2");

    Mechenosec mech1 = new Mechenosec("Karl3");
    Penguin p1 = new Penguin("Kovalski3");
    Lion l1 = new Lion("Leva3");

    Speakable s1 = new Penguin("Kovalski4");
    Speakable s2 = new Lion("Leva4");
    Animal[] array1 = {a1, a2, a3, f1, b1, m1, mech1, p1, l1};
    Speakable[] array2 = {s1, s2, b1, m1, p1, l1};

    for (Animal a : array1) {
      if (a instanceof Mechenosec) {
        Mechenosec m = (Mechenosec) a;
        System.out.println(m.name);
        m.eat();
        m.sleep();
        m.swim();
      } else if (a instanceof Penguin) {
        Penguin p = (Penguin) a;
        System.out.println(p.name);
        p.eat();
        p.sleep();
        p.fly();
        p.speak();
      } else if (a instanceof Lion) {
        Lion l = (Lion) a;
        System.out.println(l.name);
        l.eat();
        l.sleep();
        l.run();
        l.speak();
      }
      System.out.println("---------------------------->-->-->");
    }
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
    System.out.println("Vsegda interesno nablyudat, kak spyat ryby");
  }

  abstract void swim();
}

abstract class Bird extends Animal implements Speakable {

  Bird(String name) {
    super(name); // bu orqali super class konstruktori ga qiymat yuboriladi
  }

  abstract void fly();

  public void speak() {
    System.out.println(name + " sings");
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
    System.out.println("Mechenosec — krasivaya ryba, kotoraya bystro plavayet!");
  }

  public void eat() {
    System.out.println("Mechenosec ne xishchnaya ryba, i ona yest obychnyy rybiy korm!");
  }
}

class Penguin extends Bird {

  Penguin(String name) {
    super(name);
  }

  public void eat() {
    System.out.println("Penguin lyubit yest rybu");
  }

  public void sleep() {
    System.out.println("Penguins spyat, prizhavshis drug k drugu");
  }

  public void fly() {
    System.out.println("Penguins ne umeyut letat");
  }

  public void speak() {
    System.out.println("Penguins ne umeyut pet, kak solovyi");
  }
}

class Lion extends Mammal {

  Lion(String name) {
    super(name);
  }

  public void eat() {
    System.out.println("Lev, kak lyuboy xishchnik, lyubit myaso");
  }

  public void sleep() {
    System.out.println("Bolshuyu chast dnya lev spit");
  }

  public void run() {
    System.out.println("Lev — eto ne samaya bystraya koshka!");
  }
}
