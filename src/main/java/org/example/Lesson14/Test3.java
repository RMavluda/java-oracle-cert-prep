package org.example.Lesson14;

public class Test3 {

  public static void main(String[] args) {

    for (int i = 2; i < +30; i = i + 2) {
      System.out.println(i);
    }
    int j = 10;
    if (false) {
      System.out.println("Menshe 3-x");
    }
  }

}

/*java siklda unreachable statements yozishga ruxsat bermaydi
*     for (int i = 2; false; i = i + 2) { yoki     for (int i = 2; 3 < 2; i = i + 2) {
* kabilar compiler error hisoblanadi
*
* unreachable statements if da qoidadan istisno hisoblanadi
*
* */