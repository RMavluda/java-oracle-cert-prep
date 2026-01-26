package org.example.Lesson26;

public class Test5 {
    // quyida Initialized block
    Test5(){
        System.out.println("Eto konstruktor");
    }

    {
        System.out.println("Eto init block3");
    }

    {
        System.out.println("Eto init block1");
    }

    {
        System.out.println("Eto init block2");
    }


    String s1;
    {
        s1 = "ok";
        s2 = "okak";
        System.out.println("Hello");
        int a = 5;
        System.out.println(s1);
//        System.out.println(s2);
//        ekrancha chop etish uchun avval ushbu o`zgaruvchini e`lon qilgan bo`lishimiz kerak
    }
    String s2;
/*
*
* Initialized block qachonki ushbu klassdan obyekt yaratilganida har safar ishga tushadi
*
* */
    public static void main(String[] args) {
        Test5 t = new Test5();
        Test5 t1 = new Test5();
    }
}
