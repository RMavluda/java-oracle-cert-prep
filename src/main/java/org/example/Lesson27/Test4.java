package org.example.Lesson27;

import java.io.*;

public class Test4 {

    void abc() throws FileNotFoundException {
        File f = new File("test8.txt");
//        try {
        FileInputStream fis = new FileInputStream(f);
//            fis.read();
        System.out.println("Have a good day");
//        } catch (FileNotFoundException e) { // tutib olish kerak bo`lgan exception turi
//            System.out.println("abc ==> Exception tutib olindi -----> " + e);
//        }
    }

    void ghi() {
        String s = null;
        System.out.println(s.length());
    }

    void def() throws FileNotFoundException {
        System.out.println("Hello");
        try {
            abc();
        } catch (FileNotFoundException e) {
            System.out.println("def ==> Exception tutib olindi -----> " + e);
        }

        /*
         * try catch bilan ishlansa throws orqali exceptionni ko`rsatish shart emas
         * */
    }


    public static void main(String[] args) throws FileNotFoundException {
        Test4 t = new Test4();
//        try {
        t.def();
//        }catch(FileNotFoundException e){
//            System.out.println("main ==> Exception tutib olindi -----> " + e);
//        }
        t.ghi();
//        File f = new File("test4.txt");
//        try {
//            FileInputStream fis = new FileInputStream(f);
//            fis.read();
//            System.out.println("Have a good day");
//        } catch (FileNotFoundException e) { // tutib olish kerak bo`lgan exception turi
//            System.out.println("Exception tutib olindi -----> " + e);
//        }
//        catch(IOException e){
//            System.out.println("Exception tutib olindi -----> " + e);
//        }
//        catch (
//                NullPointerException e) { // aslida RunTimeExceptionlarni catch orqali yozish da mano yo`q, yozish tavsiya qilinmidi
//            System.out.println("Exception tutib olindi -----> " + e);
//        } finally {
//            System.out.println("bu finally block");
//        }

//        System.out.println("Ushbu code ortiq exception bilan aloqador emas");
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