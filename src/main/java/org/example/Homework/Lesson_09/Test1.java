package org.example.Homework.Lesson_09;

public class Test1 {
int a = 1;
// static int a = 2;
// garchi static bo`lsada bir xil nom bilan 2 xil variable yaratishga ruhsat berilmidi
void abc(int a){
  System.out.println(a);
  System.out.println(this.a);
}
public static void main(String[] args) {
  Test1 t = new Test1();
  t.abc(3);
}
}