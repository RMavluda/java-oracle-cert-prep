package org.example.Lesson19;

public class Test5 {

  public static void main(String[] args) {
    String [] student = {"Ivanov", "Petrov", "Sidorov"};
    String [] exams = {"mat analiz", "filosofiya"};
    for(String s1 : student){
      for(String s2 : exams){
        System.out.println(s1 + " " + s2);
      }
    }
  }
}
