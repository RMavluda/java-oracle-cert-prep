package org.example.Lesson25;

public class Test1 {

  public static void main(String[] args) {

//    Driver[] array1 = {new Driver(), new Driver()};
//    Employee[] array2 = {new Driver(), new Driver(), new Teacher(), new Doctor()};
//    Help_able[] array3 = {new Driver(), new Driver(), new Teacher(), new Doctor()};

    Employee3 emp1 = new Teacher();
    Employee3 emp2 = new Driver();
    Employee3 emp3 = new Doctor();
    Employee3[] arr = {emp1, emp2, emp3};
    String s1 = null;
    Object o = new Object();

/*    for(Employee emp : arr){
      emp.work();
    }*/

    System.out.println(emp1 instanceof Employee3);
    System.out.println(emp1 instanceof Teacher);
    System.out.println(emp1 instanceof Driver);
    System.out.println(emp1 instanceof Help_able);
//    System.out.println(emp1 instanceof Test1);
    System.out.println(o instanceof Teacher);
    System.out.println(emp1 instanceof Object);


//    Help_able h = new Teacher();
//    h.help();
//    emp1.help();
//
//    emp1.work();
//    emp2.work();
//    emp3.work();
  }
}

abstract class Employee implements Help_able {

  void sleep() {
    System.out.println("Employee sleeps");
  }

  abstract void work();

}

class Teacher extends Employee3 implements Help_able {

  public void help() {
    System.out.println("Teacher helps");
  }

  void work() {
    System.out.println("Teacher works");
  }
}

class Driver extends Employee3 implements Help_able {

  public boolean nazvaniyeMashini;

  public void help() {
  }

  void work() {
    System.out.println("Driver works");
  }
}

class Doctor extends Employee3 implements Help_able {

  public void help() {
  }

  void work() {
    System.out.println("Doctor works");
  }
}

interface Help_able {

  void help();
}