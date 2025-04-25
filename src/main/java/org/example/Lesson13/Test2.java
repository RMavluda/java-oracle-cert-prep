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
/*    long l1 = 5L;
    switch (l1){
      case 4L:
        System.out.println(4);
      default:
        System.out.println("xato");
    }*/
  }

}

/*
* switch(expression)
* expression bo`lishi mumkin:
* -byte
* -short
* -int
* -char
* -String
*
* boshqa typelarni qabul qilmidi*/