package org.example.Lesson27;

import java.io.*;

public class Test4 {
    // LIFO - last in first out
    void abc() throws FileNotFoundException {
        File f = new File("test8.txt");
        FileInputStream fis = new FileInputStream(f);
    }

    void def() throws FileNotFoundException {
        abc();
    }


    public static void main(String[] args) {
        Test4 t = new Test4();
        try {
            t.def();
        } catch (FileNotFoundException e) {
            IOException e1 = e;
            System.out.println("Exception: " + e);
//            System.out.println(e);
//            System.out.println("Message: " + e.getMessage());
            e.printStackTrace();
        }
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