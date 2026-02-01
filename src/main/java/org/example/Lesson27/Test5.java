package org.example.Lesson27;

public class Test5 {
    static void abc() {
        System.out.println("Rabotayet method abc");
        abc();
    }

    public static void main(String[] args) {
        try {
            abc();
        } catch (StackOverflowError e) {
            System.out.println("Error poyman");
        }
    }
}
/*
 * Errorlarni try catch orqali ishlash to`g`ri emas
 * */