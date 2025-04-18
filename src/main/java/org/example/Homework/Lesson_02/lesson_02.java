package org.example.Homework.Lesson_02;

import java.util.Scanner;

public class lesson_02 {

  public static void main(String[] args) {

    System.out.println();
    System.out.println("Task 1:");
    byte b1 = 12;
    byte b2 = 0b1100;
    byte b3 = 014;
    byte b4 = 0xc;
    System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);

    short s1 = 1300;
    short s2 = 0b10100010100;
    short s3 = 02424;
    short s4 = 0x514;
    System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

    int i1 = 0;
    int i2 = 0b0;
    int i3 = 00;
    int i4 = 0x0;
    System.out.println(i1 + " " + i2 + " " + i3 + " " + i4);

    long l1 = 123456789L;
    long l2 = 0b0111_0101_1011_1100_1101_0001_0101L;
    long l3 = 0726_746_425L;
    long l4 = 0x75B_CD15L;
    System.out.println(l1 + " " + l2 + " " + l3 + " " + l4);

    System.out.println();
    System.out.println("Task 2:");

    float f1 = 1;
    float f2 = 0.99F;
    float f3 = 1.08f;
    System.out.println(f1 + " " + f2 + " " + f3);

    double d1 = 4.76;
    double d2 = 23.7D;
    double d3 = 5.6d;
    System.out.println(d1 + " " + d2 + " " + d3);

    boolean bool1 = true;
    boolean bool2 = false;
    System.out.println(bool1 + " " + bool2);

    System.out.println();
    System.out.println("Task 3:");

    Scanner in = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int n = in.nextInt();
    System.out.println("Enter " + n + " characters separated by a space");
    for(int i = 0; i < n; i++){
      char ch = in.next().charAt(0);
      System.out.print(ch + " ");
    }
  }
}
