package org.example.Lesson03;

public class Test6 {
public static void main(String[] args){
  int a = 10;
  int b = 3;
  int c = ++a - b*2; // 11 - 6
  System.out.println(c);
  int d = (a-- - b)*2; // (11-3)*2=18
  System.out.println(d);

  System.out.println();

  char ch = 'a'; //ch = 97
  int i = 10;
  System.out.println(i%ch);
  int i2 = c;
  System.out.println(i2/i);
//  short s = c; ERROR
//  chunki char diapazoni short diapazonidan katta
}
}
