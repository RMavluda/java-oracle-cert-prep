package org.example.Lesson06;

public class MethodOverloading2 {

  /*
  method faqatgina bir xil nomga ega, ammo har xil parametrga ega bo`lgandagina overloading method bo`ladi.
  acsess modifiers ham, return type ham, hech narsa overloading bo`lolmaydi

  */
  public int sum(int i1, int i2) {
    return i1 + i2;
  }

  protected String sum(String s1, String s2) {
    return s1 + s2;
  }

/*
  protected void sum(int a, int b){
    System.out.println("Hellooo");
  }

  yuqoridagi qoidaga ko`ra, ushbu ko`rinishda method yaratib bo`lmidi
  */
}

class MethodOverloading2Test {

  public static void main(String[] args) {
    MethodOverloading2 m = new MethodOverloading2();

    int a = m.sum(1, 2);
    System.out.println(a);
    String s = m.sum("Hello", " my friend!");
    System.out.println(s);
  }
}