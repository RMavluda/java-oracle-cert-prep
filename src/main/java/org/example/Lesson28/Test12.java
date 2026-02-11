package org.example.Lesson28;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test12 {

  public static void main(String[] args) {
//    Animal animal = new Mouse();


  }

}

class Animal {

  Animal() throws FileNotFoundException, IndexOutOfBoundsException {
  }
}

class Mouse extends Animal {

  Mouse() throws Exception, IOException, ArrayIndexOutOfBoundsException {
    super();
  }
}

class Human {

  String name;
  int age;

  Human(String name, int age) throws Exception, FileNotFoundException, IndexOutOfBoundsException {

    if (age < 0) {
      throw new Exception("nekorrektniy vozrast");
    }
    this.name = name;
    this.age = age;
  }


}