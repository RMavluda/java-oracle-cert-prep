package org.example.Lesson26;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car("red", "V4");
//        Car c2 = new Car("red", "V4");
        Car c2 = null;
        Car c3 = new Car("black", "V8");

//        System.out.println(c1 == c2);
//        System.out.println(c1.equals(c3));

        ArrayList<Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        Car c4 = new Car("black", "V8");
//        System.out.println(list.contains(c4));
//        System.out.println(c1.equals(c2));
        System.out.println(c3.toString());
        System.out.println(list);
    }
}

class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

//    public boolean equals(Car c) {
//        return (color.equals(c.color) && engine.equals(c.engine));
//    }


    public boolean equals(Object obj) {
        if (obj instanceof Car) {
//            return (color.equals(obj.color) && engine.equals(obj.engine));
            Car c2 = (Car) obj;
            System.out.println("if test");
            return (color.equals(c2.color) && engine.equals(c2.engine));
        } else return false;
    }

    public String toString() {
        return "Car: color -> " + color + ", engine -> " + engine;
    }
}

/*
public boolean equals(Object o){
    return (this == o);
}*/
