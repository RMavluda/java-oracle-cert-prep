package org.example.Lesson27;

public class Test1 {

    public static void main(String[] args) {
        Animal an = new Tiger();
        System.out.println(an.a); //output iz klassa Animal --> compile time
        System.out.println(an.b); //output iz klassa Animal --> compile time
        an.abc(); //output iz klassa Tiger --> run time
        an.def(); //output iz klassa Animal --> compile time.
        // static method lar override qilinmaydi
        // child classdagisi hiding bo`ladi
        // shu sababli metod reference typedagi method chaqiriladi
    }
}

class Animal {
    int a = 5;
    static int b = 10;

    void abc() {
        System.out.println("non static method iz klassa Animal");
    }

    static void def() {
        System.out.println("Static method iz klassa Animal");
    }
}

class Tiger extends Animal {
    int a = 15;
    static int b = 20;

    void abc() {
        System.out.println("non static method iz klassa Tiger");
    }

    static void def() {
        System.out.println("Static method iz klassa Tiger");
    }
}