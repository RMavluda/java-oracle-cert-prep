package org.example.Lesson26;

public class Test5 {
    // quyida Initialized block
    {
        System.out.println("Eto init block3");
    }

    Test5(){
        System.out.println("Eto konstruktor 1");
    }

    Test5(int a){
        this();
        System.out.println("Eto konstruktor2");
    }


    {
        System.out.println("Eto init block1");
    }

    static{
        System.out.println("STATIC init block 1");
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

    {
        System.out.println("Eto init block2");
    }

    static{
        System.out.println("STATIC init block 2");
    }

/*
*
* Initialized block qachonki ushbu klassdan obyekt yaratilganida har safar ishga tushadi
*
* */
    public static void main(String[] args) {
        Test5 t1 = new Test5();
        Test5 t2 = new Test5(5);
    }
}
