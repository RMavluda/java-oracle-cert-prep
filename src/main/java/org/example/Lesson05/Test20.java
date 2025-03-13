package org.example.Lesson05;

public class Test20 {

  int sum(int a, int b, int c) { //parameters or arguments
    return a + b + c;
  }

  int arithmeticMean(int a1, int b1, int c1) {
    return sum(a1, b1, c1) / 3;
  }
}

class Test21 {

  public static void main(String[] args) {
    Test20 t = new Test20();
    int sumOfThreeNumbers = t.sum(1, 2, 3);
    System.out.println(sumOfThreeNumbers);
    System.out.println(t.sum(15, 23, -1));
    System.out.println(t.arithmeticMean(20, 40, 60));
  }
}