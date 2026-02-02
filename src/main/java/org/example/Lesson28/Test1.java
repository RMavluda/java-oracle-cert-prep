package org.example.Lesson28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test1 {
    static StringBuilder abc() {
        StringBuilder a = new StringBuilder("Hello");
        try {
            File f = new File("test.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception poyman");

            System.out.println("peremennaya a v catch bloke " + a);
            return a;
        } finally {
            a.append("???");
            System.out.println("eto block finally");
            System.out.println("peremennaya a v finally bloke " + a);
        }

        return a;
//        ---> unreacheable statement
//        try&catch da yoki finallyda return yozilmasagina yozish mumkin
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}
