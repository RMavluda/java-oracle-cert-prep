package org.example.Lesson22;

public class Chelovek {

  final String pol;

  Chelovek(String pol) {
    this.pol = pol;
  }

  private boolean clever;

  public boolean isClever() {
    return clever;
  }

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private int age;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  private int height;

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    if (height > 0) {
      this.height = height;
    }
  }
}

class Test {

  public static void main(String[] args) {
    Chelovek ch = new Chelovek("male");
    ch.setName("Petya");
    ch.setAge(25);
    ch.setHeight(80);
    System.out.println(ch.getName());
    System.out.println(ch.getAge());
    System.out.println(ch.getHeight());
    ch.setHeight(-20);
    System.out.println(ch.getHeight());
  }
}