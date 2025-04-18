package org.example.Lesson09;

public class Car {

  final int XYZ = 3;
  int aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa = 5;
  int _ed = 10;
  int Zddas = 20;
  int $s = 30;
  int d8 = 40;
 /*
 * final type larni doim katta xarf bilan yozish tavsiya qilinadi
 * int true = 22; kabilar mumkin emas
 * int True = 2; kabilar mumkin, ammo tavsiya qilinmidi
 * */

  String color;
  int a = 10;
  String engine;
  static int count;
//  static boolean a = true; hattoki static bo`lsa ham, bu ko`rinishda yaratish mumkin emas

/*
   this ni static metod va variable larda ishlatish mumkin emas.
   chunki static type class ga tegishli, this esa obyektga.
   class ga tegishli (o`zgaruvchi yoki metodni) hali obyekt yaratilmasidan avval mavjud hisoblanadi
   va uni mavhumlikka tenglab bo`lmidi

  static int count = this.a;
  public static void changeA(int b){
    this.a = b;
  }*/

  public static void changeA(int b) {
    Car c = new Car("black", "V8");
    c.a = b;
  }

  Car(String color, String engine) {
    this.count++;
    this.color = color;
    this.engine = engine;
  }

  public void showColor() {
    System.out.println("Cars color: " + color);
    this.changeColor("red");
  }

  public void changeColor(String color3) {
    System.out.println("Cars color is changed");
    int price = 5000;
    color = color3;
    price += 1000;
  }

  void abc(int a, int b){
    /*
    boolean a = 10;
    kabi yozish mumkin emas, chunki bu parametrdagi variable ni nomi
     */
    boolean c = true;
  }

  void abcd(int a, int b){
    boolean c = true;
  }

  // yuqoridagi ikkala metoddagi c bir birini kesib o`tmidi

  void changeColor2(String color){
   System.out.println(color);
  }

  public static void main(String[] args){
    Car c = new Car("black", "V8");
    System.out.println(c.color);
    c.changeColor2("black");
    System.out.println(c.color);
  }
}
