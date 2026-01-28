package org.example.Lesson27;

import java.io.*;

public class Test3 {
    public static void main(String[] args) throws Exception {
        File f = new File("test3.txt");
        FileInputStream fis = new FileInputStream(f);
//        System.out.printf("File nayden");
        fis.read();
//        FileOutputStream fos = new FileOutputStream("test3.txt");
//        fos.write("1Hello".getBytes());

    }
}
