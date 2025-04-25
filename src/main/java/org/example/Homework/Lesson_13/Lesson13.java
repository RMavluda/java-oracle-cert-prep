package org.example.Homework.Lesson_13;

public class Lesson13 {

}
class Month {

  public static void dayQuantity(int n) {

    switch (n) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        System.out.println("Number of days in a month: 31");
        break;
      case 2:
        System.out.println("Number of days in a month: 28");
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        System.out.println("Number of days in a month: 30");
        break;
      default:
        System.out.println("A month with such a serial number does not exist");
    }
  }

  public static void main(String[] args) {
    Month.dayQuantity(0);
    dayQuantity(1);
    Month.dayQuantity(2);
    dayQuantity(4);
    Month.dayQuantity(-5);
  }
}
