package org.example.Lesson12;

public class Car {

  int engine;
  int doorCount;

  Car(int engine, int doorCount) {
    this.engine = engine;
    this.doorCount = doorCount;
  }

}

class CarTest {

  public static void main(String[] args) {
    Car c1 = new Car(3, 4);
    Car c2 = new Car(2, 5);

    Car cc = new Car(5, 5);
    Car cb = new Car(5, 5);
    if (cc.equals(cb)) {
      System.out.println("Yessss");
    }
    if (c1.engine > c2.engine) {
      if (c1.doorCount > c2.doorCount) {
        System.out.println("Moshnost matora i kolichestvo dverey u pervoy mashini bolshe");
      } else {
        System.out.println("Moshnost matora pervoy mashini bolshe, a kolichestva dverey menshe");
      }
    } else {
      System.out.println("Moshnost matora u pervoy mashini menshe");
    }
  }
}

/*
 * agar ikkita obyektni == orqali solishtirilsa ularning adreslari solishtiriladi
 * agar hamma paramterlari bir xil bo`lsa ham false bo`lishi mumkin
 * faqatgina ikkala obyekt ham bir adresga murojaat qilsagina bu holat true bo`lishi mumkin
 * //////////////
 * equals methodi barcha class larda default mavjud.
 * string clasidagi equals methodida agar ikkala satr bir xil bo`lsa true qaytaradi
 * reference type larda faqat adresini solishtirish uchun == ishaltiladi, boshqa ma`lumotlari uchun equals ishlatamiz
 * */