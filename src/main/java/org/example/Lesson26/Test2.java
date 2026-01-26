package org.example.Lesson26;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);

//        Long l = 50l;
//        listdagi 0= element int primitive type ga konvertatsiya bo`ladi, unboxing
        int a = list.get(0);
        System.out.println(a);
//        Integer b = new Integer(10);
//        darsda ko`rsatilgan yuqoridagi usul java 9 dan keyin eskirgan hisoblanadi, shu sababli IntelliJ da bu error sifatida ko`rsatildi
//        hozirda Integer b = 10 yoki Integer b = Integer.valueOf(10) dan foydalanish mumkin
        Number b = 10;
        int c = (Integer) b;

        /*
         * byte, short, int, long, float, double -> Number class avlodlari hisoblanadi */
        switch (c) {
        }

        String s1 = "50";
        String s2 = "true";
        String s3 = "3.14";
        int i1 = Integer.parseInt(s1);
        Boolean b1 = Boolean.parseBoolean(s2);
        double d3 = Double.parseDouble(s3);
        System.out.println(i1);
        System.out.println(b1);
        System.out.println(d3);

        Integer i3 = Integer.valueOf(10);
        Double d2 = Double.valueOf(s3);
/*        Byte b10 = new Byte((byte)5);
        yuqoridagi usul ham java 9 dan keyin eskirgan hisoblanadi
        hozirda
        Byte b10 = 5;
        yoki
        Byte b10 = Byte.valueOf((byte)5);
        lardan foydalanish tavsiya etiladi*/
        Byte b10 = 5;
/*        Integer i6 = new Integer(6);
        java 9 dan boshlab eskirgan usul*/
        Integer i6 = 6;

//        System.out.println(b10 == i6);
        /*
         * yuqoridagi 2 ta o`zgaruvchi boshqa boshqa typelarda bo`lganligi uchun compile bu shaklda yozishga ruhsat bermidi*/
        System.out.println(b10.equals(i6));
        //doimo false,
        // wrapper class metodi equals avvaliga obyektlar bir xil typeda mi yoki yo`q shuni tekshriadi.
        // agar bir xil bo`lmasa shu joydan false qaytadi

    }
}
