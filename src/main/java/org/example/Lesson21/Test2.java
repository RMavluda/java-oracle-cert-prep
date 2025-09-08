package org.example.Lesson21;

public class Test2 {

  public static void main(String[] args) {
    String s1, s2;
    s2 = new String("privet");
    s1 = new String("poka");
    s1 = s2;
    String s3 = s1;
    s1 = null;
    /*
    * garbage*/
  }

}

/*
* 1) class default access modifier bo`lsayu, unda public elementlar mavjud bo`lsa ham
* ushbu elementlar boshqa class larda ko`rinmidi
*
* 2) class public bo`lsada, constructor default bo`lsa
* bpshqa class da obyekt yaratib bo`lmidi
*
* 3) access modifier default constructor, boshqa classda chaqirilganda
* o`zining class idagi acces modifier bilan bir xil bo`ladi
*
* 4)
* class Test{
*   public Test(){
*     this();
*   }
* }
* rekursiyali constructor ga ruhsat berilmidi
* chunki obyekt yaratilganda cheksizlik bo`lib tugamidi
*
* */