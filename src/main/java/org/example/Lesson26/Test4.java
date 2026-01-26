package org.example.Lesson26;

public class Test4 {
    static void abc(String s){
        System.out.println("A");
    }
    static void abc(String ... s){
        System.out.println("B");
    }
    static void abc(Object s){
        System.out.println("C");
    }
    static void abc(String s1, String s2){
        System.out.println("D");
    }

    static void def(Long a){
        System.out.println("E");
    }
    static void def(Long ... a){
        System.out.println("F");
    }

    static void def(long a){
        System.out.println("G");
    }
    static void def(Integer a){
        System.out.println("I");
    }
    static void def(Object a){
        System.out.println("H");
    }

    public static void main(String[] args) {
        Test4 t4 = new Test4();

        t4.abc("ok", "!!!", "567");
        t4.def(50);
        /*
        * int -->
        * 1) 1- bo`lib long ga konvertatsiya bo`ladi
        * 2) agar long mavjud bo`lmasa Integerga
        * 3) agar ikkalasi ham yo`q bo`lsa, long Integerga konvertatsiya bo`la oladi,
        *   demak Integer Objectning child class i, ya`ni Integer bu doimo Object dir.
        *   shu sababli int Object parametrli metod qidiradi
        *
        * !!! hech qachon int -> longa konvertatsiya bo`lib, keyin Long type ga konvertatsiya qilinmidi
        *  chunki bu 2 darajali konvertatsiya hisoblanib, mumkin emas holat*/
    }
}
