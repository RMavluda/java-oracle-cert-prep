package org.example.Lesson27;

public class Test2_1 {
    void abc() throws NullPointerException {
        String s = null;
        System.out.println(s.length()); // NullPointerException - NPE
    }

    public static void main(String[] args) {
        int array[] = {1, 4, 0};
        if (2 >= 0 && 2 < array.length) {
            System.out.println(array[2]); // IndexOutOfBoundException
        }
        System.out.println(array[5]); // IndexOutOfBoundException
        System.out.println("hello");
    }
}
