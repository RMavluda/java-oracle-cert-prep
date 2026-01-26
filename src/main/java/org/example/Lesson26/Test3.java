package org.example.Lesson26;

public class Test3 {
    void abc(int i) {
        System.out.println("int");
    }

    void abc(byte i) {
        System.out.println("byte");
    }

    void abc(long i) {
        System.out.println("long");
    }

    void def(Object o){
        System.out.println("Object");
    }

    void def(String s){
        System.out.println("String");
    }

//    void ghi(int a, int b){
//        System.out.println("hello 1");
//    }

//    void ghi(long a, long b){
//        System.out.println("hello 2");
//    }

//    void ghi(Integer a, Integer b){
//        System.out.println("hello 3");
//    }

    void ghi(int ... a){
        System.out.println("hello 4");
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.abc(10);
//        auto parametrida int qabul qiuvchi abc metodi ishlidi. chunki abc default int typeda
        t.abc((Byte.valueOf((byte) 5)));
//        yuqoridagi shaklda qilish kerak, yoki parametri int bo`lgan abc methodni olib tashlash kerak
        t.def("hello");
//        default String type da bo`ladi, agar parametrida String type bo`lmasa, Object hisoblanadi
        t.ghi(1, 2);
/*        1. java eng birinchi bo`lib eng ko`p to`g`ri keladigan type moslikni qidiradi --> int
        2. primitive type larda o`zidan katta type ni, reference typelarda parent class ni qidiradi --> long or Object
        3. autoboxing parametrli metodni qidiradi
        4. parametri Varargs bo`lgan metodni qidiradi*/

    }
}
