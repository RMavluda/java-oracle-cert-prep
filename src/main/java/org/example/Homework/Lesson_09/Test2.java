package org.example.Homework.Lesson_09;

public class Test2 {
int a = 1;
static int b = 2;
static void abc(final int a){
  System.out.println(a); // shunchaki 2 yozilsa parametrdagi 2 olinadi
  System.out.println(Test2.b);
}

  public static void main(String[] args) {
    abc(5);
  }
}