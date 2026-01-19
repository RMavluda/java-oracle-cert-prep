package org.example.Lesson25;

public class Test2 {

  public static void main(String[] args) {
    Jumpable jump = new Man();
    Human human = new Human();
    Man man = new Man();
    Student s = new Student();
    if (jump instanceof Jumpable) {
      System.out.println("jump is Jumpable");
    }
    if (jump instanceof Human) {
      System.out.println("jump is Human");
    }
    if (human instanceof Man) {
      System.out.println("human is Man");
    }
    if (man instanceof Human) {
      System.out.println("man is Human");
    }
//    if( s instanceof Human){
//      System.out.println("s is Human");
//    }

    if (s instanceof Jumpable) {
      System.out.println("s is Jumpable");
    }

  }
}

interface Jumpable {

}

class Human implements Jumpable {

}

class Man extends Human {

}

class Student {

}


/*
 * Chap tomondagi reference type ichida o`ng tomondagi type obyekt bo`lish ehtimoli bormi?
 * hech bo`lmaganda bitta holatda mumkin bo`lsa tekshiruvga ruhsat etiladi
 * hech qanday holatda mumkin bo`lmasa compile time ko`rsatiladi
 *
 * masalan:
 * Human human = new Human();
 * if (human instanceof Man) {
 * System.out.println("human is Man");
 * }
 *
 * Man hech bo`lmaganda Humandan extends olib biladimi ?
 * javob ha, ammo bu yerdagi human Humandan extends qilib olingan shu sababli javob false
 *
 *
 *Student s = new Student();
 * if (s instanceof Human) {
 *    System.out.println("s is Human");
 * }
 *
 * Human hech bo`lmaganda Studentdan extends olib biladimi ?
 * javob hech qanday holatda yo`q, chunki student va Human hech qanday bog`liqlikka ega emas
 * */
// --------------------------------------------------------------------------------
/*
* instanceof & interface
*     if (s instanceof Jumpable) {
*       System.out.println("s is Jumpable");
*     }
*
* "Javada qoida bor agar instanceof o`ng tomonida interface bo`lsa, java bunga "ushbu class kelajakda mana shu interface dan implement qilishi mumkinmi ?" deb qaraydi.
*
* yana bir holat compilyator buni "ushbu class interfacedan implementatsiya olmayotgan bo`lsada, uning subclassi balki olgandir?" kabi ko`radi.
* ammo compilyator subcalssning implmentatsiyasini ko`ra olmaganligi uchun xatolik sifatida belgilamidi
 * shu sababli compile time error ko`rsatilmidi
* Student final emas, demak u kelajakda "class Student implements Jumpable{...}" bo`lishi mumkin deb qaraladi
*
* */