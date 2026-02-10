package org.example.Lesson28;

import java.util.ArrayList;

public class Test9 {

  public static void main(String[] args) {
//    ArrayList <String> list = new ArrayList<>();
//    list.add("1");
//    list.add("2");
//    System.out.println(list.get(3));
//    System.out.println(5 / 0);

//    Doctor doctor = new Doctor();
//    Teacher teacher = new Teacher();
//    Teacher teacher1 = new Teacher();
//    Teacher [] array2 = {teacher, teacher1};
//    Employee [] array1 = {doctor, teacher};
////    Teacher teacher2 = (Teacher) array1[0];
//    Doctor doctor1 = (Doctor)array2[0];
//createPassword("qwertyuiopasdfghjklzxc");
  }

  public static void createPassword(String pwd) {
    if (pwd.length() < 6) {
      throw new IllegalArgumentException("Password must be at least 6 characters");
    }
    if (pwd.length() > 12) {
      throw new IllegalArgumentException("Password must be at most 12 characters");
    }
    System.out.println("Password is: " + pwd);
  }
}

class Employee {

}

class Doctor extends Employee {

}

class Teacher extends Employee {

}

class Airplane {

  String state = "waiting";

  public void fly() {
    state = "in the air";
    System.out.println("Airplane is flying");
  }

  public void waitForFlight() {
    if (state.equals("in the air")) {
      throw new IllegalStateException("Airplane is in the air");
    }
    state = "waiting";
    System.out.println("Airplane is waiting for flight");
  }

  public void cancelFlight() {
    if (state.equals("in the air")) {
      state = "flight canceled";
      throw new IllegalStateException("Airplane flight is canceled");
    }
  }

  public static void main(String[] args) {
    Airplane airplane = new Airplane();
    airplane.waitForFlight();
    airplane.fly();
    airplane.cancelFlight();
  }
}
