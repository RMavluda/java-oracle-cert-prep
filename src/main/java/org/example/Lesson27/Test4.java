package org.example.Lesson27;

import java.io.*;

public class Test4 {
    // LIFO - last in first out
    void abc() throws FileNotFoundException {
        File f = new File("test8.txt");
        FileInputStream fis = new FileInputStream(f);
        System.out.println("Have a good day");
    }

    void ghi() {
        String s = null;
        System.out.println(s.length());
    }

    void def() throws FileNotFoundException {
        System.out.println("Hello");
            abc();
    }


    public static void main(String[] args) throws FileNotFoundException {
        Test4 t = new Test4();
        t.def();
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