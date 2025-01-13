package org.example.Lesson02;

public class PrimitiveDataTypes {

  public static void main(String[] args) {
    byte b1 = 10;
    byte b2 = 20;
    byte b3 = 100;

    short s1 = 5;
    short s2 = -10;
    short s3 = 0;

    int i = 500;

    long l1 = 100000;
    long l2 = 1000000000000l;
    long l3 = 51;

    float f1 = 3.14F;
    float f2 = 2.5f;
    float f3 = 22; // 22 => type int; 'f' is not written because the type int is included in the type float

    double d1 = 3.9; // can also be written without the 'd' symbol.
    double d2 = 5.5D;
    double d3 = -5.5d;

    char c1 = 'a';
    char c2 = 'A';
    char c3 = '8';
    char c4 = ' '; // space is also a character
    char c5 = 500;  // c5(in Decimal - 10) means it is equal to the 300th character in UNICODE
    char c6 = '\u0500'; // c6(in Hexadecimal - 16), must write 4 numbers, which is also equal to a character in UNICODE
//    char c = 'ab';  // the char type consists of a single character enclosed in single quotes

    boolean bool1 = true;
    boolean bool2 = false;

    int a1 = 60; // in decimal numeral system
    int a2 = 0B111100; // binary numeral system (2)
    int a3 = 0b111100; // the logic does not change
    int a4 = 074; // by prefixing it with '0', the compiler understands that it is a number in the octal numeral system (8)
    int a5 = 0x3C; // by prefixing it with '0x', the compiler understands that it is a number in the hexadecimal numeral system (16)
    int a6 = 0x3c; // the logic does not change
    int a7 = 1_000_000_0___________0___0; // underscore => added since java-7 for easy of reading

    System.out.println(a6);
  }
}
