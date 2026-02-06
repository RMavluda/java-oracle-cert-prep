package org.example.Lesson28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test2 {
    void abc() throws FileNotFoundException {
        try {
            File f = new File("test10.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception poyman i nemnogo obrabotan");
            throw e;
        } finally {
            System.out.println("Eto block finally");
        }
    }

    void method() {
        try {
            abc();
        } catch (FileNotFoundException e) {
            System.out.println("Exception poyman i polnostyu obrabotan");
        }
    }


//    void def() throws FileNotFoundException {
//        try {
//            int[] array = {1, 2, 3, 4};
//            System.out.println(array[5]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception poyman i nemnogo obrabotan");
//            throw e;
//        } finally {
//            System.out.println("Eto block finally");
//        }
//    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        t.method();
    }
}
