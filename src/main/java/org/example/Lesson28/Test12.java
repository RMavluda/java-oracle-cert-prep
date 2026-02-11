package org.example.Lesson28;

import java.io.IOException;

public class Test12 {

  public static void main(String[] args) {
    Animal animal = new Mouse();
    try {
      animal.run();
    }catch(IOException e){
      System.out.println("Exception is catch: " + e);
    }

    }

}

class Animal{
  void run()throws IOException{
    System.out.println("Animal runs");
  }
}

class Mouse extends Animal{
  void run() {
    System.out.println("Mouse runs");
  }
}