package org.example.Lesson23;

public class Test4 {

  // nomlanishi bir xil argumentlari xar xil bo`lgani uchun quyidagilar overloaded method hisobalnadi
  void abc(Animal a) {
    System.out.println("A");
  }

  void abc(Mouse m) {
    System.out.println("M");
  }

  public static void main(String[] args) {
    Test4 t = new Test4();
    Animal an = new Mouse();
    t.abc(an);
  }
}

class Animal {

  void getName() {
    System.out.println("Animal");
  }
}

class Mouse extends Animal {

  void getName() {
    System.out.println("Mouse");
  }
}
