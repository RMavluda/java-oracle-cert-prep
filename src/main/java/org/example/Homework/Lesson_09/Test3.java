package org.example.Homework.Lesson_09;

public class Test3 {
int a = 1;
static int b = 2;
void abc(int a){
  System.out.println(a); // parametrdagi a
  System.out.println(b); // class ga tegishli variable b
  System.out.println(this.a); // obyektga tegishli a
  System.out.println(Test3.b); // class ga tegishli b
}

  public static void main(String[] args) {
    Test3 t = new Test3();
    t.abc(4);
  }
}