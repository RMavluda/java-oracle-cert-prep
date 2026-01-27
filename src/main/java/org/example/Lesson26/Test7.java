package org.example.Lesson26;

public class Test7 {
    public static void main(String[] args) {
//        Animal a = new Animal();
        Lion l = new Lion();
    }
}

class Animal {
    Animal() {
        System.out.println("Constructor of Animal");
    }

    static {
        System.out.println("Static initializer block in Animal");
    }

    {
        System.out.println("Non-static initializer block in Animal");
    }
}

class Mammal extends Animal {
    Mammal() {
        System.out.println("Constructor of Mammal");
    }

    static {
        System.out.println("Static initializer block in Mammal");
    }

    {
        System.out.println("Non-static initializer block in Mammal");
    }
}

class Lion extends Mammal {
    Lion() {
        System.out.println("Constructor of Lion");
    }

    static {
        System.out.println("Static initializer block in Lion");
    }

    {
        System.out.println("Non-static initializer block in Lion");
    }
}