package org.example.Lesson05;

public class Test20 {

  int sum(int a, int b, int c) { //parameters or arguments
    int result = a + b + c;
    return result;
  }
}

class Test21{
  public static void main(String[] args){
    Test20 t = new Test20();
    int sumOfThreeNumbers = t.sum(1, 2, 3);
    System.out.println(sumOfThreeNumbers);
    System.out.println(t.sum(15, 23, -1));
  }
}