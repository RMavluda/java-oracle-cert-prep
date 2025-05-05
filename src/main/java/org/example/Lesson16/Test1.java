package org.example.Lesson16;

public class Test1 {

  public static void main(String[] args) {

    String s1 = new String("Hello");

    int a = s1.length();
    System.out.println(a);

    char c = s1.charAt(3);
    /*
    * noto`g`ri index yozilsa exception bo`ladi
    * */
    System.out.println(c);

    int i1 = s1.indexOf('e');
    System.out.println(i1);

    int i2 = s1.indexOf("lo");
    System.out.println(i2);

    int i3 = s1.indexOf("z");
    System.out.println(i3);

    String s2 = "abcdefgabcd";
    int i4 = s2.indexOf("a");
    System.out.println(i4);

    int i5 = s2.indexOf("g", 5); //5-index dan boshlab 'e' ni qidiradi
    System.out.println(i5);

    boolean i6 = s2.startsWith("abc"); // => ushbu satr "abc" bilan boshlanadimi ?
    System.out.println(i6);

    boolean i7 = s2.startsWith("fg", 5);
    System.out.println(i7);

    boolean i8 = s2.endsWith("h");
    System.out.println(i8);


  }


}
