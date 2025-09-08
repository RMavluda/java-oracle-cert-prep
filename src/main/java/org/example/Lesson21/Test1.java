package org.example.Lesson21;

public class Test1 {

  public static void main(String[] args) {
//    int a = 4;
//    System.out.println(a < 4 ? 7 : "privet");
    /*
     * ternary operation da exception lar bir xil type da bo`lishi shart emas
     * */
    /*
     * int b = (a < 7) ? 7 : "privet";
     * lekin bu ko`rinishda yozishningiloji yo`q
     * chunki String ni int type ga joylashga urunilyapti
     *  */
    int a = 5;
    int b = 5;
    int c = (a < 6) ? a++ : b++;
    System.out.println("a = " + a);
    System.out.println("b = " + b);


  }

}
