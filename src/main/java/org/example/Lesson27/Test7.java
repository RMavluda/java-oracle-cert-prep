package org.example.Lesson27;

import java.io.*;

public class Test7 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("");
        try {
            File f = new File("test9.txt");
            System.out.println("obyekt file sozdalsya");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Stream sozdalsya");
            int counter = 0;
            while (true) {
                counter++;
                result.append(fis.read());
                System.out.println("Informatsiya chitayetsya");
                if (counter == 3) {
                    fis.close();
                }
            }
        }
//        catch(FileNotFoundException e){
//            System.out.println("Exception 1");
//        }
        /*
         * IOException ni o`zi yetarli
         * chunki FileNotFound exception IOExceptionning parent class i hisoblanadi
         * */ catch (IOException e) {
            System.out.println("Exception 2");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }
}
