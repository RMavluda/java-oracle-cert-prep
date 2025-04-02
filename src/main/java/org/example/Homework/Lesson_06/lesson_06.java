package org.example.Homework.Lesson_06;

public class lesson_06 {

  void sum() {
    System.out.println("Sum zero numbers: " + 0);
  }

  void sumTwoNumbers(int a, int b) {
    System.out.println("Sum two numbers: " + (a + b));
  }

  void sumThreeNumbers(int a, int b, int c){
    System.out.println("Sum three numbers: " + (a + b + c));
  }

  void sumFourNumbers(int a, int b, int c, int d){
    System.out.println("Sum four numbers: " + (a + b + c + d));
  }
}

class lesson_06Test {

  public static void main(String[] args) {
    lesson_06 obj = new lesson_06();
    obj.sum();
    obj.sumTwoNumbers(1, 2);
    obj.sumThreeNumbers(1, 2, 3);
    obj.sumFourNumbers(1, 2, 3, 4);

  }
}