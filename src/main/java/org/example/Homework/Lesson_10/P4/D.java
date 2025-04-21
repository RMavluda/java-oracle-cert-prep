package org.example.Homework.Lesson_10.P4;

import org.example.Homework.Lesson_10.P1.A;
import org.example.Homework.Lesson_10.P1.P2.B;
import org.example.Homework.Lesson_10.P1.P2.P3.C;
import org.example.Homework.Lesson_10.P4.P5.*;

import static org.example.Homework.Lesson_10.P1.P2.B.b1;

public class D {

  public static void main(String[] args) {
    A a = new A();
    System.out.println(a.str1);

    B b = new B();
    b.showBoolean();

    C c = new C();
    c.showMessage();

    E e = new E();
    System.out.println(e.xyz);

    System.out.println(b1);


  }
}

/*
 * import statement bir paketdagi bitta yoki barcha classlar ni import qiladi
 * import static statement bir paketdagi bitta yoki barcha static elemntlarni import qiladi
 * */