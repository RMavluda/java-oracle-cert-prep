package org.example.Lesson13;

public class Test2 {

  public static void main(String[] args) {
    switch("Wednesday"){
      case "Monday":
      case "Tuesday":
      case "Wednesday":
      case "Thursday":
      case "Friday":
        System.out.println("Rabota do 18:00");
        break;
      case "Saturday":
        System.out.println("Rabota do 14:00");
        break;
      case "Sunday":
        System.out.println("Raboti net");
        break;
      default:
        System.out.println("Takogo dnya ne sushestvuyet");
    }
  }

}
