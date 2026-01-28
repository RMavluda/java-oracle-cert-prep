package org.example.Lesson27;

import java.io.*;

public class Test4 {
    public static void main(String[] args) {
        File f = new File("test4.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Have a good day");
        } catch (FileNotFoundException e) { // tutib olish kerak bo`lgan exception turi
            System.out.println("Exception tutib olindi -----> " + e);
        } catch (
                NullPointerException e) { // aslida RunTimeExceptionlarni catch orqali yozish da mano yo`q, yozish tavsiya qilinmidi
            System.out.println("Exception tutib olindi -----> " + e);
        } finally {
            System.out.println("bu finally block");
        }

        System.out.println("Ushbu code ortiq exception bilan aloqador emas");
    }
}

/*
Class Hierarchy:
Object
 └── Throwable
      ├── Exception
      │    ├── RuntimeException
      │    │     └── NullPointerException, ArithmeticException, ...
      │    └── IOException, SQLException, ...
      └── Error
            └── OutOfMemoryError, StackOverflowError, ...
*/