package org.example.Lesson06;

public class MethodOverloading {

  void show(int i1) {
    System.out.println("Data type is int");
    System.out.println(i1);
  }

  void show(boolean b1){
    System.out.println("Data type is boolean");
    System.out.println(b1);
  }

  void show(String s1){
    System.out.println("Data type is String");
    System.out.println(s1);
  }
  void show(String s, int a){
    System.out.println("String: " + s + ", int: " + a);
  }

  void show(int a, String s){
    System.out.println("Have a good day!");
  }

}

class MethodOverloadingTest {

  public static void main(String[] args) {
    MethodOverloading obj = new MethodOverloading();
    int a = 500;
    obj.show(a);
    boolean b = true;
    obj.show(b);
    String s = "Hello";
    obj.show(s);
    obj.show(s, a);
    obj.show(a, s);
  }
}
