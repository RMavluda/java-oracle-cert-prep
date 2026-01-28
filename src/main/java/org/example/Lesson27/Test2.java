package org.example.Lesson27;

public class Test2 {
    public static void main(String[] args) {
        int array[] = {1, 4, 0};
        String s = null;
        System.out.println(s.length()); // NullPointerException - NPE
        System.out.println(array[5]); // IndexOutOfBoundException
        System.out.println("hello");
    }
}
