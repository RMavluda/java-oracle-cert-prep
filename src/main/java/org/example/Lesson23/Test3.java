package org.example.Lesson23;

public class Test3 {

  public static void main(String[] args) {
    Employee1 e = new Teacher1();
    e.eat();
  }

}

class Eda {}

class Frukti extends Eda {}

class Employee1 {

  double salary = 100;
  String name = "Kolya";
  int age;
  int experience;

/*  void eat(){
    System.out.println("Kushatet rabotnik");
  }*/

  public Eda eat(){
    System.out.println("Kushatet rabotnik");
    Eda e = new Eda();
    return e;
  }

//  int eat() {
//    System.out.println("Kushatet rabotnik");
//    return 55;
//  }

  void sleep() {
    System.out.println("Spat");
  }
}

class Teacher1 extends Employee1 {

/*  //overriding method, faqatgina method nomi va argumentlari bir xil bo`lsagina overriding hisoblanadi
  void eat(){
    System.out.println("Kushayet uchitel");
  }*/

  // return type super-class bilan bir xil bo`lmasligi mumkin, faqat return type sub-class return type ning sub-classi bo`la oladi
 /* Overridingda visibility (ko‘rinish) faqat kengaytiriladi yoki o‘sha holatda qoladi
    Lekin hech qachon kamaytirilmidi*/
  public Frukti eat(){

    System.out.println("Kushatet uchitel");
    Frukti f = new Frukti();
    return f;
  }

/*  // primitive type larda sub-class bo`lmaganligi uchun, overriding method return type super class return type bilan bir xil bo`lishi kerak
  int eat() {
    System.out.println("Kushatet rabotnik");
    return 4;
  }*/

  int kolvoUchenikov;

  void uchit() {
    System.out.println("Uchit");
  }
}

class A {

  Employee1 objectCreation() {
    return new Employee1();
  }
}

class B extends A {

  H objectCreation() {
    System.out.println("OK");
    return new H();
  }
//super-class methodi sub-class da ham bir xil yozilsada, bu overriding hisoblanadi
}

class H extends Teacher1 {

}