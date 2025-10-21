package org.example.Homework.Lesson_23;

class X4 {

}
class Y4 extends X4{}

public class Test4{
  public static void abc(X4 x, Y4 y){
    System.out.println("Privet");
  }
  public static void abc(Y4 y, X4 x){
    System.out.println("Poka");
  }
  public static void main(String[] args) {
    Y4 a = new Y4();
    X4 b = new X4();
    abc(b, a);
//    compilyator aynan qaysi methodni chaqirishni bilmidi, shu sababli error bo`ladi
//    ikkala metod teng darajada spesifik
//    abc(a, a);
//    abc(b, b);
  }
}