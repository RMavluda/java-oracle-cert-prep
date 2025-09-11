package org.example.Homework.Lesson_22;

public class StudentT {

  private StringBuilder name;
  private int course;
  private int grade;

  public StringBuilder getName() {
    StringBuilder name2 = new StringBuilder(name); //Important statement
    return name2;
  }

  public void setName(StringBuilder name2) {
    if (name2.length() > 3) {
      this.name = name2;
    }
  }

  public int getCourse() {
    return course;
  }

  public void setCourse(int course) {
    if (course >= 1 && course < 5) {
      this.course = course;
    }
  }

  public int getGrade() {
    return grade;
  }

  public void setGrade(int grade) {
    if (grade >= 1 && grade < 11) {
      this.grade = grade;
    }
  }

  public void showInfo() {
    System.out.println(
        "Name: " + getName().toString() + "\nCourse: " + getCourse() + "\nGrade: " + getGrade());
  }
}

class TestStudent {

  public static void main(String[] args) {
    StudentT s1 = new StudentT();
    StringBuilder sb1 = new StringBuilder("Ivan");
    s1.setName(sb1);
    s1.setCourse(2);
    s1.setGrade(7);
    s1.showInfo();
  }
}